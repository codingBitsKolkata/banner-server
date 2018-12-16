package com.orastays.banner.bannerserver.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orastays.banner.bannerserver.helper.BannerConstant;
import com.orastays.banner.bannerserver.helper.Util;
import com.orastays.banner.bannerserver.model.BannerModel;
import com.orastays.banner.bannerserver.model.ResponseModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
@Api(value = "Banner", tags = "Banner")
public class BannerController extends BaseController {
	
private static final Logger logger = LogManager.getLogger(BannerController.class);
	
	@PostMapping(value = "/fetch-banners", produces = "application/json")
	@ApiOperation(value = "Fetch Banner", response = ResponseModel.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"),
			@ApiResponse(code = 201, message = "Please Try after Sometime!!!"),
			@ApiResponse(code = 202, message = "Token Required"),
			@ApiResponse(code = 203, message = "Token Expires!!!Please login to continue..."),
			@ApiResponse(code = 301, message = "Please Enter Name"),
			@ApiResponse(code = 302, message = "Invalid Name"),
			@ApiResponse(code = 308, message = "Please Enter Email ID"),
			@ApiResponse(code = 309, message = "Invalid Email ID"),
			@ApiResponse(code = 310, message = "Email ID Already Registered") })
	public ResponseEntity<ResponseModel> fetchBanners() {
	
		if (logger.isInfoEnabled()) {
			logger.info("fetchBanners -- START");
		}

		ResponseModel responseModel = new ResponseModel();
		Util.printLog(null, BannerConstant.INCOMING, "Fetch Banner", request);
		try {
			List<BannerModel> bannerModels = bannerService.fetchBanners();
			responseModel.setResponseBody(bannerModels);
			responseModel.setResponseCode(messageUtil.getBundle(BannerConstant.COMMON_SUCCESS_CODE));
			responseModel.setResponseMessage(messageUtil.getBundle(BannerConstant.COMMON_SUCCESS_MESSAGE));
		} catch (Exception e) {
			if (logger.isInfoEnabled()) {
				logger.info("Exception in Fetch Banner -- "+Util.errorToString(e));
			}
			responseModel.setResponseCode(messageUtil.getBundle(BannerConstant.COMMON_ERROR_CODE));
			responseModel.setResponseMessage(messageUtil.getBundle(BannerConstant.COMMON_ERROR_MESSAGE));
		}
		
		Util.printLog(responseModel, BannerConstant.OUTGOING, "Fetch Banner", request);

		if (logger.isInfoEnabled()) {
			logger.info("fetchBanners -- END");
		}
		
		if (responseModel.getResponseCode().equals(messageUtil.getBundle(BannerConstant.COMMON_SUCCESS_CODE))) {
			return new ResponseEntity<>(responseModel, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(responseModel, HttpStatus.BAD_REQUEST);
		}
	}
}
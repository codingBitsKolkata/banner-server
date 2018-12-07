package com.orastays.banner.bannerserver.converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.util.CollectionUtils;

import com.orastays.banner.bannerserver.entity.BannerLinkEntity;
import com.orastays.banner.bannerserver.helper.Util;
import com.orastays.banner.bannerserver.model.BannerLinkModel;

public class BannerLinkConverter extends CommonConverter implements BaseConverter<BannerLinkEntity, BannerLinkModel> {

	private static final long serialVersionUID = -7824154040021632569L;
	private static final Logger logger = LogManager.getLogger(BannerLinkConverter.class);

	@Override
	public BannerLinkEntity modelToEntity(BannerLinkModel m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BannerLinkModel entityToModel(BannerLinkEntity e) {

		if (logger.isInfoEnabled()) {
			logger.info("entityToModel -- START");
		}

		BannerLinkModel bannerLinkModel = new BannerLinkModel();
		bannerLinkModel = (BannerLinkModel) Util.transform(modelMapper, e, bannerLinkModel);

		if (logger.isInfoEnabled()) {
			logger.info("entityToModel -- END");
		}

		return bannerLinkModel;
	}

	@Override
	public List<BannerLinkModel> entityListToModelList(List<BannerLinkEntity> es) {

		if (logger.isInfoEnabled()) {
			logger.info("entityListToModelList -- START");
		}

		List<BannerLinkModel> bannerLinkModels = null;
		if (!CollectionUtils.isEmpty(es)) {
			bannerLinkModels = new ArrayList<>();
			for (BannerLinkEntity bannerLinkEntity : es) {
				bannerLinkModels.add(entityToModel(bannerLinkEntity));
			}
		}

		if (logger.isInfoEnabled()) {
			logger.info("entityListToModelList -- END");
		}

		return bannerLinkModels;
	}
}

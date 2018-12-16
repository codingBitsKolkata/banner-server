package com.orastays.banner.bannerserver.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
@JsonInclude(Include.NON_NULL)
public class BannerModel extends CommonModel {

	@JsonProperty("bannerId")
	private String bannerId;
	
	@JsonProperty("bannerImgUrl")
	private String bannerImgUrl;
	
	@JsonProperty("bannerDescription")
	private String bannerDescription;
	
	@JsonProperty("bannerLink")
	private String bannerLink;
	
	@JsonProperty("bannerCategory")
	private BannerCategoryModel bannerCategoryModels;
}

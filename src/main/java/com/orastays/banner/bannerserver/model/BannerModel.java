package com.orastays.banner.bannerserver.model;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
public class BannerModel extends CommonModel {

	private String bannerId;
	private String bannerImgUrl;
	private String bannerDescription;
	private BannerCategoryModel bannerCategoryModels;
	private List<BannerLinkModel> bannerLinkModels;
}

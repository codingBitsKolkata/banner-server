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
public class BannerLinkModel extends CommonModel {

	private String bannerLinkId;
	private BannerModel bannerModels;
	private String bannerLink;
	private List<BannerLogModel> bannerLogModels;
}

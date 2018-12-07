package com.orastays.banner.bannerserver.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
public class BannerLogModel extends CommonModel {

	private String bannerLogId;
	private BannerModel bannerModels;
	private String bannerStartDatetime;
	private String bannerEndDatetime;
}

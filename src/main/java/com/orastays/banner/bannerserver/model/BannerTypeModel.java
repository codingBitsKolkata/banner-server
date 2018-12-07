package com.orastays.banner.bannerserver.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
public class BannerTypeModel extends CommonModel {

	private String bannerTypeId;
	private String bannerTypeName;
}

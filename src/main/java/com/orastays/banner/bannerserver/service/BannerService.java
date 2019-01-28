package com.orastays.banner.bannerserver.service;

import java.util.List;

import com.orastays.banner.bannerserver.model.BannerModel;

public interface BannerService {
	
	//List<BannerModel> fetchBanners();
	List<BannerModel> fetchBannersByPageName(String pageName);
}
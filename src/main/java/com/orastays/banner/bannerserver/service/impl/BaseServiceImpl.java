package com.orastays.banner.bannerserver.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.orastays.banner.bannerserver.converter.BannerConverter;
import com.orastays.banner.bannerserver.dao.BannerDAO;

public abstract class BaseServiceImpl {

	@Value("${entitymanager.packagesToScan}")
	protected String entitymanagerPackagesToScan;
	
	@Autowired
	protected BannerDAO bannerDAO;
	
	@Autowired
	protected BannerConverter bannerConverter;
}

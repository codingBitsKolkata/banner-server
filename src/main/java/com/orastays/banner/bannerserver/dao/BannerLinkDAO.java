package com.orastays.banner.bannerserver.dao;

import org.springframework.stereotype.Repository;

import com.orastays.banner.bannerserver.entity.BannerLinkEntity;

@Repository
public class BannerLinkDAO extends GenericDAO<BannerLinkEntity, Long> {

	private static final long serialVersionUID = -2756945253430636321L;

	public BannerLinkDAO() {
		super(BannerLinkEntity.class);
	}
}

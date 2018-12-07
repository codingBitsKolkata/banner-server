package com.orastays.banner.bannerserver.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "master_banner")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BannerEntity extends CommonEntity {

	private static final long serialVersionUID = -7664579667388559362L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "banner_id")
	private Long bannerId;

	@Column(name = "banner_img_url")
	private String bannerImgUrl;

	@Column(name = "banner_description")
	private String bannerDescription;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE })
	@JoinColumn(name = "banner_category_id", nullable = false)
	private BannerCategoryEntity bannerCategoryEntity;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bannerEntity", cascade = { CascadeType.ALL })
	private List<BannerLogEntity> bannerLogEntity;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bannerEntity", cascade = { CascadeType.ALL })
	private List<BannerLinkEntity> bannerLinkEntity;
	
	@Override
	public String toString() {
		return Long.toString(bannerId);
	}
}

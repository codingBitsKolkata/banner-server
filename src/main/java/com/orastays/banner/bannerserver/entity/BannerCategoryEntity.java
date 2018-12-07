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
@Table(name = "master_banner_category")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BannerCategoryEntity extends CommonEntity {

	private static final long serialVersionUID = -1603058039549861451L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "banner_category_id")
	private Long bannerCategoryId;

	@Column(name = "name")
	private String bannerCategoryName;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE })
	@JoinColumn(name = "banner_type_id", nullable = false)
	private BannerTypeEntity bannerTypeEntity;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bannerCategoryEntity", cascade = { CascadeType.ALL })
	private List<BannerEntity> bannerEntity;
	
	@Override
	public String toString() {
		return Long.toString(bannerCategoryId);
	}
}

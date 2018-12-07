package com.orastays.banner.bannerserver.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "master_banner_link")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BannerLinkEntity extends CommonEntity {

	private static final long serialVersionUID = 7867503097494708548L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "banner_link_id")
	private Long bannerLinkId;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE })
	@JoinColumn(name = "banner_id", nullable = false)
	private BannerEntity bannerEntity;

	@Column(name = "banner_link")
	private String bannerLink;
	
	@Override
	public String toString() {
		return Long.toString(bannerLinkId);
	}
}

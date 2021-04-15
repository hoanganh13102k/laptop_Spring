package com.laptop.ict.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pId;
	
	@Column(name = "PName")
	private String pName;
	
	@Column(name = "CPU")
	private String pCPU;
	
	@Column(name = "RAM")
	private String pRAM;
	
	@Column(name = "ROM")
	private String pROM;
	
	@Column(name = "Screen")
	private String pScreen;
	
	@Column(name = "Image")
	private String pImage;
	
	@Column(name = "Price")
	private String pPrice;
	
	@Column(name = "BrandID")
	private Integer brandId;
	
	@Column(name = "TypeID")
	private Integer typeId;
		

	public Products() {
		super();
	}

	public Products(Integer pId, String pName, String pCPU, String pRAM, String pROM, String pScreen, String pImage,
			String pPrice, Integer brandId, Integer typeId) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pCPU = pCPU;
		this.pRAM = pRAM;
		this.pROM = pROM;
		this.pScreen = pScreen;
		this.pImage = pImage;
		this.pPrice = pPrice;
		this.brandId = brandId;
		this.typeId = typeId;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpCPU() {
		return pCPU;
	}

	public void setpCPU(String pCPU) {
		this.pCPU = pCPU;
	}

	public String getpRAM() {
		return pRAM;
	}

	public void setpRAM(String pRAM) {
		this.pRAM = pRAM;
	}

	public String getpROM() {
		return pROM;
	}

	public void setpROM(String pROM) {
		this.pROM = pROM;
	}

	public String getpScreen() {
		return pScreen;
	}

	public void setpScreen(String pScreen) {
		this.pScreen = pScreen;
	}

	public String getpImage() {
		return pImage;
	}

	public void setpImage(String pImage) {
		this.pImage = pImage;
	}

	public String getpPrice() {
		return pPrice;
	}

	public void setpPrice(String pPrice) {
		this.pPrice = pPrice;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	
	
	
}
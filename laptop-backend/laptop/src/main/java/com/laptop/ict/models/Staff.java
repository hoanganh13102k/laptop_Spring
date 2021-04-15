package com.laptop.ict.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Staff")
public class Staff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer staffId;
	
	@Column(name = "StaffName")
	private String staffName;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "Phone")
	private String phone;
	
	

	public Staff() {
		super();
	}

	public Staff(Integer staffId, String staffName, String address, String phone) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.address = address;
		this.phone = phone;
	}

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	
}

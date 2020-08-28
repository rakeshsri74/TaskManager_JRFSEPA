package com.iiht.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Admin")
@Data
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AdminId")
	private int adminId;
	@Column(name = "AdminName")
	private String adminName;
	@Column(name = "AdminPassword")
	private String adminPassword;
	
}

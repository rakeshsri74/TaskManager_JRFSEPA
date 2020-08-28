package com.iiht.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "NewGroup")
@Data
public class NewGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UserId")
	private int groupId;
	@Column(name = "NewGroup")
	private String newGroup;
	@Column(name = "GroupName")
	private String groupName;
	@Column(name = "Color")
	private String color;
	@Column(name = "Active")
	private String active;
	@Column(name = "Action")
	private String action;
	public int getGroupId() {
		return groupId;
	}
	
	
}

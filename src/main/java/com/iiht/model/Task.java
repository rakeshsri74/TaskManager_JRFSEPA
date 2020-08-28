package com.iiht.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Task")
@Data
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TaskCode")
	private int taskCode;
	@Column(name = "Group")
	private String group;
	@Column(name = "Name")
	private String name;
	@Column(name = "Priority")
	private int priority;
	@Column(name = "TaskStatus")
	private String taskStatus;
	@Column(name = "TaskStartDate")
	private Date taskStartDate;
	@Column(name = "TaskEndDate")
	private Date taskEndDate;
	@Column(name = "TaskCategory")
	private String taskCategory;
	@Column(name = "TaskType")
	private String taskType;
	@Column(name = "TaskColor")
	private String color;
	
	
}

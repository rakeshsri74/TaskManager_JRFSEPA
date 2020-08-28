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
@Table(name = "TaskItem")
@Data
public class TaskItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TaskItemCode")
	private int taskItemCode;
	@Column(name = "TaskName")
	private String name;
	@Column(name = "TaskPriority")
	private int priority;
	@Column(name = "TaskStatus")
	private String taskStatus;
	@Column(name = "TaskStartDate")
	private Date taskStartDate;
	@Column(name = "TaskEndDate")
	private Date taskEndDate;
	@Column(name = "TaskColorCode")
	private String colorCode;
	
	
	
}

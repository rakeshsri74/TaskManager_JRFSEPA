package com.iiht.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "TaskManagerDashboard")
@Data
public class TaskManagerDashboard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TaskManagerId")
	private int taskManagerId;
	@Column(name = "TotalGroup")
	private int totalGroup;
	@Column(name = "TotalTasks")
	private int totalTasks;
	@Column(name = "Completed")
	private int completed;
	@Column(name = "Pending")
	private int pending;
	
	
}

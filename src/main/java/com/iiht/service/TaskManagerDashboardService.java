package com.iiht.service;

import com.iiht.exception.ResourceNotFoundException;
import com.iiht.model.TaskManagerDashboard;

public interface TaskManagerDashboardService {

	public void saveTaskManagerDashboard(TaskManagerDashboard taskManagerDashboard);
	
	public TaskManagerDashboard viewTaskManagerDashboard(int taskManagerId) throws ResourceNotFoundException;
	
	public void updateTaskManagerDashboard(TaskManagerDashboard taskManagerDashboard);
	
}

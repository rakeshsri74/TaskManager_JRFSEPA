package com.iiht.dao;

import java.util.List;

import com.iiht.exception.ResourceNotFoundException;
import com.iiht.model.TaskManagerApp;
import com.iiht.model.TaskManagerDashboard;

public interface TaskManagerDashboardDao {

	public void saveTaskManagerDashboard(TaskManagerDashboard taskManagerDashboard);
	
	public TaskManagerDashboard viewTaskManagerDashboard(int taskManagerId) throws ResourceNotFoundException;
	
	public void updateTaskManagerDashboard(TaskManagerDashboard taskManagerDashboard);
	
}

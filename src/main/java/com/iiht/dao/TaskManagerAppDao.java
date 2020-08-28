package com.iiht.dao;

import java.util.List;

import com.iiht.exception.ResourceNotFoundException;
import com.iiht.model.TaskManagerApp;

public interface TaskManagerAppDao {

	public void saveTaskManagerApp(TaskManagerApp taskManagerApp);
	
	public TaskManagerApp viewTaskManagerApp(int taskManagerAppId) throws ResourceNotFoundException;
	
	public List<TaskManagerApp> viewAllTaskManagerApp();
	
	public void updateTaskManagerApp(TaskManagerApp taskManagerApp);
	
	public void deleteTaskManagerApp(int taskManagerAppId) throws ResourceNotFoundException;
}

package com.iiht.dao;

import java.util.List;

import com.iiht.exception.ResourceNotFoundException;
import com.iiht.model.Task;

public interface TaskDao {

	public void saveNewTask(Task task);
	
	public Task viewTask(int taskCode) throws ResourceNotFoundException;
	
	public List<Task> viewAllTask();
	
	public void updateTask(Task task);
}

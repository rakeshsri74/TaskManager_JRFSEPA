package com.iiht.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.dao.TaskDao;
import com.iiht.exception.ResourceNotFoundException;
import com.iiht.model.Task;

@Service("taskService")
@Transactional(propagation= Propagation.REQUIRED)
@EnableTransactionManagement
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskDao taskDao;
	
	public void saveNewTask(Task task) {
		// TODO Auto-generated method stub

	}

	public Task viewTask(int taskCode) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Task> viewAllTask() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateTask(Task task) {
		// TODO Auto-generated method stub

	}

}

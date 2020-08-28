package com.iiht.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iiht.exception.ResourceNotFoundException;
import com.iiht.model.Task;

@Repository
public class TaskDaoImpl implements TaskDao {

	@Autowired
	private SessionFactory sessionFactory;
	
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

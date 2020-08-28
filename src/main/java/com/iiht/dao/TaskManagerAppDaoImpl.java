package com.iiht.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iiht.exception.ResourceNotFoundException;
import com.iiht.model.TaskManagerApp;

@Repository
public class TaskManagerAppDaoImpl implements TaskManagerAppDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveTaskManagerApp(TaskManagerApp taskManagerApp) {
		// TODO Auto-generated method stub

	}

	public TaskManagerApp viewTaskManagerApp(int taskManagerAppId) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TaskManagerApp> viewAllTaskManagerApp() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateTaskManagerApp(TaskManagerApp taskManagerApp) {
		// TODO Auto-generated method stub

	}

	public void deleteTaskManagerApp(int taskManagerAppId) throws ResourceNotFoundException {
		// TODO Auto-generated method stub

	}

}

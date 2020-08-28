package com.iiht.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iiht.exception.ResourceNotFoundException;
import com.iiht.model.TaskManagerDashboard;

@Repository
public class TaskManagerDashboardDaoImpl implements TaskManagerDashboardDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveTaskManagerDashboard(TaskManagerDashboard taskManagerDashboard) {
		// TODO Auto-generated method stub

	}

	public TaskManagerDashboard viewTaskManagerDashboard(int taskManagerId) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateTaskManagerDashboard(TaskManagerDashboard taskManagerDashboard) {
		// TODO Auto-generated method stub

	}

}

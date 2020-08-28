package com.iiht.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.dao.TaskManagerDashboardDao;
import com.iiht.exception.ResourceNotFoundException;
import com.iiht.model.TaskManagerDashboard;

@Service("taskManagerDashboardService")
@Transactional(propagation= Propagation.REQUIRED)
@EnableTransactionManagement
public class TaskManagerDashboardServiceImpl implements TaskManagerDashboardService {

	@Autowired
	private TaskManagerDashboardDao taskManagerDashboardDao;
	
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

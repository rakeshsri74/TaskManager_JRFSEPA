package com.iiht.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.dao.LoginDao;
import com.iiht.dao.TaskManagerAppDao;
import com.iiht.exception.ResourceNotFoundException;
import com.iiht.model.TaskManagerApp;

@Service("taskManagerAppService")
@Transactional(propagation= Propagation.REQUIRED)
@EnableTransactionManagement
public class TaskManagerAppServiceImpl implements TaskManagerAppService {

	@Autowired
	private TaskManagerAppDao taskManagerAppDao;
	
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

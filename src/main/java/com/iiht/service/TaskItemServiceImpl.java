package com.iiht.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.dao.TaskItemDao;
import com.iiht.model.TaskItem;

@Service("taskItemService")
@Transactional(propagation= Propagation.REQUIRED)
@EnableTransactionManagement
public class TaskItemServiceImpl implements TaskItemService {

	@Autowired
	private TaskItemDao taskItemDao;
	
	public void saveTaskItem(TaskItem taskItem) {
		// TODO Auto-generated method stub

	}

}

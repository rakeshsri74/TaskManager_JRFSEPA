package com.iiht.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iiht.model.TaskItem;

@Repository
public class TaskItemDaoImpl implements TaskItemDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveTaskItem(TaskItem taskItem) {
		// TODO Auto-generated method stub

	}

}

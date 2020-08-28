package com.iiht.dao;

import java.util.List;

import com.iiht.exception.ResourceNotFoundException;
import com.iiht.model.TaskItem;

public interface TaskItemDao {
	
	public void saveTaskItem(TaskItem taskItem);
	
	
}

package com.iiht.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.dao.NewGroupDao;
import com.iiht.model.NewGroup;

@Service("newGroupService")
@Transactional(propagation= Propagation.REQUIRED)
@EnableTransactionManagement
public class NewGroupServiceImpl implements NewGroupService {

	@Autowired
	private NewGroupDao newGroupDao;
	
	public void saveNewGroup(NewGroup newGroup) {
		// TODO Auto-generated method stub

	}

}

package com.iiht.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iiht.model.NewGroup;

@Repository
public class NewGroupDaoImpl implements NewGroupDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveNewGroup(NewGroup newGroup) {
		// TODO Auto-generated method stub

	}

}

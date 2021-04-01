package com.hormex.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hormex.entities.Branch;

public class BranchDao {
 public Branch getBranch(int branchId) {
	 Configuration configuration=null;
	 SessionFactory sessionFactory=null;
	 Session session=null;
	 Branch branch=null;
	 configuration=new Configuration().configure();
	 sessionFactory=configuration.buildSessionFactory();
	 session=sessionFactory.openSession();
	 branch=session.get(Branch.class, 1);
	 
	return branch;
	 
	 
 }
}

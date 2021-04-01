package com.hormex.test;

import com.hormex.dao.BranchDao;
import com.hormex.entities.Branch;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BranchDao branchDao=new BranchDao();
		Branch branch=branchDao.getBranch(1);
		System.out.println(branch);

	}

}

package com.bkap.dao;

import java.util.List;

import com.bkap.entity.Mobile;

public interface IMobileDAO {
	public boolean insert (Mobile mobile);
	public List<Mobile> selectAll();
	

}

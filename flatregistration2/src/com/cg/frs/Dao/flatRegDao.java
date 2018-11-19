package com.cg.frs.Dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.frs.Dto.FlatRegistrationDTO;
import com.cg.frs.collection.collectionUtil;

public class flatRegDao implements IflatRegDao {
	collectionUtil c = null;
	@Override
	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat) {
	
	
		return c.registerFlat(flat);
	}

	@Override
	public ArrayList<Integer> getAllOwnerIds() {
		c = new collectionUtil();
		return c.getAllOwnerIds();
		
	}

	@Override
	public HashMap<Integer, FlatRegistrationDTO> fetchflatDetails() {
		// TODO Auto-generated method stub
		return c.fetchflatDetails();
	}

}

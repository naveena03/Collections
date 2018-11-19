package com.cg.frs.Dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.frs.Dto.FlatRegistrationDTO;



public interface IflatRegDao {
	FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat);
	ArrayList<Integer> getAllOwnerIds();
	public HashMap<Integer,FlatRegistrationDTO> fetchflatDetails();

}

package com.cg.frs.collection;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.frs.Dto.FlatRegistrationDTO;

 public  class collectionUtil {
static 	ArrayList<Integer>  ownList= new ArrayList<Integer>();
static {
	ownList.add(1);
	ownList.add(2);
	ownList.add(3);
	
}
HashMap<Integer,FlatRegistrationDTO> flatDetails = new HashMap<Integer,FlatRegistrationDTO>();
public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat){
int id =(int) (1000*Math.random());
Integer fid = new Integer(id);
flatDetails.put(fid, flat);
return flat;
}

public static ArrayList<Integer>  getAllOwnerIds(){
	return ownList;
}
	
public HashMap<Integer,FlatRegistrationDTO> fetchflatDetails(){
	return flatDetails;
	
}

}

package com.cg.frs.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.frs.Dto.FlatRegistrationDTO;
import com.cg.frs.Exception.ClientException;

public interface IflatRegService {
	FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat);
	ArrayList<Integer> getAllOwnerIds();
	public boolean validatefArea(int num) throws ClientException;
	public boolean validatefdesRent(int num) throws ClientException;
	public boolean validatefdepAmt(int num) throws ClientException;
	public boolean checkAmt(int fRent,int fAmt) throws ClientException;
	public HashMap<Integer,FlatRegistrationDTO> fetchflatDetails();
	public boolean validateOwnerId(int id);
}

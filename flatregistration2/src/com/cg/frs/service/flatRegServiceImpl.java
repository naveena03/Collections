package com.cg.frs.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

import com.cg.frs.Dao.IflatRegDao;
import com.cg.frs.Dao.flatRegDao;
import com.cg.frs.Dto.FlatRegistrationDTO;
import com.cg.frs.Exception.ClientException;

public class flatRegServiceImpl implements IflatRegService {
	static IflatRegDao cliDao = null ;
	public flatRegServiceImpl(){
		
		cliDao = new flatRegDao();
	
	}
	@Override
	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat) {
		// TODO Auto-generated method stub
		return cliDao.registerFlat(flat);
	}

	@Override
	public ArrayList<Integer> getAllOwnerIds() {
		// TODO Auto-generated method stub
		return cliDao.getAllOwnerIds();
	}
	@Override
	public boolean validatefArea(int num) throws ClientException {
		Integer input = new Integer(num);
		String inputStr = input.toString();
		String digitPatter="[0-9]+";
		if(Pattern.matches(digitPatter, inputStr)){
			return true;
		}
		else
		{
			throw new ClientException("InvalidInput"+"OnlyDigits are allowed ex.45577");
		}

	}
	@Override
	public boolean validatefdesRent(int num) throws ClientException {
		Integer input = new Integer(num);
		String inputStr = input.toString();
		String digitPatter="[1-9]+[0-9]*";
		if(Pattern.matches(digitPatter, inputStr)){
			return true;
		}
		else
		{
			throw new ClientException("InvalidInput"+"OnlyDigits are allowed ex.45577");
		}
	}
	@Override
	public boolean validatefdepAmt(int num) throws ClientException {
		Integer input = new Integer(num);
		String inputStr = input.toString();
		String digitPatter="[1-9]+[0-9]*";
		if(Pattern.matches(digitPatter, inputStr)){
			return true;
		}
		else
		{
			throw new ClientException("InvalidInput"+"OnlyDigits are allowed ex.45577");
		}
	
	}
	@Override
	public boolean checkAmt(int fRent, int fAmt) throws ClientException {
		if(fRent > fAmt){
		return false;
	}
		return true;
	}
	@Override
	public HashMap<Integer, FlatRegistrationDTO> fetchflatDetails() {
		// TODO Auto-generated method stub
		return cliDao.fetchflatDetails();
	}
	@Override
	public boolean validateOwnerId(int id) {
		
		Integer input = new Integer(id);
		String inputStr = input.toString();
		String digitPatter="[1-3]";
		if(Pattern.matches(digitPatter, inputStr)){
			return true;
		}
		else	{
		return false;
		}
	}	

}

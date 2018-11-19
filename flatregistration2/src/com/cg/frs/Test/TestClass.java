package com.cg.frs.Test;

import junit.framework.Assert;

import org.junit.Test;

import com.cg.frs.Exception.ClientException;
import com.cg.frs.service.IflatRegService;
import com.cg.frs.service.flatRegServiceImpl;

public class TestClass {
	IflatRegService cliSer = new flatRegServiceImpl();
	@Test
	public void validatefArea1() throws ClientException  {
	boolean 	res = cliSer.validatefArea(1);
	Assert.assertEquals(true,res);
		
	}
	@Test
	public void validatefArea2() throws ClientException  {
		boolean 	res = cliSer.validatefArea(5);
		Assert.assertEquals(true,res);
			
		}
	@Test
	public void validatefRent1() throws ClientException {
		boolean res = cliSer.validatefdesRent(66);
		Assert.assertEquals(true, res);
	}
	@Test(expected=ClientException.class)
	public void validatefRent2() throws ClientException {
	cliSer.validatefdesRent(0);
	}
	@Test(expected=ClientException.class)
	public void validatefdep2() throws ClientException {
	 cliSer.validatefdepAmt(0);
		
	}
	
}

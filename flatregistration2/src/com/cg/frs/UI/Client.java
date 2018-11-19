package com.cg.frs.UI;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import com.cg.frs.Dto.FlatRegistrationDTO;
import com.cg.frs.Exception.ClientException;
import com.cg.frs.service.IflatRegService;
import com.cg.frs.service.flatRegServiceImpl;



public class Client {
	
static Scanner sc = null;
static IflatRegService cliSer = null ;
	public static void main(String[] args) throws ClientException {
int ownId =0;
int flatId = 0; 
sc = new Scanner(System.in);
cliSer =new flatRegServiceImpl();
int choice =0;
while(true){
	System.out.println("1.RegisterFlat\t\t2.Exit");
	System.out.println("enter the choice");
choice =  sc.nextInt();
switch(choice)
{

case 1:System.out.println("Existing owner Ids are:"+cliSer.getAllOwnerIds());
System.out.println("enter ownerId from the existing ids");
int oid = sc.nextInt();
//Integer iref = new Integer(oid);
//ArrayList<Integer> arr = cliSer.getAllOwnerIds();
//Object[] objArr=arr.toArray();
//for (int i = 0;i<;i++)
//{
	if(cliSer.validateOwnerId(oid))
	{
		System.out.println("enter the faltType[1BHK or 2BHK]:");
		int in =sc.nextInt();
		String fType = null;
		switch(in)
		{
			case 1: fType = "1-BHK";break;
			case 2: fType = "2-BHK";break;
		}
		System.out.println("enter the flat Area:");
		int fArea = sc.nextInt();
		if(cliSer.validatefArea( fArea))
		{
			System.out.println("enter  the desiredRent:");
			int fRent = sc.nextInt();
			if(cliSer.validatefdesRent(fRent)){
				System.out.println("enter the depositAmount:");
				int fAmt = sc.nextInt();
				if(cliSer.validatefdepAmt(fAmt))
				{
						if(cliSer.checkAmt(fRent, fAmt))
						{
								FlatRegistrationDTO fValues = new FlatRegistrationDTO(ownId, flatId,fType,fArea,fRent,fAmt);
								cliSer.registerFlat(fValues);
								HashMap<Integer,FlatRegistrationDTO> key = cliSer.fetchflatDetails();
								System.out.println("flat registered successfully \n flatid is:" +key.keySet());
						}
						else
							System.out.println(" Invalid rent!");
				}
			}
		}

	}
	else
	{
		System.out.println("ownerid does not exists");
		break;
	}


	
case 2:System.exit(0);
}

}
}}

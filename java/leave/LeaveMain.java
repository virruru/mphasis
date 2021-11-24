package com.java.infinite.leave;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.java.infinite.agent.AgentException;

public class LeaveMain {
	static Scanner sc=new Scanner(System.in);
	public static void addLeave() throws ParseException, LeaveException
	{
		LeaveDetails ob=new LeaveDetails();
		System.out.println("enter leave id");
		ob.setLeaveId(sc.nextInt());
		System.out.println("enter leave start date in the format dd-mm-yyyy");
		String startdate=sc.next();
		System.out.println("enter leave end date in the format dd-mm-yyyy");
		String enddate=sc.next();
		System.out.println("enter employ id");
		ob.setEmpId(sc.nextInt());
		System.out.println("enter leave reason");
		String reason=sc.next();
		ob.setLeaveReason(reason);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date sdate=sdf.parse(startdate);
		Date edate=sdf.parse(enddate);
		
		ob.setLeaveStartDate(sdate);
		ob.setLeaveEndDate(edate);
		ob.setLeaveAppliedOn(new Date());
		
		int sd=Integer.parseInt(startdate.substring(0, 2));
		int ed=Integer.parseInt(enddate.substring(0, 2));
		int sm=Integer.parseInt(startdate.substring(3, 5));
		int em=Integer.parseInt(enddate.substring(3, 5));
		int nod=0;
		if(sm==em)
			nod=ed-sd;
		if(em>sm)
		{
			nod=(30-sd)+ed;
		}
		ob.setNoOfDays(++nod);
		
		System.out.println(new LeaveBAL().addLeaveBal(ob));
	}

	public static void showLeave()
	{
		List<LeaveDetails> ld=new LeaveBAL().showLeaveBal();
		for (LeaveDetails leaveDetails : ld) {
			System.out.println(leaveDetails);
		};
	}
	
	public static void searchLeave()
	{
		System.out.println("enter leaveid to search");
		int id=sc.nextInt();
		LeaveDetails ob=new LeaveBAL().searchLeaveBal(id);
		System.out.println(ob);
	}
	
	public static void deleteLeave()
	{
		System.out.println("enter leaveid to delete");
		int id=sc.nextInt();
		System.out.println(new LeaveBAL().deleteLeaveBal(id));
	}
	
	public static void updateLeave() throws ParseException, LeaveException
	{
		LeaveDetails ob=new LeaveDetails();
		System.out.println("enter leave id");
		ob.setLeaveId(sc.nextInt());
		System.out.println("enter leave start date in the format dd-mm-yyyy");
		String startdate=sc.next();
		System.out.println("enter leave end date in the format dd-mm-yyyy");
		String enddate=sc.next();
		System.out.println("enter employ id");
		ob.setEmpId(sc.nextInt());
		System.out.println("enter leave reason");
		String reason=sc.next();
		ob.setLeaveReason(reason);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date sdate=sdf.parse(startdate);
		Date edate=sdf.parse(enddate);
		
		ob.setLeaveStartDate(sdate);
		ob.setLeaveEndDate(edate);
		ob.setLeaveAppliedOn(new Date());
		
		int sd=Integer.parseInt(startdate.substring(0, 2));
		int ed=Integer.parseInt(enddate.substring(0, 2));
		int sm=Integer.parseInt(startdate.substring(3, 5));
		int em=Integer.parseInt(enddate.substring(3, 5));
		int nod=0;
		if(sm==em)
			nod=ed-sd;
		if(em>sm)
		{
			nod=(30-sd)+ed;
		}
		ob.setNoOfDays(++nod);
		
		System.out.println(new LeaveBAL().updateLeaveBal(ob));
	}
	public static void main(String[] args) {
		int choice=0;
		do {
			System.out.println("O P T I O N S");
			System.out.println("--------------");
			System.out.println("1. Add Leave ");
			System.out.println("2. Show Leave Details");
			System.out.println("3. Search Leave");
			System.out.println("4. Delete Leave");
			System.out.println("5. Update Leave");
			System.out.println("6. Exit");
			System.out.println("Enter Your Choice  ");
			choice=sc.nextInt();
			switch(choice) {
			case 1 :
				try 
				{
					addLeave();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (LeaveException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2 :
				showLeave();
				break;
			case 3 : 
				searchLeave();
				break;
			case 4 : 
				deleteLeave();
				break;
			case 5:
				try 
				{
					updateLeave();
				} 
				catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (LeaveException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
		}while(choice!=6);

	}

}

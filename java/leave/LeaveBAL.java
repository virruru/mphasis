package com.java.infinite.leave;

import java.util.Date;
import java.util.List;

public class LeaveBAL {
	static StringBuilder sb=new StringBuilder();
	public boolean validate(LeaveDetails ld)
	{
		boolean val=true;
		if(ld.getLeaveId()<=0)
		{
			val=false;
			sb.append("Leave Id should be greater than 0");
		}
		Date obj=new Date();
		int tdate=obj.getDay();
		int tmonth=obj.getMonth();
		
		int leaveStartdate=ld.getLeaveStartDate().getDate();
		int leaveStartMonth=ld.getLeaveStartDate().getMonth();
		if(true)
		{
			if (leaveStartMonth<=tmonth) 
			{
				if (leaveStartMonth < tmonth) 
				{
					val = false;
					sb.append("Leave Start Date should be today or future date");
				} 
				else if (leaveStartdate < tdate)
				{
					val = false;
					sb.append("Leave Start Date should be today or future date");
				} 
			}
		}
		
		int leaveEnddate=ld.getLeaveEndDate().getDate();
		int leaveEndMonth=ld.getLeaveEndDate().getMonth();
		if(true)
		{
			if (leaveEndMonth<=leaveStartMonth) 
			{
				if (leaveEndMonth < leaveStartMonth)
				{
					val = false;
					sb.append("Leave End Date should be today or future date");
				} 
				else if (leaveEnddate < leaveStartdate)
				{
					val = false;
					sb.append("Leave End Date should be today or future date");
				} 
			}
		}
		
		if(ld.getEmpId()<=0)
		{
			val=false;
			sb.append("Employ Id should be greater than 0");
		}
		
		return val;
	}

	public String addLeaveBal(LeaveDetails ld) throws LeaveException
	{
		boolean val=validate(ld);
		if(val==true)
			return new LeaveDAO().AddLeaveDao(ld);
		else
			throw new LeaveException(sb.toString());
	}
	
	public List<LeaveDetails> showLeaveBal()
	{
		return new LeaveDAO().ShowLeaveDetailsDao();
	}
	
	public String deleteLeaveBal(int id)
	{
		return new LeaveDAO().deleteLeaveDao(id);
	}
	
	public LeaveDetails searchLeaveBal(int id)
	{
		return new LeaveDAO().searchLeaveDao(id);
	}
	
	public String updateLeaveBal(LeaveDetails ob) throws LeaveException
	{
		boolean val=validate(ob);
		if(val==true)
			return new LeaveDAO().updatedetails(ob);
		else
			throw new LeaveException(sb.toString());
		
	}
}

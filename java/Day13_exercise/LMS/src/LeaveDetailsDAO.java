import java.util.Date;

public class LeaveDetailsDAO {

	public String addLeave(LeaveDetails leaveDetails) {
		
		leaveDetails.setLeaveAppliedOn(new Date());
		 long ms = leaveDetails.getLeaveEndDate().getTime() -
				 leaveDetails.getLeaveStartDate().getTime();
		    long m = ms / (1000 * 24 * 60 * 60);
		    int days = (int) m;
		    days = days + 1;
		    leaveDetails.setNoOfDays(days);
		    return "Leave Added Successfully...";
	}
}

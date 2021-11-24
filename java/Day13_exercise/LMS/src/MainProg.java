import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainProg {

	public static void main(String[] args) {
		LeaveDetails ld = new LeaveDetails();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		ld.setLeaveAppliedOn(new Date());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Leave Start Date(yyyy-MM-dd)  ");
		try {
			ld.setLeaveStartDate(sdf.parse(sc.next()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter Leave End Date(yyyy-MM-dd)  ");
		try {
			ld.setLeaveEndDate(sdf.parse(sc.next()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(ld);
		
		 long ms = ld.getLeaveEndDate().getTime() -
				 ld.getLeaveStartDate().getTime();
		    long m = ms / (1000 * 24 * 60 * 60);
		    int days = (int) m;
		    days = days + 1;
		    System.out.println(days);
	}
}

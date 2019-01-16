package mainPackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TimeTest {

	public static void main(String[] args) 
	{
		System.out.println(new Date());
		String date="20178989";
		String time="170012";
		 try {
	            DateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
	            System.out.println(dateFormat.parse(date + time));
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }

	}

}

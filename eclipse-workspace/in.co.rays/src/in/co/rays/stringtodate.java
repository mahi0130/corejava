package in.co.rays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class stringtodate {
	public static void main(String[] args) throws ParseException {
		String s= "01/01/2023";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date d =sdf.parse(s);
		System.out.println(d);
	}

}

package in.co.rays;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class testperson {
	public static void main(String[] args) throws ParseException {
		String str= "11/12/2005";
		SimpleDateFormat sdf = new  SimpleDateFormat("dd/mm/yyyy");
		
	
        person p = new person();
        p.setId(10);
        p.setName("mahi");
        p.setDob(sdf.parse(str));
   
   System.out.println(p.getId());
   System.out.println(p.getName());
   System.out.println( sdf.format(p.getDob()));

}
}
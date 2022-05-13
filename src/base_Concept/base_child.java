package base_Concept;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class base_child extends Base_class {
	public static void main(String[] args) throws Throwable {
		getBrowser("chrome");
		geturl("https://adactinhotelapp.com/");
		
		Pom_class pc = new Pom_class(driver);
        Pom1_class pc1 =new Pom1_class(driver);	
        Pom2_class pc2=new Pom2_class(driver);
        Pom3_class pc3 = new Pom3_class(driver);



		sendk(pc.getUsername(),"venkadesh");
		sendk(pc.getPassword(),"venkadeshkumar");
		clk(pc.getLogin());
		
		drop2(pc1.getLocation(),"London");
		drop2(pc1.getHotels(),"Hotel Sunshine");
		drop2(pc1.getRoomtype(),"Standard");
		sendk(pc1.getRoomnos(),"2-Two");
		sendk(pc1.getDatein(),"11/04/2022");
		sendk(pc1.getDateout(),"12/04/2022");
		sendk(pc1.getAdultroom(),"2-Two");
		sendk(pc1.getChildroom(),"1-One");
		clk(pc1.getSubmit());
		
		clk(pc2.getClick());
		clk(pc2.getContine());
		
		
		sendk(pc3.getFirstname(),"venkadesh");
		sendk(pc3.getLastname(), "kumar");
		sendk(pc3.getAdres(),"nallama naicker patti");
		sendk(pc3.getCnum(), "987654321");
		sendk(pc3.getCtype(),"VISA");
		sendk(pc3.getMonth(),"March");
		sendk(pc3.getYear(), "2023");
		sendk(pc3.getCvv(), "517");
		clk(pc3.getDelete());
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}

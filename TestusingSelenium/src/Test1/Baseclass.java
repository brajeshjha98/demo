package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Baseclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.edge.driver", "D:\\Web-drivers\\edgedriver\\msedgedriver.exe");  
		 WebDriver driver=new EdgeDriver();
		 
		 driver.get("https://www.google.com/");
           
		 driver.findElement(By.className("gLFyf")).sendKeys("javatpoint tutorials");
		 
		 Thread.sleep(2000);
		          
		 driver.findElement(By.name("btnK")).click();
		 

	}

}

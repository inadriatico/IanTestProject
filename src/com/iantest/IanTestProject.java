package com.iantest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Hello World");
	
	public class IanTestProject {
		 WebDriver driver = new ChromeDriver();
		    driver.get("https://selenium.dev");
		    String url = "https://datacom.com/nz/en/contact-us";
		    
		    public void PageLoadTest(url) {
		      response = requests.get(url) 
		         
		         //Https Status code check 200 if actieve
		         if (response.status_code == 200) {
		           return True ;
				   System. out. println("Datacom Contact Us Page Loaded Successfully");
		         }
		        else {
		            return False;
					System. out. println("Datacom Contact Us Loading Failed");
		        }
		    }
		    
		    public void navigateBrowser() {
				
				do {
					//check back navigation button 
					url.navigate().back();
		       
		        
					//check Forward navigation button  
					url.navigate().forward();
		       

					//check Refresh navigation button  
					url.navigate().refresh();
				}
				while {
					PageLoadTest(True);
				}
				
				//Click Our Locations
			
				WebElement OurLocationsElement = driver.findElement(By.id("Our Locations"));
				actions.contextClick(OurLocationsElement).perform();
				
				String pageTitle = driver.getTitle();
		            if (pageTitle != null && !pageTitle.isEmpty()) {
		                System.out.println("Page loaded successfully. Title: " + pageTitle);
		            } else {
		                System.out.println("Page failed to load. Title is empty.");
		            }
		              
				
		        driver.quit();
		        
		    }

		

	}

}

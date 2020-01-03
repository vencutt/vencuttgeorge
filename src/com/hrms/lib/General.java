package com.hrms.lib;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.hrms.utility.Log;

import org.openqa.selenium.interactions.Actions;

//import java.io.File;
//import java.io.IOException;
import java.util.concurrent.TimeUnit;
//import static org.testng.Assert.assertFalse;
//import org.openqa.selenium.TakesScreenshot;


public class General extends Global {
	public void openApp() {
		  Log.info("=========entered testcase=========");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Datascience\\Downloads\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.navigate().to(url);	
        System.out.println("application opened");  
        Reporter.log("application opened");
        Log.info("application opened");
	}
    public void closeApp() {
           driver.close();
           System.out.println("application closed"); 
           Reporter.log("application closed");
           Log.info("application closed");
 		  Log.info("=========close testcase=========");

    }
    public void login() {
    	driver.findElement(By.name(txt_login)).sendKeys(un);
    	driver.findElement(By.xpath(txt_password)).sendKeys(pw);
    	driver.findElement(By.xpath(btn_login)).click();
        System.out.println("login completed");  
        Reporter.log("login completed");
        Log.info("login completed");

    }
    public void logout() {
    	driver.findElement(By.linkText(link_logout)).click();
        System.out.println("logout completed"); 
        Reporter.log("logout completed");
        Log.info("logout completed");
    }
   
    public void waitExplicit( String xpath) {
    	WebDriverWait wait= new WebDriverWait(driver,3000);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath))));    	
    }
    public void waitImplicit() {
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    public void verifyTitle() {
     if(driver.getTitle().equals(title)) {
    	 System.out.println("title matched");
         Reporter.log("title matched");
         Log.info("title matched");
     }
     else {
    	 System.out.println("title not matched because title is:"+driver.getTitle());
     }
    }
    public void mouseOverActionAndClick( String mainmenu,String submenu,String locator)throws Exception {
    	Actions ac=new Actions(driver);
    	ac.moveToElement(driver.findElement(By.xpath(mainmenu))).build().perform();
    	waitThread();
    	ac.moveToElement(driver.findElement(By.xpath(submenu))).build().perform();
    	waitThread();
    	ac.moveToElement(driver.findElement(By.xpath(locator))).click();
    	waitThread();
    	System.out.println(" curser action performed");
        Reporter.log(" curser action performed");
        Log.info(" curser action performed");
    }
    public void frameEnter(String frame) {
    	driver.switchTo().frame(frame);
    	System.out.println("entering into new frame");
        Reporter.log("entering into new frame");
        Log.info("entering into new frame");
    }
   public void frameExit() {
	   driver.switchTo().defaultContent();
	   System.out.println("Exit from the frame");
       Reporter.log("Exit from the frame");
       Log.info("Exit from the frame");
   }
   public void addEmp(String s1,String s2) {
	   driver.findElement(By.xpath(btn_add)).click();
	   driver.findElement(By.name("txtEmpFirstName")).sendKeys(s1);
	   driver.findElement(By.name("txtEmpLastName")).sendKeys(s2);
	   driver.findElement(By.xpath(btn_save)).click();
	   System.out.println("new employee added");
       Reporter.log("new employee added");
       Log.info("new employee added");

   }
   public void deleteEmp(int no) {
	   Select st =new Select(driver.findElement(By.xpath(dropdownbox)));
	   st.selectByIndex(no);
	 String empid=driver.findElement(By.xpath("//input[@id='txtEmployeeId']")).getAttribute("value");
	driver.findElement(By.xpath(searchbox)).sendKeys(empid);
	   driver.findElement(By.xpath(btn_search)).click();
	   driver.findElement(By.xpath(check_box)).click();
	   driver.findElement(By.xpath(btn_delete)).click();
	   System.out.println("employee deleted");
       Reporter.log("employee deleted");
       Log.info("employee deleted");
   }
   public void back() {
	   driver.findElement(By.xpath("//input[@value='Back']")).click();
   }
   public void waitThread()throws Exception{
	   Thread.sleep(3000);
   }
   /*public void screenShot()throws IOException {
	  // try {}
	  // catch(Exception e) {
	   File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(f, newFile("E:\\pvr\testresults.png"));
	  // }
   }
   private Object newFile(String string) {
	// TODO Auto-generated method stub
	   return null;
}*/
}


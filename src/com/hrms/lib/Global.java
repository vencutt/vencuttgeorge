package com.hrms.lib;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Global {
	public WebDriver driver;
	public String un="admin";
	public String pw="admin";
	public String url="http://127.0.0.1/orangehrm-2.6/login.php";
	//public WebDriverWait wait;
	public static String title="New Level of HR Management";
	//objects
	public String txt_login="txtUserName";
	public String txt_password="//input[contains(@name,'Pass')]";
	public String btn_login="//input[starts-with(@name,'Sub')]";
	public String link_logout="Logout";
	//public String empid=driver.findElement(By.xpath("//input[@id='txtEmployeeId']")).getAttribute("value");
	public String btn_add="//input[@value='Add']";
	public String btn_delete="//input[@value='Delete']";
	public String btn_save="//input[@value='Save']";
	public String dropdownbox="//select[@id='loc_code']";
	public String searchbox="//select[@id='loc_name']";
	public String btn_search="//select[@value='Search']";
	public String check_box="//input[@name='allCheck']";
	//public String btn_back="//input[@value='Back']";
	


}

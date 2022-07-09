package com.sheets;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactInHotelFromExcel 
{
public static void main(String [] args) throws IOException, InterruptedException
{
	//WebDriverManager.chromedriver().setup();
	//WebDriver driver= new ChromeDriver();
	BaseClass baseClass=new BaseClass();
	baseClass.getDriver();
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	baseClass.waits(30);
	
	//driver.get("https://adactinhotelapp.com/");
	baseClass.loadUrl("https://adactinhotelapp.com/");
	
	//driver.manage().window().maximize();
	baseClass.maximize();
	
	//WebElement txtUserName = driver.findElement(By.id("username"));
	WebElement txtUserName = baseClass.findElementById("username");
	
	//txtUserName.sendKeys("mrithula");
	baseClass.getData("Datas1",0,2);
	baseClass.type(txtUserName,"mrithula" );
	
//	WebElement txtpassword = driver.findElement(By.id("password"));
	WebElement txtpassword = baseClass.findElementById("password");
	
//	txtpassword.sendKeys("Mrithu@89");
	baseClass.getData("Datas1", 2, 1);
	baseClass.type(txtpassword, "Mrithu@89");

	
//	WebElement btnLogin = driver.findElement(By.id("login"));
	WebElement btnLogin = baseClass.findElementById("login");
	
//	btnLogin.click();
	baseClass.click(btnLogin);
	
	//WebElement dDnLocation = driver.findElement(By.id("location"));
	WebElement dDnLocation = baseClass.findElementById("location");
//	String data = baseClass.getData("Datas1", 5, 3);
//	baseClass.selectOptionByText(dDnL, text);
	
	Select select=new Select(dDnLocation);
	
	
	select.selectByIndex(5);
	//baseClass.selectOptionByIndex(dDnLocation, index);
	
//	WebElement dDnHotel = driver.findElement(By.id("hotels"));
	WebElement dDnHotel = baseClass.findElementById("hotels");
	Select select1=new Select(dDnHotel);
	select1.selectByIndex(3);
//	
//	WebElement dDnRoomType = driver.findElement(By.id("room_type"));
	WebElement dDnRoomType = baseClass.findElementById("room_type");
	Select select2=new Select(dDnRoomType);
	select2.selectByIndex(3);
//	
//	WebElement dDnRoomNo = driver.findElement(By.id("room_nos"));
	WebElement dDnRoomNo = baseClass.findElementById("room_nos");
	Select select3=new Select(dDnRoomNo);
	select3.selectByIndex(4);
//	
//	WebElement txtDateFrom = driver.findElement(By.id("datepick_in"));
	WebElement txtDateFrom = baseClass.findElementById("datepick_in");
	baseClass.clear(txtDateFrom);
	String data = baseClass.getData("Datas1", 9, 6);
//	txtDateFrom.sendKeys("23/06/2022");
	baseClass.type(txtDateFrom, data);
//	
//	WebElement txtDateTo = driver.findElement(By.id("datepick_out"));
	WebElement txtDateTo = baseClass.findElementById("datepick_out");
	baseClass.clear(txtDateTo);
	String data2 = baseClass.getData("Datas1", 9, 7);
//	txtDateTo.sendKeys("29/06/2022");
	baseClass.type(txtDateTo, data2);
//	
//	WebElement dDnAdultno = driver.findElement(By.id("adult_room"));
	WebElement dDnAdultno = baseClass.findElementById("adult_room");
	Select select4=new Select(dDnAdultno);
	select4.selectByIndex(4);
//	
//	WebElement dDnChildno = driver.findElement(By.id("child_room"));
	WebElement dDnChildno = baseClass.findElementById("child_room");
	Select select5=new Select(dDnChildno);
	select5.selectByIndex(2);
//	
//	WebElement btnSearch = driver.findElement(By.id("Submit"));
	WebElement btnSearch = baseClass.findElementById("Submit");
//	btnSearch.click();
	baseClass.click(btnSearch);
//	
//	WebElement rdbtnSelectHotel = driver.findElement(By.id("radiobutton_0"));
	WebElement rdbtnSelectHotel = baseClass.findElementById("radiobutton_0");
//	rdbtnSelectHotel.click();
	baseClass.click(rdbtnSelectHotel);
//	
//	WebElement btnContinue = driver.findElement(By.id("continue"));
	WebElement btnContinue = baseClass.findElementById("continue");
//	btnContinue.click();
	baseClass.click(btnContinue);
//	
//	WebElement txtFirstName = driver.findElement(By.id("first_name"));
	WebElement txtFirstName = baseClass.findElementById("first_name");
//	txtFirstName.sendKeys("Mrithula");
	String data3 = baseClass.getData("Datas1", 3, 10);
	baseClass.type(txtFirstName, data3);
//	
//	WebElement txtLastName = driver.findElement(By.id("last_name"));
	WebElement txtLastName = baseClass.findElementById("last_name");
//	txtLastName.sendKeys("Karthigeyan");
	String data4 = baseClass.getData("Datas1", 3, 11);
	baseClass.type(txtLastName, data4);
//	
//	WebElement txtAddress = driver.findElement(By.id("address"));
	WebElement txtaddress = baseClass.findElementById("address");
//	txtAddress.sendKeys("#1, Shakthi street,Kalpakkam");
	String data5 = baseClass.getData("Datas1", 3, 12);
	baseClass.type(txtaddress, data5);
//	
//	WebElement cCardNo = driver.findElement(By.id("cc_num"));
	WebElement cCardNo = baseClass.findElementById("cc_num");
//	cCardNo.sendKeys("3453214678654398");
	String data6 = baseClass.getData("Datas1", 3, 13);
	baseClass.type(cCardNo, data6);
//	
//	WebElement cCardType = driver.findElement(By.id("cc_type"));
	WebElement cCardType = baseClass.findElementById("cc_type");
	Select select6=new Select(cCardType);
	select6.selectByIndex(2);
//	
//	WebElement cardExpMon = driver.findElement(By.id("cc_exp_month"));
	WebElement cardExpMon = baseClass.findElementById("cc_exp_month");
	Select select7=new Select(cardExpMon);
	select7.selectByIndex(7);
//	
//	WebElement cardExpYr = driver.findElement(By.id("cc_exp_year"));
	WebElement cardExpYr = baseClass.findElementById("cc_exp_year");
	Select select8=new Select(cardExpYr);
	select8.selectByIndex(9);
//	
//	WebElement txtCvv = driver.findElement(By.id("cc_cvv"));
	WebElement txtCvv = baseClass.findElementById("cc_cvv");
//	txtCvv.sendKeys("234");
	String data7 = baseClass.getData("Datas1", 3, 17);
	baseClass.type(txtCvv, data7);
//	
//	WebElement btnBookNow = driver.findElement(By.id("book_now"));
	WebElement btnBookNow = baseClass.findElementById("book_now");
//	btnBookNow.click();
	baseClass.click(btnBookNow);
	
	Thread.sleep(15000);
	WebElement bookingOrderNo = baseClass.findElementById("order_no");
	String attributeValue = baseClass.getAttributeValue(bookingOrderNo);
	baseClass.writeCellData("Datas1", 0, 18, "Order no");
	baseClass.writeCellData("Datas1", 2, 18, attributeValue);
		
}
}

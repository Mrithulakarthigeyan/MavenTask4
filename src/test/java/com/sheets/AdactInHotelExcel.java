package com.sheets;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdactInHotelExcel {
	public static void main(String [] args) throws IOException, InterruptedException
	{
		
		BaseClass baseClass=new BaseClass();
		baseClass.getDriver();
		
		baseClass.waits(30);
		
		baseClass.loadUrl("https://adactinhotelapp.com/");
		
		baseClass.maximize();
		
		WebElement txtUserName = baseClass.findElementById("username");
		baseClass.getData("Datas1",0,2);
		baseClass.type(txtUserName,"mrithula" );

		WebElement txtpassword = baseClass.findElementById("password");
		baseClass.getData("Datas1", 2, 1);
		baseClass.type(txtpassword, "Mrithu@89");

		WebElement btnLogin = baseClass.findElementById("login");
		baseClass.click(btnLogin);
				
		WebElement dDnLocation = baseClass.findElementById("location");
		Select select=new Select(dDnLocation);
		select.selectByIndex(5);
	
		WebElement dDnHotel = baseClass.findElementById("hotels");
		Select select1=new Select(dDnHotel);
		select1.selectByIndex(3);
		
		WebElement dDnRoomType = baseClass.findElementById("room_type");
		Select select2=new Select(dDnRoomType);
		select2.selectByIndex(3);
	
		WebElement dDnRoomNo = baseClass.findElementById("room_nos");
		Select select3=new Select(dDnRoomNo);
		select3.selectByIndex(4);
	
		WebElement txtDateFrom = baseClass.findElementById("datepick_in");
		
		String data = baseClass.getData("Datas1", 9, 6);
		baseClass.type(txtDateFrom, data);
	
		WebElement txtDateTo = baseClass.findElementById("datepick_out");
		String data2 = baseClass.getData("Datas1", 9, 7);
		baseClass.type(txtDateTo, data2);
	
		WebElement dDnAdultno = baseClass.findElementById("adult_room");
		Select select4=new Select(dDnAdultno);
		select4.selectByIndex(4);
	
		WebElement dDnChildno = baseClass.findElementById("child_room");
		Select select5=new Select(dDnChildno);
		select5.selectByIndex(2);
	
		WebElement btnSearch = baseClass.findElementById("Submit");
		baseClass.click(btnSearch);
	
		WebElement rdbtnSelectHotel = baseClass.findElementById("radiobutton_0");
		baseClass.click(rdbtnSelectHotel);

		WebElement btnContinue = baseClass.findElementById("continue");
		baseClass.click(btnContinue);
	
		WebElement txtFirstName = baseClass.findElementById("first_name");
		String data3 = baseClass.getData("Datas1", 3, 10);
		baseClass.type(txtFirstName, data3);
	
		WebElement txtLastName = baseClass.findElementById("last_name");
		String data4 = baseClass.getData("Datas1", 3, 11);
		baseClass.type(txtLastName, data4);
		
		WebElement txtaddress = baseClass.findElementById("address");
		String data5 = baseClass.getData("Datas1", 3, 12);
		baseClass.type(txtaddress, data5);
	
		WebElement cCardNo = baseClass.findElementById("cc_num");
		String data6 = baseClass.getData("Datas1", 3, 13);
		baseClass.type(cCardNo, data6);

		WebElement cCardType = baseClass.findElementById("cc_type");
		Select select6=new Select(cCardType);
		select6.selectByIndex(2);
	
		WebElement cardExpMon = baseClass.findElementById("cc_exp_month");
		Select select7=new Select(cardExpMon);
		select7.selectByIndex(7);
	
		WebElement cardExpYr = baseClass.findElementById("cc_exp_year");
		Select select8=new Select(cardExpYr);
		select8.selectByIndex(9);
		
		WebElement txtCvv = baseClass.findElementById("cc_cvv");
		String data7 = baseClass.getData("Datas1", 3, 17);
		baseClass.type(txtCvv, data7);
	
		WebElement btnBookNow = baseClass.findElementById("book_now");
		baseClass.click(btnBookNow);
		
		Thread.sleep(15000);
		WebElement bookingOrderNo = baseClass.findElementById("order_no");
		String attributeValue = baseClass.getAttributeValue(bookingOrderNo);
		baseClass.writeCellData("Datas1", 0, 18, "Order no");
		baseClass.writeCellData("Datas1", 2, 18, attributeValue);
			
	}

}

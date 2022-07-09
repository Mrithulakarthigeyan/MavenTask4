package com.sheets;




	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.math.BigDecimal;
	import java.net.URL;
	import java.text.SimpleDateFormat;
	import java.time.Duration;
	import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.CellType;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass {

		WebDriver driver;
		
		//1
		public void getDriver()
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		}
		
		//2
		public void loadUrl(String url)
		{
			driver.get(url);
		}
		
		//3
		public void navigate(String url) 
		{
			driver.navigate().to(url);
		}
		
		//4
//		public void navigateUrl(URL url1)
//		{
//			URL url=new URL(url1);
//			driver.navigate().to(url);
//		}
		
		//5
		public void navigateBack() 
		{
			driver.navigate().back();
		}
		
		//6
		public void navigateForward() 
		{
			driver.navigate().forward();
		}
		
		//7
		public void navigateRefresh() 
		{
			driver.navigate().refresh();
		}
		
		//8
		public void maximize() 
		{
			driver.manage().window().maximize();
		}
		
		//9
		public void minimize() 
		{
			driver.manage().window().maximize();
		}
		
		public void clear(WebElement element)
		{
		element.clear();

		}
		
		//10
		public void type(WebElement element, String data)
		{
			element.sendKeys(data);
		}
		
		//11
		public void click(WebElement element) 
		{
			element.click();
		}
		
		//12
		public WebElement findElementById(String attributeValue) 
		{
			WebElement element = driver.findElement(By.id(attributeValue));
			return element;
		}
		
		//13
		public WebElement findElementByName(String attributeValue) 
		{
			WebElement element = driver.findElement(By.name(attributeValue));
			return element;
		}
		
		//14
		public WebElement findElementByClass(String attributeValue) 
		{
			WebElement element = driver.findElement(By.className(attributeValue));
			return element;
		}
		
		//15
		public WebElement findElementByXpath(String xpath) 
		{
			WebElement element = driver.findElement(By.xpath(xpath));
			return element;
		}
		
		//16
		public String getTitle()
		{
			String title = driver.getTitle();
			return title;
		}
		
		//17
		public String getUrl()
		{
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
		}
		
		//18
		public String getText(WebElement element) 
		{
			String text=element.getText();
			return text;
		}
		
		//19
		public void sleep() throws InterruptedException 
		{
			Thread.sleep(3000);

		}
		
		//20
		//99%-value
		public String getAttributeValue(WebElement element) 
		{
			String attribute=element.getAttribute("value");
			return attribute;
		}
		
		//21
		//1%-value
		public String getAttributeValue(WebElement element, String attributeName)
		{
		String attribute=element.getAttribute(attributeName);
		return attribute;
		}
		
		//22//mouseover
		public void moveToElement(WebElement target) 
		{
			Actions actions=new Actions(driver);
			actions.moveToElement(target).perform();
		}
		
		//23
		public void dragAndDrop(WebElement source,WebElement target) 
		{
			Actions actions=new Actions(driver);
			actions.dragAndDrop(source, target).perform();
		}
		
		//24
		public void contextClick(WebElement target)
		{
			Actions actions=new Actions(driver);
			actions.contextClick(target).perform();
		}
		
		//25
		public void actionskeyDown()
		{
			Actions actions= new Actions(driver);
			actions.keyDown(Keys.SHIFT).perform();
		}
		
		//26
		public void actionskeyUP()
		{
			Actions actions= new Actions(driver);
			actions.keyUp(Keys.SHIFT).perform();
		}

		
		//27
		public void actionssendKeys(WebElement target, String keys)
		{
			Actions actions=new Actions(driver);
			actions.sendKeys(target, keys).perform();
		}
		
		//28
		public void doubleClick(WebElement target) 
		{
			Actions actions=new Actions(driver);
			actions.doubleClick(target).perform();
		}
		
		//29	
		public void robot() throws AWTException 
		{
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_0);
			robot.keyRelease(KeyEvent.VK_0);
			robot.keyPress(KeyEvent.VK_1);
			robot.keyRelease(KeyEvent.VK_1);
			robot.keyPress(KeyEvent.VK_2);
			robot.keyRelease(KeyEvent.VK_2);
			robot.keyPress(KeyEvent.VK_3);
			robot.keyRelease(KeyEvent.VK_3);
			robot.keyPress(KeyEvent.VK_4);
			robot.keyRelease(KeyEvent.VK_4);
			robot.keyPress(KeyEvent.VK_5);
			robot.keyRelease(KeyEvent.VK_5);
			robot.keyPress(KeyEvent.VK_6);
			robot.keyRelease(KeyEvent.VK_6);
			robot.keyPress(KeyEvent.VK_7);
			robot.keyRelease(KeyEvent.VK_7);
			robot.keyPress(KeyEvent.VK_8);
			robot.keyRelease(KeyEvent.VK_8);
			robot.keyPress(KeyEvent.VK_9);
			robot.keyRelease(KeyEvent.VK_9);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);

		}
		
		//30
		public void alertAccept()
		{
			Alert al=driver.switchTo().alert();
			al.accept();
		}
		
		//31
		public void alertDismiss()
		{
			Alert al=driver.switchTo().alert();
			al.dismiss();
		}
		
		//32
		public String alertgetText()
		{
			Alert al=driver.switchTo().alert();
			String text = al.getText();
			return text;
		}
		
		//33
		public void alertsendKeys(String keysToSend) {
			Alert al=driver.switchTo().alert();
			al.sendKeys(keysToSend);
			al.accept();
		}
		
		//34
		//entering value into textbox without using sendkeys
		public void typeJS(WebElement element,String text) {
			JavascriptExecutor executor=(JavascriptExecutor) driver;
			executor.executeScript("arguments[0].setAttribute('value','"+text+"')", element);

		}
		
		//35
		//retriving  value from textbox without using getAttribute
		public Object getTextJS(WebElement element,String text)
		{
			JavascriptExecutor executor=(JavascriptExecutor) driver;
			Object executeScript = executor.executeScript("return arguments[0].getAttribute('value')", element);
			return executeScript;
		}
		
		//36
		//click js
		public void clickJS(WebElement element)
		{
			JavascriptExecutor executor=(JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()", element);
		}
		
		//37
		//ScrollUp
		public void scrollUpJS(WebElement element) 
		{
			JavascriptExecutor executor=(JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(false)", element);
		}
		
		//38
		//ScrollDown
		public void scrollDownJS(WebElement element) 
		{
			JavascriptExecutor executor=(JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(true)", element);
		}
		
		public void waits(long seconds) 
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(seconds));
		}		
		
		public void waits1(long time,TimeUnit unit ) {
			// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(time, unit);

		}
		
		//39
		//waits
		public void waits(long arg,String xpathExpression) 
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(arg));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathExpression)));

		}
		
		//40
		public void waits1(long arg) 
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(arg));
			wait.until(ExpectedConditions.alertIsPresent());
		}
		
		//41
		public void waits2(By locator,long arg) 
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(arg));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
					
		}
		
		//42
		public void waits3(By locator,long arg) 
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(arg));
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
		
		
		public void selectOptionByText(WebElement element,String text) 
		{
			Select select=new Select(element);
			select.selectByVisibleText(text);
		}
		
		public void selectOptionByAttribute(WebElement element, String value) 
		{
			Select select=new Select(element);
			select.selectByValue(value);
		}
		
		public void selectOptionByIndex(WebElement element, int index)
		{
			Select select=new Select(element);
			select.selectByIndex(index);
		}
		
		//getting data from Excel to console (converting the datas to string)
		public String getData(String sheetName,int rownum,int cellnum) throws IOException 
		{
			String res=null;
			File file=new File("C:\\Users\\mrithula\\eclipse-workspace\\MavenTask4\\ExcelSheet\\AdactInHotelTestData.xlsx");
			FileInputStream fileInputStream=new FileInputStream(file);
			Workbook workbook=new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rownum);
			Cell cell = row.getCell(cellnum);
			CellType cellType = cell.getCellType();
			
			switch(cellType)
			{
			case STRING:
				res = cell.getStringCellValue();
				break;
			case NUMERIC:
				if(DateUtil.isCellDateFormatted(cell))
				{
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat dateFormat=new SimpleDateFormat("DD-MMM-YYYY");
					res = dateFormat.format(dateCellValue);
				} 
				else 
				{
					 double numericCellValue = cell.getNumericCellValue();
					BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
					res = valueOf.toString();
				}
					
			}
			return res;
			
		}
		
		//insert value in cell
		public void updateCellData(String sheetName,int rownum,int cellnum,String oldData,String newData) throws IOException
		{
			File file=new File("C:\\Users\\mrithula\\eclipse-workspace\\MavenTask4\\ExcelSheet\\AdactInHotelTestData.xlsx");
			FileInputStream fileInputStream=new FileInputStream(file);
			Workbook workbook=new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rownum);
			Cell cell = row.getCell(cellnum);
			String value = cell.getStringCellValue();
			if(value.equals(oldData))
			{
				cell.setCellValue(newData);
			}
			FileOutputStream fileOutputstream=new FileOutputStream(file);
			workbook.write(fileOutputstream);

		}
		
		
		//insert value-is cell empty
		public void writeCellData(String sheetName,int rownum,int cellnum,String data) throws IOException
		{
			File file=new File("C:\\Users\\mrithula\\eclipse-workspace\\MavenTask4\\ExcelSheet\\AdactInHotelTestData.xlsx");
			FileInputStream fileInputStream=new FileInputStream(file);
			Workbook workbook=new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rownum);
			Cell cell = row.createCell(cellnum);
			cell.setCellValue(data);
			FileOutputStream fileOutputstream=new FileOutputStream(file);
			workbook.write(fileOutputstream);

		}
		
		//insert value-row and cell is empty
		public void writeRowCellData(String sheetName,int rownum,int cellnum,String data) throws IOException
		{
			File file=new File("C:\\Users\\mrithula\\eclipse-workspace\\MavenTask4\\ExcelSheet\\AdactInHotelTestData.xlsx");
			FileInputStream fileInputStream=new FileInputStream(file);
			Workbook workbook=new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.createRow(rownum);
			Cell cell = row.createCell(cellnum);
			cell.setCellValue(data);
			FileOutputStream fileOutputstream=new FileOutputStream(file);
			workbook.write(fileOutputstream);
			
		}
		
		//create workbook-insert value in cell
		public void createWorkbook(String sheetName,int rownum,int cellnum,String data) throws IOException 
		{
			
			File file=new File("C:\\Users\\mrithula\\eclipse-workspace\\MavenTask4\\ExcelSheet\\AdactInHotelTestData.xlsx");
			FileInputStream fileInputStream=new FileInputStream(file);
			Workbook workbook=new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.createSheet(sheetName);
			Row row = sheet.createRow(rownum);
			Cell cell = row.createCell(cellnum);
			cell.setCellValue(data);
			FileOutputStream fileOutputstream=new FileOutputStream(file);
			workbook.write(fileOutputstream);

		}
		
		
		
		
		
		
		public void closeWindow()
		{
			driver.close();
		}
		
		public void closeAllWindow() 
		{
			driver.quit();
		}
		
		
		
		
	}
		




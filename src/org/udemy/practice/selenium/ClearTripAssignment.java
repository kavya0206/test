package org.udemy.practice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTripAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kavya.manivannan\\Documents\\Selenium\\Drivers\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		/*driver.findElement(By.xpath("//div/h4[text()='From']/following-sibling::div/div/div/input[@type='text']")).sendKeys("DEL");
		
	
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[text()='Suggestions']/parent::ul"));
		
		for(WebElement option :suggestions)
		{
			if(option.getText().equalsIgnoreCase("DEL - New Delhi, IN "))
			{
				option.click();
				break;
			}
		}
		
		Thread.sleep(2000);*/
		
		
		driver.findElement(By.cssSelector("div[class*='homeCalender']")).click();
		driver.findElement(By.cssSelector("div[class*='DayPicker-Day--selected']")).click();
		WebElement adultOption = driver.findElement(By.xpath("//*[text()='Adults']/following-sibling::select"));
		adultOption.click();
		
		Select adultOptionSelect = new Select(adultOption);
		adultOptionSelect.selectByValue("2");
		
		WebElement childrenOption = driver.findElement(By.xpath("//*[text()='Children']/following-sibling::select"));
		childrenOption.click();
		
		Select childrenOptionSelect = new Select(childrenOption);
		childrenOptionSelect.selectByValue("2");
		
		driver.findElement(By.xpath("//div/a/strong[text()='More options:']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Airline name']")).sendKeys("indigo");
		
		driver.findElement(By.xpath("//button[text()='Search flights']")).click();
		
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Select Departure and Arrival')]")).getText());
		

	}

}

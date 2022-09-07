package org.udemy.practice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoDropDownAssignmnet8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kavya.manivannan\\Documents\\Selenium\\Drivers\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/"); 
		
		WebElement dropDown = driver.findElement(By.cssSelector("#autocomplete"));
		dropDown.sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.cssSelector("ul[class*='ui-autocomplete'] li[class*='menu-item']"));
		
		for(WebElement option : options)
		{
			if (option.getText().equalsIgnoreCase("India"))
			{
				System.out.println(option.getText());
				option.click();
				
				break;
			}
			
		}
	
	}

}

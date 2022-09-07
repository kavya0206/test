package org.udemy.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePracticeAssignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kavya.manivannan\\Documents\\Selenium\\Drivers\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		
		System.out.println(driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size());
		
		System.out.println(driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th")).size());
		
		System.out.println(driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[3]")).getText());
	}

}

package com.qait.automation.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BingFunction {
	WebDriver driver;

	public BingFunction(WebDriver driver) {
		this.driver = driver;
	}

	public boolean verify() {
		boolean status=true;
		WebElement textarea1=driver.findElement(By.xpath("//textarea[@id='t_sv']"));
		WebElement textarea2=driver.findElement(By.xpath("//textarea[@readonly='readonly']"));
		WebElement translateButton=driver.findElement(By.xpath("//a[@id='t_revIcon']"));
	    WebElement dropdown=driver.findElement(By.xpath("//option[@value='hi']"));
		
	    textarea1.sendKeys("aman");
	    String str1=textarea1.getText();
	    System.out.println(str1);
	    dropdown.click();
	    String str2=textarea2.getText();
	    translateButton.click();
	    String str3=textarea2.getText();
	    if(str2.equals(str3))
	    	status=true;
	    else 
	    	status=false;
	    return status;
	}
	}
	
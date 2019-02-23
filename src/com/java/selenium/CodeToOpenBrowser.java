package com.java.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodeToOpenBrowser {
public static void main(String[] args) {
	
String key="webdriver.chrome.driver";
String value="./ReqSoftware/Chromedriver.exe";
System.setProperty(key,value);
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
driver.manage().window().maximize();
/*driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
driver.findElement(By.className("nav-input")).click();
List<WebElement> amz = driver.findElements(By.xpath("//li//div/a/h2"));
for (WebElement webElement : amz) {
		
		System.out.println(webElement.getText());
		
}
*/
/* List<WebElement> ams = driver.findElements(By.tagName("a"));
 

System.out.println(ams.size());
 for (WebElement webElement : ams) {
	 if(webElement.getText()!=" ") {
System.out.println(webElement.getText());}
}    
 
 
 Alert alert = driver.switchTo().alert();
 alert.accept();*/

//driver.findElement(By.className("download_xls")).click();

}
}
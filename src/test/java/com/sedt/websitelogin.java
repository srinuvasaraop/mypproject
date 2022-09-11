package com.sedt;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class websitelogin {
  @Test
  public void Test() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement findElement = driver.findElement(By.id("Email"));
		findElement.clear();
		findElement.sendKeys("admin@yourstore.com");
		// Thread.sleep(5000);
		WebElement findElement2 = driver.findElement(By.id("Password"));
		findElement2.clear();
		findElement2.sendKeys("admin");
		// Thread.sleep(5000);
		WebElement element = driver
				.findElement(By
						.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		element.click();
		Thread.sleep(5000);
		String actual_title = driver.getTitle();
		String Excepected_title = "Dashboard / nopCommerce administration";
		Assert.assertEquals(actual_title, Excepected_title);
		driver.close();
  }
}

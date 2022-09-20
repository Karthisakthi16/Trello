package com.Trello.Trello;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task_Trello {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJITH\\eclipse-workspace\\Trello\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://trello.com/login");
		
		WebElement email = driver.findElement(By.id("user"));
		email.sendKeys("karthick.sakthivel1116@gmail.com");
		
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Bara@2302");
		
		driver.findElement(By.id("login-submit")).click();
		
		Thread.sleep(3000);
		
			
		driver.findElement(By.xpath("//*[text()='Create new board']")).click();
		
		Thread.sleep(3000);
		
				
		WebElement boardTitle = driver.findElement(By.xpath("//input[@class='nch-textfield__input Hj0IB7nx8rs7UO Hj0IB7nx8rs7UO ysTE7s-UXRkpYP']"));
		
		boardTitle.sendKeys("Lists");
		
		driver.findElement(By.xpath("//button[@data-test-id=\"create-board-submit-button\"]")).click();
		
		Thread.sleep(3000);
		
		WebElement listName = driver.findElement(By.xpath("//input[@class='list-name-input']"));
		listName.sendKeys("List A");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[@class='open-card-composer js-open-card-composer']")).click();
		
		WebElement addCard = driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"));
		
		addCard.sendKeys("A");
		
		driver.findElement(By.xpath("//input[@class='nch-button nch-button--primary confirm mod-compact js-add-card']")).click();
		
		WebElement listName1 = driver.findElement(By.xpath("//input[@class='list-name-input']"));
		listName1.sendKeys("List B");
		
		driver.findElement(By.xpath("//input[@value='Add list']")).click();
		
		Actions ac = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//span[@class='list-card-title js-card-name']"));
		
		WebElement destination = driver.findElement(By.xpath("//textarea[@aria-label=\"List B\"]"));
		
		ac.dragAndDrop(source, destination).perform();
		
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.xpath("//span[@class=\"list-card-title js-card-name\"]"));
		
		Point location = element.getLocation();
		
		System.out.println("Position of X point is : " +location.getX());
		System.out.println("Postion of Y point is :" +location.getY());
		
		WebElement user = driver.findElement(By.xpath("//span[@title=\"Karthick Sakthivel (karthicksakthivel1116)\"]"));
		user.click();
		
		WebElement logout = driver.findElement(By.xpath("//*[text()='Log out']"));
		logout.click();
		
	}

}

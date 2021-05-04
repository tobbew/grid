/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 *
 * @author wastgard
 */
public class myTest2 {
    WebDriver driver;
    
    public void launchBrowser() throws InterruptedException {
         
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
    
        driver.get("https://www.actitime.com/");
        
    }
    
    public void createUser() throws InterruptedException{
        
        
        driver.findElement(By.xpath("//*[@id=\"HeaderVue\"]/header/div/div/div[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"HeaderVue\"]/header/div/div/div[2]/div/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("first-name")).sendKeys("Torbjörn");
        driver.findElement(By.id("last-name")).sendKeys("Västgård");
        driver.findElement(By.id("email")).sendKeys("iuhdwq@hwwuhd.com");
        Thread.sleep(3000);
  
    }
    
    public void closeBrowser(){
        driver.quit(); 
    }
    
    public static void main(String[] args) throws InterruptedException {
       myTest2 obj = new myTest2();
       obj.launchBrowser();
       obj.createUser();
       obj.closeBrowser();
    }
}
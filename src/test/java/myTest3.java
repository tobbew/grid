/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 *
 * @author wastgard
 */
public class myTest3 {
    
   WebDriver driver;
    
    public void launchBrowser() throws InterruptedException {
         
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
    
        driver.get("https://Adlibris.Com/se/");
        
    }
    
    public void searchBook() throws InterruptedException{
        
            driver.findElement(By.id("q")).sendKeys("praktisk mjukvarutestning");
            driver.findElement(By.id("q")).sendKeys(Keys.RETURN);
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"search-hits\"]/div/div/div[1]/div/h4/a")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div[2]/div/div[4]/div/button")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div/header/button[2]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div/header/div[4]/div/a")).click();
            Thread.sleep(3000);
        
    }
    
    public void closeBrowser(){
        driver.quit(); 
    }
    
    public static void main(String[] args) throws InterruptedException {
       myTest3 obj = new myTest3();
       obj.launchBrowser();
       obj.searchBook();
       obj.closeBrowser();
    }
    
}

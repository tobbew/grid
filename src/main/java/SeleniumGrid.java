/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 *
 * @author wastgard
 */
public class SeleniumGrid {
    
    public static void main(String[] args) throws InterruptedException, MalformedURLException {
          ChromeOptions options = new ChromeOptions();
          String url = "http://18.232.125.165:4444/wd/hub";
          DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
          desiredCapabilities.setPlatform(Platform.ANDROID);
          WebDriver driver = new RemoteWebDriver(new URL(url), (Capabilities) options);
          driver.get("https://Test.Com");
          System.out.println(driver.getCurrentUrl());
          driver.quit();
    }
}
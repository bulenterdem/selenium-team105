package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_WindowHandleDegeri {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.amazon.com");

       System.out.println( driver.getWindowHandle() ); //CDwindow-9CDA76E6F7DDF184E75EB8F07DA6B383


        driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://www.wisequarter.com");
        System.out.println(driver.getWindowHandle()); //CDwindow-5E98C9C190803F36620164481CC542BC



        Thread.sleep(3000);
        driver.quit();
    }
}

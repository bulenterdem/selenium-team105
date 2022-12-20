package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DirverNavigateMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("wedriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("http://www.amazon.com");
        // get ile ayni islevi yapar

        Thread.sleep(3000);
        driver.get("http://www.wisequarter.com");

        // yeniden amazona donelim
        Thread.sleep(3000);
        driver.navigate().back();

        //tekrar wisequarter.com a gitmek istersek
        Thread.sleep(3000);
        driver.navigate().forward();



        Thread.sleep(3000);
        driver.quit();
    }
}

package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_DriverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("wedriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // gittigimiz sayfa acilinciya veya aradigimiz web element bulununcaya kadar
        //driverin bekleyebilecigi  max sureyi belirler

        // bu dortlu her test methodumuzun basina yazilacak

        // driver.get("http://www.amazon.com");
        // driver.get("http://www.wisequarter.com");








        Thread.sleep(3000);
        driver.quit();
    }
}

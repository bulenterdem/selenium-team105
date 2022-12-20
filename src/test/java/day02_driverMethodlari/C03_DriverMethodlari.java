package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("wedriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://www.amazon.com");
        // System.out.println(driver.getPageSource());

        // pagesource'un MEOW icerdigini test edin

        String pageSource = driver.getPageSource();
        String expectedKelime= "MEOW";

        if (pageSource.contains(expectedKelime)){
            System.out.println("page sorce testi PASS");
        } else {
            System.out.println("Page source testi FAILED' MEOW kelimesi bulamadi");
        }



        Thread.sleep(3000);
        driver.close();
    }
}

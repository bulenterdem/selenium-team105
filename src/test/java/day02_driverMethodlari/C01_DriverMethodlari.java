package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethodlari {

    public static void main(String[] args) throws InterruptedException {

        // Biz browser'lari olusturdugumuz driver sayesinde otomate edebiliyoruz
        // bunun icin her testin basinda mutlaka driver objesi olusturacagiz

        System.setProperty("wedriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://www.amazon.com");

       // acilan sayfanin basliginin amazon iceerdigini test edin

        String exceptedKelime = "amazon";
        String actualResult = driver.getTitle();

        if (actualResult.contains(exceptedKelime)){

            System.out.println("Title testi PASSED");
        } else {
            System.out.println("Title icermiyor TEST FAILED");
            System.out.println(driver.getTitle());
        }

        // gittigmiz sayfanin URL'nin http:www.amazon.com oldugunu test edin

        String expectedURL= "http:www.amazon.com";
        String actualUrl = driver.getCurrentUrl();

        if (expectedURL.equals(actualUrl)) {
            System.out.println("Url testi PASSED");
        } else {
            System.out.println("Istedigimiz Url degerde degil");
            System.out.println(driver.getCurrentUrl());
        }

        Thread.sleep(5000);
        driver.close();

    }
}

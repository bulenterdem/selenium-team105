package day01_driverMethodlar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driver_get {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");

        // windows olanlar sonunda .exe yazmali mac de buna gerek yok

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.amazon.com");

        Thread.sleep(5000);

        driver.close();

        /*
            selenium jar dosyalarini ve chromedriver driverini manuel olarak sisteme tanitmis olduk

            eger firefox veya safari ile calismamiz gerelirse bu defa da onlarin driverlerini indirip manuel
            olarak onlarin driver in da yuklememiz gerekir

            2. 13.satirda chromedriver() constructoruini kullanarak bir obje olusturduk
            bu objeyi kullanmasak bile bu satirdan dolayi bos bir browser acilir

            3- driver.get(url) driver yazdigimiz url'e goturur url yazarken
            wwww yazmazsak calisir ancak http:// yazmazsak method calismaz

         */


    }
}

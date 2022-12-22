package day03_locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ByLinkText {
    public static void main(String[] args) throws InterruptedException {
        // amazon ana sayfaya gidin
        // Gift card Linkini tiklayin
        // Gift kard sayfasina gittigini teste edin

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://www.ramazon.com");

       //  WebElement giftCardLinki= driver.findElement(By.linkText("Gift Cards"));
        Thread.sleep(4000);
        WebElement giftCardLinki= driver.findElement(By.partialLinkText("Gift"));
        giftCardLinki.click();


        String expectedKelime="Gift Cards";
        String actualTitle= driver.getTitle();
        // istenen sayfaya gittigini test etmek icin
        // title'in Gift card icerdigini test edebiliriz

        if (actualTitle.contains(expectedKelime)){
            System.out.println("Gift Cards testi PASSED");
        } else {
            System.out.println("Gift Card Testi FAILED");
        }



        Thread.sleep(3000);
       driver.close();
    }
}

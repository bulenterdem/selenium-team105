package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class q2 {
    public static void main(String[] args) {

         // ...Exercise2...
        // 1 - Driver olusturalim
        //  2 - Java class'imiza chromedriver.exe'yi tanitalim
        // 3 - Driver'in tum ekrani kaplamasini saglayalim
        // 4 - Driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini


        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //     söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.


        // 5 - "https://www.otto.de" adresine gidelim
               driver.get("https://www.otto.de");


        // 6 - Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
                driver.getCurrentUrl();
                driver.getTitle();

        // 7 - Title ve url'nin "OTTO" kelimesini icerip icermedigini kontrol edelim
               String expectedKelime= "OTTO";
               String actualkelime= driver.getTitle();

               if (actualkelime.contains(expectedKelime)){
                   System.out.println("Test PASSED");
               } else {
                   System.out.println("Test Failed");
               }

        // 8 - Ardindan "https://wisequarter.com/" adresine gidelim
                driver.get("https://wisequarter.com/");

        // 9 - Bu adresin basligini ve Url alalim ve "Quarter" kelimesini icerip icermedigini
        //     kontrol edelim
                driver.getTitle();
                driver.getCurrentUrl();
                String expectedKelime1= "Quarter";
                String actualkelime1= driver.getTitle();

            if (actualkelime1.contains(expectedKelime1)){
            System.out.println("Test PASSED");
        }    else {
            System.out.println("Test Failed");
        }


        // 10- Bir onceki web sayfamiza geri donelim
            driver.navigate().back();

        // 11- Sayfayi yenileyelim

                driver.navigate().refresh();
        // 12- Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
                driver.navigate().forward();
        // 13- En son adim olarak butun sayfalarimizi kapatmis olalim

        driver.quit();




    }
}

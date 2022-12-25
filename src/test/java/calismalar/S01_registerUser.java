package calismalar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class S01_registerUser {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

         // 2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully

        //4. Click on 'Signup / Login' button
        // 5. Verify 'New User Signup!' is visible
      driver.findElement(By.partialLinkText("Signup")).click();


      // 6. Enter name and email address

      driver.findElement(By.name("name")).sendKeys("bulent");

      driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("bulenterdem111@gmail.com");

        // 7. Click 'Signup' button
       WebElement signUpKutusu =driver.findElement(By.xpath("(//button[@class='btn btn-default'])[2]"));
       signUpKutusu.click();

          // 8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
       driver.findElement(By.xpath("(//div[@class=\'radio-inline\'])[1]")).click();

       // 9. Fill details: Title, Name, Email, Password, Date of birth

       WebElement Passwordkutusu= driver.findElement(By.xpath("//input[@id='password']"));

       Passwordkutusu.sendKeys("1234");

       WebElement DayKutusu= driver.findElement(By.xpath("//select[@id='days']"));

       DayKutusu.sendKeys("20");

        WebElement MonthsKutusu= driver.findElement(By.xpath("//select[@id='months']"));

        MonthsKutusu.sendKeys("June");

        WebElement YearsKutusu= driver.findElement(By.xpath("//select[@id='years']"));

        YearsKutusu.sendKeys("1978");

        //10. Select checkbox 'Sign up for our newsletter!'
         driver.findElement(By.xpath("(//label['Sign up for our newsletter!'])[8]")).click();

         // 11. Select checkbox 'Receive special offers from our partners!'
         driver.findElement(By.xpath("(//label['Receive special offers from our partners!'])[9]")).click();


        // 12. Fill details: First name, Last name, Company, Address, Address2,
        // Country, State, City, Zipcode, Mobile Number
        WebElement nameKutusu= driver.findElement(By.xpath("//input[@id='first_name']"));
        nameKutusu.sendKeys("Bulent");

        WebElement lastnameKutusu= driver.findElement(By.xpath("//input[@id='last_name']"));
        lastnameKutusu.sendKeys("Erdem");

        WebElement company= driver.findElement(By.xpath("//input[@id='company']"));
        company.sendKeys("LSTTT");

        WebElement adres1= driver.findElement(By.xpath("//input[@id='address1']"));
        adres1.sendKeys("gursel mah.");

        WebElement adres2= driver.findElement(By.xpath("//input[@id='address2']"));
        adres2.sendKeys("fasil sok.");
        driver.findElement(By.xpath("//select[@id='country']")).sendKeys("Canada");


        WebElement state= driver.findElement(By.xpath("//input[@id='state']"));
        state.sendKeys("kagithane");

        WebElement city= driver.findElement(By.xpath("//input[@id='city']"));
        city.sendKeys("istanbul");


        WebElement zipcode= driver.findElement(By.xpath("//input[@id='zipcode']"));
        zipcode.sendKeys("34446");

        WebElement mobilenumber= driver.findElement(By.xpath("//input[@id='mobile_number']"));
        mobilenumber.sendKeys("5333252525");

        //13. Click 'Create Account button'
        driver.findElement(By.xpath("(//button[@class='btn btn-default'])[1]")).click();

        //14. Verify that 'ACCOUNT CREATED!' is visible
        String expectedkelime="ACCOUNT CREATED";
        String actuallkelime= driver.findElement(By.xpath("//h2[@ class='title text-center']")).getText();

        if (actuallkelime.equals(expectedkelime)){
            System.out.println("test passed");
        } else {
            System.out.println("test FAILED");
        }
        // 15. Click 'Continue' button
        driver.findElement(By.xpath("//a[@ class='btn btn-primary']")).click();

        //driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]/div")).click();

       //  driver.findElement(By.xpath("//div[@class='ns-sc1j3-e-20']")).click();
        driver.manage().deleteAllCookies();



      // 16. Verify that 'Logged in as username' is visible
        driver.findElement(By.xpath("(//a['/logout'])[5]")).click();

        driver.findElement(By.name("email")).sendKeys("bulenterdem111@gamil.com");

        WebElement Passwordkutusu2= driver.findElement(By.xpath("//input[@ name='password']"));

        Passwordkutusu2.sendKeys("1234");




       // 17. Click 'Delete Account' button
        driver.findElement(By.xpath("(//a['delete_account'])[6]")).click();

         // 18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
       driver.findElement(By.xpath("//a[ @ class='btn btn-primary']")).click();




        Thread.sleep(3000);

        driver.close();



    }
}

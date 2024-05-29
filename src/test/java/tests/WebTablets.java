package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WebTablets {

    WebDriver driver;

    @BeforeMethod
    public void driver() {
        // open browser
        driver = new EdgeDriver();

        // set fullscreen
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        if (driver != null) {
            // close all tabs and windows
            driver.quit();
            // close current tab
            // driver.close()
        }
    }
    @Test
    public void addRegistrationForm() throws InterruptedException{
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
        Thread.sleep(2000);

        WebElement addButtonClick = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        addButtonClick.click();
        Thread.sleep(1000);
        assertTrue(addButtonClick.isEnabled());

        //enter BoagheFull Name
        WebElement enterFirstName = driver.findElement(By.xpath("//input[@id='firstname' and @placeholder='First Name']"));
        enterFirstName.click();
        enterFirstName.sendKeys("Boaghe");
        Thread.sleep(1000);

//        //enter Ion Last Name
//        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastname' and @placeholder='Last Name']"));
//        lastName.click();
//        lastName.sendKeys("Ion");
//        Thread.sleep(1000);

        //enter email
        WebElement enterEmail = driver.findElement(By.xpath("//input[@id='email' and @placeholder='Enter Email']"));
        enterEmail.click();
        enterEmail.sendKeys("ionboaghe00@gmail.com");
        Thread.sleep(1000);

        //enter Age
        WebElement enterAge = driver.findElement(By.xpath("//input[@id='age' and @placeholder='Enter Age']"));
        enterAge.click();
        enterAge.sendKeys("2000");
        Thread.sleep(1000);

        //enter Salary
        WebElement enterSalary = driver.findElement(By.xpath("//input[@id='salary' and @placeholder='Enter Salary']"));
        enterSalary.click();
        enterSalary.sendKeys("Salariul este de 40000 lei");
        Thread.sleep(1000);

        //enter Department
        WebElement enterDepartment = driver.findElement(By.xpath("//input[@id='deparment' and @placeholder='Enter Department']"));
        enterDepartment.click();
        enterDepartment.sendKeys("OSY");
        Thread.sleep(1000);

        //click Login
        WebElement clickLoginButton = driver.findElement(By.xpath("//input[@type='submit' and @value='Login']"));
        clickLoginButton.click();
        Thread.sleep(1000);

         assertThrows(NoSuchElementException.class,
                () -> driver.findElement(By.xpath("//label[@class='error']")));
/*
assertThrows(
           MyException.class,
           () -> myObject.doThing(),
           "Expected doThing() to throw, but it didn't"
    );

    assertTrue(thrown.getMessage().contains("Stuff"));
 */

    }
    }

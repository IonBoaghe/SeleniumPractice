package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestStore {


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
    public void addtoCart() throws InterruptedException{
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);

        WebElement usernameClick = driver.findElement(By.xpath("//input[@class='input_error form_input' and @placeholder='Username']"));
        usernameClick.click();
        Thread.sleep(1000);


        usernameClick.sendKeys("standard_user");
        Thread.sleep(1000);

        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys("secret_sauce");
        Thread.sleep(1000);

        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();
        Thread.sleep(1000);


    }

}

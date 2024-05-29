package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class TextBox {
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
    public void checkTextBoxTitle() throws InterruptedException {

        driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
        Thread.sleep(2000);

        WebElement textBoxTitle = driver.findElement(By.xpath("//form/h1[text()='Text Box']"));

    }

    @Test
    public void submitButton() throws InterruptedException {

        driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
        Thread.sleep(2000);

        WebElement submitbtn = driver.findElement(By.xpath("//input[@value='Submit']"));

        submitbtn.click();

        Thread.sleep(2000);

    }

    @Test
    public void populateTextBoxFields() throws InterruptedException {

        driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
        Thread.sleep(2000);

        WebElement fullNameField = driver.findElement(By.xpath("//input[@id='fullname']"));
        fullNameField.sendKeys("Boaghe Ion");
        Thread.sleep(1000);

        WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
        emailField.sendKeys("ionboaghe00@gmail.com");
        Thread.sleep(1000);

        WebElement currentAddressField = driver.findElement(By.xpath("//textarea[@id='address']"));
        currentAddressField.sendKeys("Chisinau Calea Iesilor 8");
        Thread.sleep(1000);

        WebElement passwordAddressField = driver.findElement(By.xpath("//input[@id='password']"));
        passwordAddressField.sendKeys("password1234");
        Thread.sleep(1000);

        WebElement submitbtn = driver.findElement(By.xpath("//input[@value='Submit']"));

        submitbtn.click();

        Thread.sleep(2000);

    }

    @Test
    public void checkRequiredFields() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
        //Thread.sleep(2000);

        List<WebElement> requiredElements = driver.findElements(By.xpath("//*[text()='This field is required.']"));
        assertEquals(requiredElements.size(), 4);

    }
}





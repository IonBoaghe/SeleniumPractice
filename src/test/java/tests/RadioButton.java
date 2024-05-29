package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.beans.IntrospectionException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class RadioButton {
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

    public void checkYesRadioButton() throws IntrospectionException, InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
        Thread.sleep(2000);

        WebElement yesButton = driver.findElement(By.xpath("//input[@value='igottwo']"));
        yesButton.click();
        Thread.sleep(2000);

        assertTrue(yesButton.isSelected());

    }

    @Test
    public void checkImpressiveRadioButton() throws IntrospectionException, InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
        Thread.sleep(2000);

        WebElement impressiveButton = driver.findElement(By.xpath("//input[@value='igotthree']"));
        impressiveButton.click();
        Thread.sleep(2000);

        assertTrue(impressiveButton.isSelected());
    }

    @Test
    public void checkYesImpressiveButtons() throws IntrospectionException, InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
        Thread.sleep(2000);

        //button impressive enabled
        WebElement impressiveButton = driver.findElement(By.xpath("//input[@value='igotthree']"));
        impressiveButton.click();
        Thread.sleep(2000);

        // check if yes button isDisabled=True
        WebElement yesButton = driver.findElement(By.xpath("//input[@value='igottwo']"));
        assertTrue(yesButton.isDisplayed());

    }
    @Test
    public void checkDisabledButton() throws InterruptedException{
        driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");

        WebElement disabledButton = driver.findElement(By.xpath("//input[@value='option3']"));
        
        assertTrue(disabledButton.isDisplayed());

    }
}

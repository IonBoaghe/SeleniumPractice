package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBox {
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
    public void openCheckBox() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
        Thread.sleep(2000);
        WebElement checkBoxbtn = driver.findElement(By.xpath("//a[@href='check-box.php']"));
        checkBoxbtn.click();
        Thread.sleep(2000);

    }

    @Test
    public void checkAll1MainLevels() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
        Thread.sleep(1000);

        //open Main Level 1
        WebElement mainLevel1 = driver.findElement(By.xpath("//li[@id='bs_1']/span[@class='plus']"));
        mainLevel1.click();
        Thread.sleep(1000);

        //open Sub Level 1
        WebElement subLevel1 = driver.findElement(By.xpath("//li[@id='bf_1']/span[@class='plus']"));
        subLevel1.click();
        Thread.sleep(1000);

        //close Sub Level 1
        subLevel1.click();
        Thread.sleep(1000);

        //open one more open time Sub Level 1
        subLevel1.click();
        Thread.sleep(1000);

        //close both Sub Level 1,2 and Main Level 1
        mainLevel1.click();
        Thread.sleep(1000);

    }
    @Test
    public void checkAll2MainLevels() throws InterruptedException{
        driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
        Thread.sleep(1000);

        //open Main Level 2
        WebElement mainLevel2open = driver.findElement(By.xpath("//li[@id='bs_2']/span[@class='plus']"));
        mainLevel2open.click();
        Thread.sleep(1000);

        //open Sub Level 3
        WebElement subLevel3open = driver.findElement(By.xpath("//li[@id='bf_3']/span[@class='plus']"));
        subLevel3open.click();
        Thread.sleep(1000);

        //open Sub Level 4
        WebElement subLevel4open = driver.findElement(By.xpath("//li[@id='bf_4']/span[@class='plus']"));
        subLevel4open.click();
        Thread.sleep(1000);

        //close Main Level 2
        WebElement mainLevel2close = driver.findElement(By.xpath("//li[@id='bs_2']/span[@class='plus minus']"));
        mainLevel2close.click();
        Thread.sleep(1000);

        //Open again Main Level 2
        mainLevel2open.click();
        Thread.sleep(1000);

        //close Sub Level 4
        WebElement subLevel4close = driver.findElement(By.xpath("//li[@id='bf_4']/span[@class='plus minus']"));
        subLevel4close.click();
        Thread.sleep(1000);


        //close Sub Level 3
        WebElement subLevel3close = driver.findElement(By.xpath("//li[@id='bf_3']/span[@class='plus minus']"));
        subLevel3close.click();
        Thread.sleep(1000);

    }
    @Test
    public void checkCheckBoxesLevel1() throws InterruptedException{
        driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
        Thread.sleep(2000);

        //open Main Level 1
        WebElement mainLevel1 = driver.findElement(By.xpath("//li[@id='bs_1']/span[@class='plus']"));
        mainLevel1.click();
        Thread.sleep(1000);

        //check Main Level 1
        WebElement checkMainLevel1 = driver.findElement(By.xpath("//input[@id='c_bs_1']"));
        checkMainLevel1.click();
        Thread.sleep(1000);

        //uncheck Main Level 1
        checkMainLevel1.click();
        Thread.sleep(1000);

        //open Sub Level 1
        WebElement subLevel1 = driver.findElement(By.xpath("//li[@id='bf_1']/span[@class='plus']"));
        subLevel1.click();
        Thread.sleep(1000);

        //check sub level 1
        WebElement checkSubLevel1 = driver.findElement(By.xpath("//input[@id='c_bf_1']"));
        checkSubLevel1.click();
        Thread.sleep(1000);

        //uncheck last level 2
        WebElement checkLastLevel2 = driver.findElement(By.xpath("//input[@id='c_io_2']"));
        checkLastLevel2.click();
        Thread.sleep(1000);






    }
}

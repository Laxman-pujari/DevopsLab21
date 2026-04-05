package org.test ;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebPageTest {

    WebDriver driver;

    // Runs before test starts
    @BeforeClass
    public void setup() throws  InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://laxman-pujari.github.io/DevopsLab21/");
    }

    // Actual test
    @Test
    public void testWebPageTitle() {
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
        Assert.assertEquals(title, "Data Engineer Roadmap");
    }

    // Runs after test finishes
    @AfterClass
    public void tearDown() throws InterruptedException{
        Thread.sleep(1000);
        driver.quit();
    }
}
package lesson15.hw;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class EssayJBPAppTest {
    @Test
    @Description("This test does not assert the fact that the theme was changed, just clicks the Theme Switcher button")
    public void makeWebsiteFontLight() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://essay.app/");

        String title = driver.getTitle();
        assertEquals(title, "Essay - Write better.");

        WebElement backgroundSwitcherHandle = driver.findElement(By.className("ant-switch-handle"));
        Thread.sleep(1000);
        backgroundSwitcherHandle.click();
    }
}
package lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GoogleTest {

    @Test
    public void testSearch() {
        //Create a 'driver' entity(controller) to manipulate the browser
        WebDriver driver = new ChromeDriver();
        //Go to the indicated web page
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        //Get web page's title and put it into a 'title' String variable
        String title = driver.getTitle();
        //Check that the title from the web page is equal to String "Web form"
        assertEquals(title, "Web form");

        //Will examine later. Basically makes the Test to wait 0.5sec
        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        //Find a Text Box element by its locator 'name'="my-text" and put it in variable "textBox"
        WebElement textBox = driver.findElement(By.name("my-text"));
        //The mechanism is the same as the line above
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        // Write a "Selenium" text String to the 'textBox' field
        textBox.sendKeys("Selenium");
        // Click the 'submitButton'
        submitButton.click();

        // Find a 'message' element and put it into 'message' variable
        WebElement message = driver.findElement(By.id("message"));
        // Get the text value from the message
        String value = message.getText();
        // Compare the actual text value from the message with the expected one
        assertEquals(value, "Received!");

        // close the browser
        driver.quit();
    }

    @Test
    public void testSearchGoogle() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement textBox = driver.findElement(By.className("gLFyf"));;
        textBox.sendKeys("Selenium");

        Thread.sleep(1000);

        WebElement searchButton = driver.findElement(By.className("gNO89b"));
        searchButton.click();

        WebElement title = driver.findElement(By.className("SPZz6b"));
        String value = title.getText();
        assertEquals(value, "Selenium");

        driver.quit();
    }
}

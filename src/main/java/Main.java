import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        try {
            driver.get("https://crossbrowsertesting.github.io/drag-and-drop");

            Thread.sleep(2000);
            WebElement se1 = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
            WebElement se2 = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
            Actions actions = new Actions(driver);
            actions.moveToElement(se1).clickAndHold().pause(2000).moveToElement(se2).release().build().perform();


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            Thread.sleep(2000);
            driver.quit();
        }


    }
}
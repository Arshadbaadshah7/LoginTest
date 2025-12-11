import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogle {
    public static void main(String[] args) {

        // Set your ChromeDriver path if needed
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();
    }
}

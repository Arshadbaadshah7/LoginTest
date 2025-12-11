import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static void main(String[] args) {

        // 1. Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // 2. Open Google
        driver.get("https://www.google.com");

        // 3. Find Search Box
        WebElement searchBox = driver.findElement(By.name("q"));

        // 4. Enter Text
        searchBox.sendKeys("Selenium WebDriver");

        // 5. Submit Enter key
        searchBox.submit();

        // 6. Print the page title
        System.out.println("Page Title: " + driver.getTitle());

        // 7. Close the browser
        driver.quit();
    }
}

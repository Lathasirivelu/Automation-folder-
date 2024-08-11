package demo1;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

    public static void main(String[] args) throws InterruptedException {
    
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.getcalley.com/");
        String mainWindowHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//*[@id=\"op3-element-DwEwwCkp\"]/a")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                System.out.println("Switched to new window with title: " + driver.getTitle());
          }
        }
        Thread.sleep(2000);

        driver.switchTo().window(mainWindowHandle);
        System.out.println("Switch back to the main window  " + driver.getTitle());

    }}

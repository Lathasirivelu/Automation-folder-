package demo1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class NewTest {
    WebDriver driver;
    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\latha.py\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void test() {
        driver.get("https://www.google.com/");
        Dimension size = new Dimension(1366, 768);
        driver.manage().window().setSize(size);


        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement searchBox = driver.findElement(By.name("q"));
        js.executeScript("arguments[0].scrollIntoView(true);", searchBox);
        searchBox.click();
        searchBox.sendKeys("amazon"); 
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement suggestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(),' prime video')]")));
        suggestion.click();
        driver.findElement(By.xpath("//h3[text()='Amazon.com Sign up for Prime Video']")).click();
        WebElement sha =driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[1]/div/div/div/div[1]/div/ol/li[1]/label/a"));
        Actions act = new Actions(driver);
        act.moveToElement(sha).build().perform();
        driver.findElement(By.xpath("//a[@href='/storefront/ref=atv_hom_pri_c_9zZ8D2_hm_mv?contentType=movie&contentId=home']")).click();
     //   ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
//        executorService.schedule(() -> {
//            for (int i = 0; i < 3; i++) {
                js.executeScript("window.scrollBy(0, 500);");
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }, 0, TimeUnit.SECONDS);
          }
    @Test
        public void sl() throws InterruptedException, AWTException {
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS); 
        
        Dimension size = new Dimension(1366, 768);
        driver.manage().window().setSize(size);



    	driver.get("https://demo.dealsdray.com");
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        WebDriverWait wait =new WebDriverWait(driver, 10);
        WebElement usernameField = driver.findElement(By.cssSelector("input[name='username']"));
        usernameField.sendKeys("prexo.mis@dealsdray.com");

        WebElement passwordField = driver.findElement(By.cssSelector("input[name='password']"));
        passwordField.sendKeys("prexo.mis@dealsdray.com");

        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']")); 
        loginButton.click();

        WebElement offer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".sidenavHoverShow.css-1s178v5")));
        offer.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,250)", "");


        driver.findElement(By.xpath("(//button[@name='child'])[2]")).click();
//        wait = new WebDriverWait(driver, 90);
//
//        WebElement addBulkOrdersButton = driver.findElement(By.cssSelector(".add-bulk-orders"));
//        addBulkOrdersButton.click();
        WebElement element = driver.findElement(By.xpath("//button[@type='button' and @align='right']"));
        if (element.isDisplayed() && element.isEnabled()) {
            element.click();
        } else {
            System.out.println("Element is not visible or enabled");
        }

        WebElement browser = driver.findElement(By.cssSelector(".MuiOutlinedInput-root"));
        //WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".MuiOutlinedInput-root")));
        browser.click();
//        driver.switchTo().window("File Upload");
//        WebElement el=driver.findElement(By.name("demo-data"));
//        el.sendKeys("C:\\Users\\Admin\\Documents\\Automation Project\\demao-data");
//           
        StringSelection stringSelection1 = new StringSelection("C:\\Users\\Admin\\Desktop\\Automation Project\\demo-data.xlsx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);

        Robot robot = new Robot();
        robot.setAutoDelay(1000);  
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
       // driver.findElement(By.xpath("//button[text()='Import']")).click();
        WebElement royal = driver.findElement(By.xpath("//button[text()='Import']"));
        royal.click();
        WebElement sirivelu   =   driver.findElement(By.xpath("//button[text()='Validate Data']"));
        sirivelu.click();
        Thread.sleep(3000);
//        Alert art = driver.switchTo().alert();
//        art.accept();
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException e) {
            System.out.println("No alert was present after validation");
        }
            }

	@Test
    public void run() throws InterruptedException {
  	  driver.get("https://www.google.com/");
          JavascriptExecutor js = (JavascriptExecutor) driver;
          WebElement searchBox = driver.findElement(By.name("q"));
          js.executeScript("arguments[0].scrollIntoView(true);", searchBox);
          searchBox.click();
          searchBox.sendKeys("gmail"); 
          WebDriverWait wait = new WebDriverWait(driver, 10);
          WebElement sugg= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='gmail'])[2]")));
          sugg.click();
          driver.findElement(By.xpath("//h3[text()='Email - Gmail - Google']")).click();
          Thread.sleep(3000);
          driver.findElement(By.xpath("(//a[text()='For work'])[2]")).click();
         driver.findElement(By.xpath("(//summary[@class='header__nav__group__button '])[2]")).click();
         driver.findElement(By.xpath("(//span[text()='See all apps'])[1]")).click();
         
//      WebElement searchbox =   driver.findElement(By.xpath("//span[text()='Docs']"));
//         js.executeScript("arguments[0].scrollIntoView(true);", searchBox);
//         searchbox.click();
         WebDriverWait wait2 = new WebDriverWait(driver, 10);
         WebElement suggestion = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Docs']")));
         js.executeScript("arguments[0].scrollIntoView(true);",suggestion );
         suggestion.click();
         Thread.sleep(2000);
         driver.navigate().back();
         WebDriverWait wait3 = new WebDriverWait(driver, 10);
         WebElement suggestion6 = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Forms']")));
         js.executeScript("arguments[0].scrollIntoView(true);",suggestion6 );
         suggestion6.click();
         WebElement suggestion61 = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='cloud-chatbot-chat-activate-bar-desktop']")));
         js.executeScript("arguments[0].scrollIntoView(true);",suggestion6 );
         suggestion61.click();
         
        
        }
      @Test
      public static void royal() throws InterruptedException {
   	    WebDriver driver = null;

    	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\latha.py\\drivers\\geckodriver.exe");
          try {
			driver = new FirefoxDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}          
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
          System.out.println("Switched back to the main window  " + driver.getTitle());


}
      @Test
      public  static void airtel() throws InterruptedException {

          WebDriver driver = new FirefoxDriver();
             	  driver.get("https://www.airtel.in/"); 
    	  
          WebElement ss = driver.findElement(By.xpath("//label[text()='Broadband']"));
          Actions act = new Actions(driver);
          act.moveToElement(ss).perform();            
          WebDriverWait wait = new WebDriverWait(driver, 10);
          WebElement suggestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Pay Bill / Recharge']")));
          suggestion.click();
     WebElement phoneNumberInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"serviceInstance\"]")));
      phoneNumberInput.sendKeys("9876543210");
      driver.findElement(By.xpath("//*[@id=\"buttonComponent\"]")).click();
      driver.findElement(By.xpath("//button[text()='LOCATE THESE DETAILS']")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("//button[text()='OK, GOT IT']")).click();
      driver.navigate().back();
      
//     long pageHeight = (Long) js.executeScript("return document.body.scrollHeight");
//     long scrollHeight = 0;
//      while (scrollHeight < pageHeight) {
//         js.executeScript("window.scrollBy(0, 250)");
//         scrollHeight += 250;
//         Thread.sleep(3000);           
//         
//Wait for 3 seconds after scrolling back to the top

          WebElement na3 =  driver.findElement(By.xpath("//label[text()='Explore Airtel']"));
         Actions act1 = new Actions(driver);
         act1.moveToElement(na3).build().perform();
        String sha1 = driver.getWindowHandle();
        WebElement sha = driver.findElement(By.xpath("//label[text()='Wynk']"));
        sha.click();
        Set<String> win = driver.getWindowHandles();
        System.out.println(win);
        Thread.sleep(3000);
         driver.switchTo().defaultContent();


      }
      }

        
        
        
        		
      		

        

                	
        	        
		
		

			
			

        
    



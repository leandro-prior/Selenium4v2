import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ElementPosition {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //ChromeOptions options = new ChromeOptions();
        //driver = new RemoteWebDriver(new URL("http://localhost:4444/"), options);
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Test
    public void getPositionDimension() {
        WebElement logo = driver.findElement(
                By.xpath("//*[@id='divLogo']/img"));
        Rectangle rectLogo = logo.getRect();
        System.out.println("x: " + rectLogo.getX());
        System.out.println("y: " + rectLogo.getY());
        System.out.println("Width: " + rectLogo.getWidth());
        System.out.println("Height: " + rectLogo.getHeight());
    }
}

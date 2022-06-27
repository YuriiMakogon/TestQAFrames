import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class SetupTest {


    ChromeDriver driver ;

    static void setupClass() {
        WebDriverManager.chromedriver().setup();

    }


    @BeforeClass
    public void  drivers()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @AfterClass
    public void endpiont()
    {
        //driver.quit();
    }
}
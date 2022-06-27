import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestIframes {

    WebDriver driver;



    @FindBy(xpath = "//input[@name='username']")
    public WebElement loginInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement enter;
    @FindBy(xpath = "//button[@class='sqdOP yWX7d    y3zKF     ']")
    public WebElement nextButton;

    public TestIframes(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

}

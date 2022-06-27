import org.testng.annotations.Test;

public class Iframemain extends SetupTest{

    @Test
    public void T1() {
        TestIframes loginpage = new TestIframes(driver);
        driver.get("https://www.instagram.com/");
        try {
            Thread.sleep(4000);
            loginpage.loginInput.sendKeys("yuriimakogon");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void T2(){
        TestIframes loginpage = new TestIframes(driver);
        driver.get("https://www.instagram.com/");
        try {
            Thread.sleep(4000);
            loginpage.password.sendKeys("55555555");
        }catch (Exception e){
            throw  new RuntimeException(e);
        }

    }
}

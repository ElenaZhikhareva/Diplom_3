import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import stellar_burger.LoginPage;
import stellar_burger.MainPage;
import stellar_burger.RegistrationPage;

import java.time.Duration;

import static stellar_burger.MainPage.BASE_URL;

public class RegistrationPageTests {
    WebDriver driver = new ChromeDriver();
    MainPage objMainPage = new MainPage(driver);
    LoginPage objLoginPage = new LoginPage(driver);
    RegistrationPage objRegistrationPage = new RegistrationPage(driver);

    @Before
    public void startUp() {
        driver.get(BASE_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        objMainPage.clickEnterAccountButton();
        objLoginPage.clickLinkRegister();
    }

    //Успешная регистрация
    @Test
    public void checkSuccessfulRegistrationTest() {
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        objRegistrationPage.fillNameField("Елена");
        objRegistrationPage.fillEmailField("123@gmail.ru");
        objRegistrationPage.fillPasswordField("12345678");
        objRegistrationPage.clickRegisteredButton();
        Assert.assertTrue(objRegistrationPage.checkRegisterVisible());

    }

    //Ошибка для некорректного пароля. Минимальный пароль — шесть символов.
    @Test
    public void checkInvalidPasswordTest(){
        objRegistrationPage.fillNameField("Елена");
        objRegistrationPage.fillEmailField("123@gmail.ru");
        objRegistrationPage.fillPasswordField("123");
        objRegistrationPage.clickRegisteredButton();
        Assert.assertTrue(objRegistrationPage.invalidPasswordMessageIsDisplayed());
    }

    @After
    public void teardown() {
        driver.quit();
    }

}

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import stellar_burger.ForgotPasswordPage;
import stellar_burger.LoginPage;
import stellar_burger.MainPage;
import stellar_burger.RegistrationPage;

import java.time.Duration;

import static stellar_burger.MainPage.BASE_URL;

public class LoginPageTests {
    WebDriver driver = new ChromeDriver();
    MainPage objMainPage = new MainPage(driver);
    LoginPage objLoginPage = new LoginPage(driver);
    RegistrationPage objRegistrationPage = new RegistrationPage(driver);
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);

    @Before
    public void startUp() {
        driver.get(BASE_URL);
    }

    //вход по кнопке «Войти в аккаунт» на главной
    @Test
    public void checkLoginEnterAccountButtonTest() {
        objMainPage.clickEnterAccountButton();
        objLoginPage.fillEmailField("123@gmail.ru");
        objLoginPage.fillPasswordField("12345678");
        objLoginPage.clickButtonEnter();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertTrue(objMainPage.checkoutIsDisplayed());
    }

    //вход через кнопку «Личный кабинет»
    @Test
    public void checkLoginPersonalAreaButtonTest() {
        objMainPage.clickPersonalAreaButton();
        objLoginPage.fillEmailField("123@gmail.ru");
        objLoginPage.fillPasswordField("12345678");
        objLoginPage.clickButtonEnter();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertTrue(objMainPage.checkoutIsDisplayed());
    }

    //вход через кнопку в форме регистрации
    @Test
    public void checkLoginRegistrationFormTest() {
        objMainPage.clickEnterAccountButton();
        objLoginPage.clickLinkRegister();
        objRegistrationPage.clickLinkEnter();
        objLoginPage.fillEmailField("123@gmail.ru");
        objLoginPage.fillPasswordField("12345678");
        objLoginPage.clickButtonEnter();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertTrue(objMainPage.checkoutIsDisplayed());
    }

    //вход через кнопку в форме восстановления пароля
    @Test
    public void checkLoginRestorePasswordPageTest() {
        objMainPage.clickEnterAccountButton();
        objLoginPage.clickLinkForgotPassword();
        forgotPasswordPage.clickLinkEnter();
        objLoginPage.fillEmailField("123@gmail.ru");
        objLoginPage.fillPasswordField("12345678");
        objLoginPage.clickButtonEnter();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertTrue(objMainPage.checkoutIsDisplayed());
    }

    @After
    public void teardown() {
        driver.quit();
    }
}

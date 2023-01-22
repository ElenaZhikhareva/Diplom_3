import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import stellar_burger.*;

import java.time.Duration;

import static stellar_burger.MainPage.BASE_URL;

public class PersonalAreaTests {

    WebDriver driver = new ChromeDriver();
    MainPage objMainPage = new MainPage(driver);
    LoginPage objLoginPage = new LoginPage(driver);
    PersonalAreaPage objPersonalAreaPage = new PersonalAreaPage(driver);

    @Before
    public void startUp() {
        driver.get(BASE_URL);
        objMainPage.clickPersonalAreaButton();
        objLoginPage.fillEmailField("123@gmail.ru");
        objLoginPage.fillPasswordField("12345678");
        objLoginPage.clickButtonEnter();
    }

    //Переход в личный кабинет
    @Test
    public void checkEnterPersonalRoomTest() {
        objMainPage.clickPersonalAreaButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertTrue(objPersonalAreaPage.exitButtonIsDisplayed());
    }

    //переход по клику на «Конструктор»
    @Test
    public void checkGoToConstructorByClickConstructorTest() {
        objMainPage.clickPersonalAreaButton();
        objPersonalAreaPage.clickConstructionButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertTrue(objMainPage.makeBurgerTextIsDisplayed());
    }

    //переход по клику на logo
    @Test
    public void checkGoToConstructorByClickLogoTest() {
        objMainPage.clickPersonalAreaButton();
        objPersonalAreaPage.clickLogo();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertTrue(objMainPage.makeBurgerTextIsDisplayed());
    }

    //Выход по кнопке «Выйти» в личном кабинете
    @Test
    public void checkExitFromPersonalRoomTest() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        objMainPage.clickPersonalAreaButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        objPersonalAreaPage.clickExitButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertTrue(objLoginPage.enterButtonIsDisplayed());
    }

    @After
    public void teardown() {
        driver.quit();
    }
}

import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import stellar_burger.MainPage;

import static org.hamcrest.CoreMatchers.containsString;
import static stellar_burger.MainPage.BASE_URL;

public class ConstructorTests {
    WebDriver driver = new ChromeDriver();
    MainPage objMainPage = new MainPage(driver);

    @Before
    public void startUp() {
        driver.get(BASE_URL);
    }

    //Переход к разделу «Булки»
    @Test
    public void goToBunsTest() {
        objMainPage.clickLinkSouse();
        objMainPage.clickLinkBuns();
        MatcherAssert.assertThat(objMainPage.getClassNameBun(), containsString("current"));
    }

    //Переход к разделу «Соусы»
    @Test
    public void goToSouseTest() {
        objMainPage.clickLinkSouse();
        MatcherAssert.assertThat(objMainPage.getClassNameSouse(), containsString("current"));
    }

    //Переход к разделу «Начинки»
    @Test
    public void goToFillsTest() {
        objMainPage.clickLinkFills();
        MatcherAssert.assertThat(objMainPage.getClassNameFills(), containsString("current"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

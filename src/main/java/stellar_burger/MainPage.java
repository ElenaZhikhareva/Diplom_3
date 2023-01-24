package stellar_burger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private final WebDriver driver;
    public static final String BASE_URL = "https://stellarburgers.nomoreparties.site/";
    private final By enterAccountButton = By.xpath(".//button[text() = 'Войти в аккаунт']");//Кнопка "Войти в аккаунт
    private final By personalAreaButton = By.xpath(".//p[text() = 'Личный Кабинет']"); //Кнопка "Личный кабинет"
    private final By checkoutButton = By.xpath(".//button[text() = 'Оформить заказ']");//Кнопка "Оформить заказ"
    private final By makeBurgerText = By.xpath(".//h1[text() = 'Соберите бургер']");//Текст "Соберите бургер"
    private final By bunsButton = By.xpath(".//div[@style]/div[1]");//кнопка Булки в меню
    private final By souseButton = By.xpath(".//div[@style]/div[2]");//кнопка Соусы в меню
    private final By fillsButton = By.xpath(".//div[@style]/div[3]");//кнопка Начинки в меню


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    //клик на кнопку "войти в аккаунт"
    public void clickEnterAccountButton() {
        driver.findElement(enterAccountButton).click();
    }

    //клик на кнопку "Личный кабинет"
    public void clickPersonalAreaButton() {
        driver.findElement(personalAreaButton).click();
    }

    public boolean checkoutIsDisplayed() {
        return driver.findElement(checkoutButton).isDisplayed();
    }

    public boolean makeBurgerTextIsDisplayed() {
        return driver.findElement(makeBurgerText).isDisplayed();
    }

    public void clickLinkBuns() {
        driver.findElement(bunsButton).click();
    }

    public String getClassNameBun() {
        return driver.findElement(bunsButton).getAttribute("class");
    }

    public void clickLinkSouse() {
        driver.findElement(souseButton).click();
    }

    public String getClassNameSouse() {
        return driver.findElement(souseButton).getAttribute("class");
    }

    public void clickLinkFills() {
        driver.findElement(fillsButton).click();
    }

    public String getClassNameFills() {
        return driver.findElement(fillsButton).getAttribute("class");
    }

}

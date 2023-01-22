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
    private final By linkBuns = By.xpath(".//span[text() = 'Булки']");//Ссылка на "Булки"
    private final By textBuns = By.xpath(".//h2[text() = 'Булки']");//h2 "Булки"
    private final By linkSouse = By.xpath(".//span[text() = 'Соусы']");//Ссылка на "Соусы"
    private final By textSouse = By.xpath(".//h2[text() = 'Соусы']");//h2 "Cоусы"
    private final By linkFills = By.xpath(".//span[text() = 'Начинки']");//Ссылка на "Начинки"
    private final By textFills = By.xpath(".//h2[text() = 'Начинки']"); //h2 "Cоусы"

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
        driver.findElement(linkBuns).click();
    }

    public void clickLinkSouse() {
        driver.findElement(linkSouse).click();
    }

    public void clickLinkFills() {
        driver.findElement(linkFills).click();
    }

    public boolean textBunsIsDisplayed() {
        return driver.findElement(textBuns).isDisplayed();
    }

    public boolean textSouseIsDisplayed() {
        return driver.findElement(textSouse).isDisplayed();
    }

    public boolean textFillsIsDisplayed() {
        return driver.findElement(textFills).isDisplayed();
    }
}

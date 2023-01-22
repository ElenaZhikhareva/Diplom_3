package stellar_burger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    private final WebDriver driver;
    private final By nameField = By.xpath(".//fieldset[1]/div/div/input");//Поле "Имя"
    private final By emailField = By.xpath(".//fieldset[2]/div/div/input");//Поле "Email"
    private final By passwordField = By.xpath(".//fieldset[3]/div/div/input");//Поле "Пароль"
    private final By registeredButton = By.xpath(".//button[text()='Зарегистрироваться']");//Кнопка "Зарегистрироваться"
    private final By invalidPasswordMessage = By.xpath(".//p[text()='Некорректный пароль']");// Текст "Некорректный пароль"
    private final By linkEnter = By.xpath(".//a[text()='Войти']");//Ссылка "Войти"

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillNameField(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void fillEmailField(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void fillPasswordField(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickRegisteredButton() {
        driver.findElement(registeredButton).click();
    }

    public void clickLinkEnter() {
        driver.findElement(linkEnter).click();
    }

    //проверка, что есть "Некорректный пароль"
    public boolean invalidPasswordMessageIsDisplayed() {
        return driver.findElement(invalidPasswordMessage).isDisplayed();
    }

    //Проверка, что есть кнопка Зарегистрироваться
    public boolean checkRegisterVisible() {
        return driver.findElement(registeredButton).isDisplayed();
    }
}

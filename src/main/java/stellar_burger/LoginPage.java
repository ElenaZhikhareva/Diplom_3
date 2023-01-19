package stellar_burger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;
    protected final By linkRegistration = By.linkText("Зарегистрироваться");//Ссылка  "Зарегистрироваться"
    private final By emailField = By.xpath(".//fieldset[1]/div/div/input");//Поле "Email"
    private final By passwordField = By.xpath(".//fieldset[2]/div/div/input");//Поле "Пароль"
    private final By enterButton = By.xpath(".//button[text()='Войти']");//Кнопка "Войти"
    private final By linkForgotPassword = By.xpath(".//a[text()='Восстановить пароль']");//Ссылка "Восстановить пароль"

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    //нажатие на кнопку "Зарегистироваться"
    public void clickLinkRegister() {
        driver.findElement(linkRegistration).click();
    }
    public void fillEmailField(String email) {
        driver.findElement(emailField).sendKeys(email);
    }
    public void fillPasswordField(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickButtonEnter() {
        driver.findElement(enterButton).click();
    }
    public void clickLinkForgotPassword() {
        driver.findElement(linkForgotPassword).click();
    }

    public boolean enterButtonIsDisplayed() {
        return driver.findElement(enterButton).isDisplayed();
    }
}

package stellar_burger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private final WebDriver driver;
    private final By linkEnter = By.xpath(".//a[text()='Войти']");//Ссылка "Войти"

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLinkEnter(){
        driver.findElement(linkEnter).click();
    }
}

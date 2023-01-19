package stellar_burger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalAreaPage {
    private final WebDriver driver;

    private final By exitButton = By.xpath(".//button[text()='Выход']");//Кнопка "Выход"
    private final By constructionButton = By.xpath(".//p[text() = 'Конструктор']");//Кнопка "Конструктор"

    private final By logo = By.className("AppHeader_header__logo__2D0X2");//Лого "Stellar burger"

    public PersonalAreaPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickExitButton(){
        driver.findElement(exitButton).click();
    }

    public void clickConstructionButton(){
        driver.findElement(constructionButton).click();
    }

    public void clickLogo() {
        driver.findElement(logo).click();
    }
    public boolean exitButtonIsDisplayed() {
        return driver.findElement(exitButton).isDisplayed();
    }

}

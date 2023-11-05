import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoginPage {
    private WebDriver driver;
    private ConfigIni configIni;

    //Initialize variables
    private By userName;
    private By password;
    private By usernameField;
    private By passwordField;
    private By loginButton;
    private By failureMessage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.configIni = new ConfigIni("config.ini");
    }

    public void openPage() {
        driver.get(configIni.getElementLocator("pageUrl"));
        //Set Web Elements
        userName = By.xpath(configIni.getElementLocator("userNameElement"));
        password = By.xpath(configIni.getElementLocator("passwordElement"));
        usernameField = By.id(configIni.getElementLocator("usernameFieldElement"));
        passwordField = By.id(configIni.getElementLocator("passwordFieldElement"));
        loginButton = By.id(configIni.getElementLocator("loginButtonElement"));
        failureMessage = By.xpath(configIni.getElementLocator("failureMessageElement"));
    }

    public void enterUsername() {
        //Get the first username of the array
        String UserName = driver.findElement(userName).getText();
        UserName = UserName.split("\n")[1];
        System.out.println("Username obtained: " + UserName);
        //Set Username
        driver.findElement(usernameField).sendKeys(UserName);
    }

    public void enterPassword() {
        //Get Password
        String Password = driver.findElement(password).getText();
        Password = Password.split("\n")[1];
        System.out.println("Password obtained: " + Password);
        //Set password
        driver.findElement(passwordField).sendKeys(Password);
    }

    public void clickLoginButton() {
        //Click on Login
        driver.findElement(loginButton).click();
    }

    public boolean validateLogin() {
        try {
            // Search for the failure message element
            driver.findElement(failureMessage);
            System.out.println("Element is displayed.");
            return true;
        } catch (NoSuchElementException e) {
            // If the element is not found, return false
            System.out.println("Element is not displayed.");
            return false;
        }
    }
}
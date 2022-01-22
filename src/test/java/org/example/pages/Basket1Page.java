package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Basket1 extends DriverManager {
    @FindBy(xpath = "//*[@class='header-menu']/ul[1]/li[2]")
    private WebElement ElectronicsButton;

    public void ClickOnElectronicsButton(){
        ElectronicsButton.clear();
        ElectronicsButton.click();
        }
    @FindBy(linkText = "Contact us")
    private WebElement ContactUsButton;
    public void ClickOnContactUsButton(){
        ContactUsButton.click();
    }
}

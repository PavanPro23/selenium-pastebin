package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PastebinHomePage extends BasePage {
    @FindBy(id = "postform-text")
    private WebElement codeTextField;

    @FindBy(id = "select2-postform-expiration-container")
    private WebElement pasteExpirationDropdown;

    @FindBy(xpath = "//li[text()='10 Minutes']")
    private WebElement pasteExpiration10Minutes;

    @FindBy(id = "postform-name")
    private WebElement pasteNameField;

    @FindBy(xpath = "//button[text()='Create New Paste']")
    private WebElement createNewPasteButton;

    public PastebinHomePage(WebDriver driver) {
        super(driver);
    }

    public void enterCode(String code) {
        codeTextField.sendKeys(code);
    }

    public void selectPasteExpiration() {
        pasteExpirationDropdown.click();
        pasteExpiration10Minutes.click();
    }

    public void enterPasteName(String name) {
        pasteNameField.sendKeys(name);
    }

    public void clickCreateNewPasteButton() {
        createNewPasteButton.click();
    }
}
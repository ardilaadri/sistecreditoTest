package cucumber.pageObject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://www.falabella.com.co/falabella-co")
public class  defaultUserFlow extends PageObject {

    @FindBy(xpath = "//span[contains(text(),'Categorías')]")
    WebElementFacade openHomePageCategories;
    public void openHomePageCategories() {
        openHomePageCategories.click();
    }

    @FindBy(xpath = "//p[contains(text(),'Mujer')]")
    WebElementFacade openCategoriesWomen;
    public void openCategoriesWomen() {
        openCategoriesWomen.click();
    }

    @FindBy(xpath = "//a[contains(text(),'Ropa mujer')]")
    WebElementFacade chooseWomenClothes;
    public void chooseWomenClothes( ) {
        chooseWomenClothes.click();
    }

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[2]/div[2]/section[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElementFacade chooseFirstElementInTheList;
    public void chooseFirstElementInTheList( ) {
        chooseFirstElementInTheList.click();
    }

    @FindBy(xpath = "//button[@id='testId-sizeButton-XS']")
    WebElementFacade choosePersonalSize;
    public void choosePersonalSize( ) {
        choosePersonalSize.click();
    }

    @FindBy(xpath = "//button[contains(text(),'Agregar a la Bolsa')]")
    WebElementFacade clickToAddElement;
    public void clickToAddElement( ) {
        clickToAddElement.click();
    }

    @FindBy(xpath = "//a[@id='linkButton']")
    WebElementFacade seeShoppingBag;
    public void seeShoppingBag( ) {
        seeShoppingBag.click();
    }

    @FindBy(xpath = "//button[contains(text(),'Ir a comprar')]")
    WebElementFacade goToPurchase;
    public void goToPurchase( ) {
        goToPurchase.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Ingresar')]")
    WebElementFacade confingElementToPay;
    public void confingElementToPay( ) {
        confingElementToPay.click();
    }

    @FindBy(xpath = "//input[@id='emailAddress']")
    WebElementFacade writeEmailAddress;
    public void writeEmailAddress(String emailAddress) {
        writeEmailAddress.type(emailAddress);
    }

    @FindBy(xpath = "//button[contains(text(),'Continuar')]")
    WebElementFacade clickOnContinueButton;
    public void clickOnContinueButton( ) {
        clickOnContinueButton.click();
    }

    @FindBy(xpath = "//select[@id='region']")
    WebElementFacade clickToOpenList;
    public void clickToOpenList( ) {
        clickToOpenList.click();
    }

    @FindBy(xpath = "//option[contains(text(),'ANTIOQUIA')]")
    WebElementFacade clickToChooseAntioquia;
    public void clickToChooseAntioquia( ) {
        clickToChooseAntioquia.click();
    }

    @FindBy(xpath = "//select[@id='ciudad']")
    WebElementFacade clickToOpenCities;
    public void clickToOpenCities( ) {
        clickToOpenCities.click();
    }

    @FindBy(xpath = "//option[contains(text(),'MEDELLIN')]")
    WebElementFacade clickToChooseMedellin;
    public void clickToChooseMedellin( ) {
        clickToChooseMedellin.click();
    }

    @FindBy(xpath = "//select[@id='comuna']")
    WebElementFacade clickToChooseComuna;
    public void clickToChooseComuna( ) {
        clickToChooseComuna.click();
    }

    @FindBy(xpath = "//option[contains(text(),'MEDELLIN')]")
    WebElementFacade clickToChooseOneComuna;
    public void clickToChooseOneComuna( ) {
        clickToChooseOneComuna.click();
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/section[1]/section[1]/form[1]/div[1]/div[4]/div[1]/button[1]")
    WebElementFacade goToAddressWindow;
    public void goToAddressWindow( ) {
        goToAddressWindow.click();
    }

    @FindBy(xpath = "//input[@id='address']")
    WebElementFacade writeAddressInformation;
    public void writeAddressInformation(String addressInformation) {
        writeAddressInformation.type(addressInformation);
    }

    @FindBy(xpath = "//input[@id='departmentNumber']")
    WebElementFacade writeMoreAddressInformation;
    public void writeMoreAddressInformation(String moreAddressInformation) {
        writeMoreAddressInformation.type(moreAddressInformation);
    }

    @FindBy(xpath = "//input[@id='departmentNumber']")
    WebElementFacade goToPaymentWindow;
    public void goToPaymentWindow() {
        goToPaymentWindow.click();
    }











/*
    @FindBy(xpath = "//span[contains(text(),'Ingresar')]")
    WebElementFacade loginButton;
    public void fillUserInput( ) {
        userNameBox.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Ingresar')]")
    WebElementFacade loginButton;
    public void fillUserInput( ) {
        userNameBox.click();
    }*/

}

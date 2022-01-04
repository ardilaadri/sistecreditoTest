package cucumber.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import cucumber.pageObject.defaultUserFlow;


public class defaultUserFlowSteps extends PageObject {

    @Steps
    defaultUserFlow usuario;

@Step ("^Url for the usuario$")
    public void goToFalabellaWebSite() {
        usuario.setDefaultBaseUrl("https://www.falabella.com.co/falabella-co");
        usuario.open();
    }

    @Step("^Select All Products$")
    public void selectAllProducts() {
        usuario.openHomePageCategories();
        usuario.openCategoriesWomen();
        usuario.chooseWomenClothes();
        usuario.chooseFirstElementInTheList();
        usuario.choosePersonalSize();
        usuario.clickToAddElement();
    }

    @Step("^  Start purchase process")
    public void purchaseProcess(String emailAddress, String addressInformation, String moreAddressInformation) {
        usuario.seeShoppingBag();
        usuario.goToPurchase();
        usuario.confingElementToPay();
        usuario.writeEmailAddress(emailAddress);
        usuario.clickOnContinueButton();
        usuario.clickToOpenList();
        usuario.clickToChooseAntioquia();
        usuario.clickToOpenCities();
        usuario.clickToChooseMedellin();
        usuario.clickToChooseComuna();
        usuario.clickToChooseOneComuna();
        usuario.goToAddressWindow();
        usuario.writeAddressInformation(addressInformation);
        usuario.writeMoreAddressInformation(moreAddressInformation);
    }

    @Step("^  Go to payment tab$")
    public void clicksOnLoginAndLogin() {
        usuario.goToPaymentWindow();
    }
}

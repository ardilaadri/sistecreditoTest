package cucumber;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import cucumber.steps.defaultUserFlowSteps;


@RunWith(SerenityRunner.class)
@Narrative(text = {"Any user tries to pay for products on Falabella"})
public class defaultUserFlowTest {
    @Managed
    WebDriver driver;
    @Steps
    defaultUserFlowSteps user;

    @Test
    public void userInFalabella() {
        driver.manage().window().maximize();
        user.goToFalabellaWebSite();
        user.selectAllProducts();
        user.purchaseProcess("havef80428@ehstock.com", "calle 123# 58 - 69",
                "Apto 201");
        user.clicksOnLoginAndLogin();
    }
}

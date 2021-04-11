package tests;

import com.thoughtworks.gauge.Step;
import models.AtmControlModel;

public class AtmControlTest {

    AtmControlModel model = new AtmControlModel();

    @Step("Click menu bar on upper right corner")
    public void clickMenuBar() {
        model.clickMenuBar();
    }

    @Step("Click 'ATM' at the bottom of screen")
    public void clickAtmButton() {
        model.clickAtmButton();
    }

    @Step("Click on the third ATM option")
    public void clickThirdAtm() {
        model.clickThirdAtm();
    }
}

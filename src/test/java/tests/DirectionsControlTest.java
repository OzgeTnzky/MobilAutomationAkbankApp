package tests;

import com.thoughtworks.gauge.Step;
import models.DirectionsControlModel;
import org.junit.Assert;

public class DirectionsControlTest {

    DirectionsControlModel model = new DirectionsControlModel();

    @Step("Click 'Yol Tarifi'")
    public void clickDirections() {
        model.clickDirections();
    }

    @Step("Check Google Maps is opened for directions")
    public void isStartButtonVisible() {
        Assert.assertTrue("Google maps not found!",model.isStartButtonVisible());
    }
}

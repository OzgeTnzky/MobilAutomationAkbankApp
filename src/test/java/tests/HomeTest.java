package tests;

import com.thoughtworks.gauge.Step;
import models.HomeModel;
import org.junit.Assert;

public class HomeTest {

    HomeModel homeModel = new HomeModel();

    @Step("Check that <key> is seen")
    public void checkTitle(String key) {
        Assert.assertEquals(key,homeModel.checkTitle());
    }

    @Step("Then click 'En yakın Akbank'")
    public void clickTheNearestAkbank() {
        homeModel.clickTheNearestAkbank();
    }

    @Step("Check that your location is shown correctly")
    public void checkLocation() { Assert.assertTrue("Location not found!",homeModel.checkLocation()); }
}

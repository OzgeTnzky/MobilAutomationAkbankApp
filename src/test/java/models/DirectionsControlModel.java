package models;

import org.openqa.selenium.By;

public class DirectionsControlModel extends BaseModel {

    public By btnDirections = By.id("map_detail_fragment_btnYolTarifi");
    public By btnStart = By.id("com.google.android.apps.maps:id/start_button");

    public void clickDirections() {
        clickElement(btnDirections);
    }

    public boolean isStartButtonVisible(){
        return isElementVisible(btnStart);
    }
}

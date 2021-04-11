package models;

import org.openqa.selenium.By;

public class HomeModel extends BaseModel {

    public By chkTitle = By.id("title");
    public By btnNearestAkbank = By.id("item3");
    public By chkLocation = By.xpath("//android.view.View[@content-desc='Google haritası']/android.view.View[115]");

    public String checkTitle(){
        return getText(chkTitle).replace("\n", " ");
    }

    public void clickTheNearestAkbank(){
        clickElement(btnNearestAkbank);
    }

    public boolean checkLocation(){
        return isElementVisible(chkLocation);
    }
}

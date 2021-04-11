package models;

import org.openqa.selenium.By;

public class AtmControlModel extends BaseModel{

    public By btnAtm = By.id("map_atm_selected_wrapper");
    public By btnMenuBar = By.id("akbank_header_right_btn_icon");
    public By btnAtmList = By.id("maplistrow_image");

    public void clickAtmButton(){
        clickElement(btnAtm);
    }

    public void clickMenuBar(){
        clickElement(btnMenuBar);
    }

    public void clickThirdAtm(){
        clickList(btnAtmList,2);
    }
}

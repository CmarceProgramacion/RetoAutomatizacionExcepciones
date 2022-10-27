package com.aliexpress.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectProductPage extends PageObject {
    public static final Target INPUT_SEARCH_PRODUCT = Target.the("Text field to search for a product").locatedBy("//input[@id='search-key']");
    public static final Target LABEL_NAME_PRODUCT = Target.the("Label name of product").locatedBy("//h1[contains(.,'{0}')]");
    public static final Target LABEL_DELIVERY = Target.the("Label of delivery").locatedBy("//span[@class='product-delivery-to'][text()='{0}']");
    public static final Target BUTTON_ADD_TO_CART = Target.the("Button add product to cart").locatedBy("//div[@class='product-action']//child::button[@ae_button_type='addtocart_click']");
    public static final Target LABEL_ADD_TO_CART_RESULT = Target.the("Title the result of add to cart").located(By.className("addcart-result-title"));
}

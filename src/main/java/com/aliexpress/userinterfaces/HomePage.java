package com.aliexpress.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("page:webDriver.base.url")
public class HomePage extends PageObject {
    public static final Target ICON_CLOSE_DISCOUNTS_POP_UP = Target.the("Icon to close discount popup").locatedBy("//img[@src]/following-sibling::img");
    public static final Target ICON_CLOSE_PROMO_POP_UP = Target.the("Icon to close promo popup").locatedBy("//img[@src]/preceding-sibling::img");
    public static final Target ICON_CLOSE_NOTIFICATION_POP_UP = Target.the("Icon to close notification subscription popup").locatedBy("//img [@class='_24EHh']");
    public static final Target ICON_CLOSE_WELCOME_POP_UP = Target.the("Popup close icon").locatedBy("//img[@data-spm-anchor-id='a2g0o.home.0.i8.39a670e54WsdqS']");
    public static final Target LABEL_LOGIN_POP_UP = Target.the("Message login pop-up").locatedBy("//div[text()='{0}']");

}

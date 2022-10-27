package com.aliexpress.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollByAction implements Interaction {
    private final String ejeY;

    public ScrollByAction(String ejeY) {
        this.ejeY = ejeY;
    }

    public static Performable scrollY(String ejeY) {
        return Tasks.instrumented(ScrollByAction.class, ejeY);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        JavascriptExecutor js = (JavascriptExecutor) Serenity.getDriver();
        js.executeScript("window.scrollBy(0," + ejeY + ")");
    }
}

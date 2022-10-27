package com.aliexpress.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static com.aliexpress.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CheckExceptionsPopupsTask implements Task {

    public static Performable controlPopup() {
        return Tasks.instrumented(CheckExceptionsPopupsTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(
                Check.whether(ICON_CLOSE_NOTIFICATION_POP_UP.isVisibleFor(actor)).andIfSo(Click.on(ICON_CLOSE_NOTIFICATION_POP_UP)),
                Check.whether(ICON_CLOSE_PROMO_POP_UP.isVisibleFor(actor)).andIfSo(Click.on(ICON_CLOSE_PROMO_POP_UP)),
                Check.whether(ICON_CLOSE_DISCOUNTS_POP_UP.isVisibleFor(actor)).andIfSo(Click.on(ICON_CLOSE_DISCOUNTS_POP_UP)),
                Check.whether(ICON_CLOSE_WELCOME_POP_UP.isVisibleFor(actor)).andIfSo(Click.on(ICON_CLOSE_WELCOME_POP_UP))
        );
    }
}

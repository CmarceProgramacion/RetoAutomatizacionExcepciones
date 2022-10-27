package com.aliexpress.tasks;

import com.aliexpress.models.ProductModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.openqa.selenium.Keys;

import static com.aliexpress.userinterfaces.SelectProductPage.*;

public class AddProductTask implements Task {
    private final ProductModel product;

    public AddProductTask(ProductModel product) {
        this.product = product;
    }

    public static Performable withData(ProductModel product) {
        return Tasks.instrumented(AddProductTask.class, product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(product.getProduct()).into(INPUT_SEARCH_PRODUCT).thenHit(Keys.ENTER),
                Click.on(LABEL_NAME_PRODUCT.of(product.getProduct())),
                Switch.toNewWindow(),
                Check.whether(WebElementQuestion.stateOf(LABEL_DELIVERY.of(product.getCountry())), WebElementStateMatchers.isVisible())
                        .andIfSo(Click.on(BUTTON_ADD_TO_CART))
        );
    }
}

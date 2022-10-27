package com.aliexpress.stepdefinitions;

import com.aliexpress.exceptions.ExceptionIsNotVisible;
import com.aliexpress.models.ProductModel;
import com.aliexpress.tasks.AddProductTask;
import com.aliexpress.tasks.CheckExceptionsPopupsTask;
import com.aliexpress.utils.enums.MessageExceptions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;

import java.util.List;

import static com.aliexpress.userinterfaces.SelectProductPage.LABEL_ADD_TO_CART_RESULT;
import static com.aliexpress.utils.enums.MessageExceptions.HE_ADD_RESULT_TITLE_POP_UP_IS_NOT_VISIBLE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class AddProductToBuyStepDefinition {

    @When("i add product to cart")
    public void iAddProductToCart(List<List<String>> dataList) {
        theActorInTheSpotlight().attemptsTo(
                CheckExceptionsPopupsTask.controlPopup(),
                AddProductTask.withData(new ProductModel(dataList.get(0)))
        );
    }

    @Then("i verify that the product was added")
    public void iVerifyThatTheProductWasAdded() {
        theActorInTheSpotlight().should(
                GivenWhenThen
                        .seeThat(the(LABEL_ADD_TO_CART_RESULT), WebElementStateMatchers.isVisible())
                        .orComplainWith(ExceptionIsNotVisible.class, HE_ADD_RESULT_TITLE_POP_UP_IS_NOT_VISIBLE.getMessageException())
        );
    }
}

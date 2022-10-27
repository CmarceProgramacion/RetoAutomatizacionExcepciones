package com.aliexpress.stepdefinitions;

import com.aliexpress.exceptions.ExceptionIsNotVisible;
import com.aliexpress.interactions.ScrollByAction;
import com.aliexpress.tasks.CheckExceptionsPopupsTask;
import com.aliexpress.userinterfaces.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;

import static com.aliexpress.userinterfaces.HomePage.LABEL_LOGIN_POP_UP;
import static com.aliexpress.utils.enums.MessageExceptions.THE_LOGIN_POP_UP_IS_NOT_VISIBLE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class StartOfPagesPopUpsStepDefinitions {

    @Given("that i access the aliexpress platform")
    public void thatIAccessTheAliexpressPlatform() {
        theActorInTheSpotlight().wasAbleTo(
                Open.browserOn().the(HomePage.class)
        );
    }

    @When("i close the platform pop-ups")
    public void iCloseThePlatformPopUps() {
        theActorInTheSpotlight().attemptsTo(
                CheckExceptionsPopupsTask.controlPopup()
        );
    }

    @Then("i verify that the login pop up message to appears {string}")
    public void iVerifyThatTheLoginPopUpMessageToAppears(String message) {
        theActorInTheSpotlight().attemptsTo(
                ScrollByAction.scrollY("1000")
        );

        theActorInTheSpotlight().should(
                GivenWhenThen
                        .seeThat(the(LABEL_LOGIN_POP_UP.of(message)), WebElementStateMatchers.isVisible())
                        .orComplainWith(ExceptionIsNotVisible.class, THE_LOGIN_POP_UP_IS_NOT_VISIBLE.getMessageException())
        );
    }
}

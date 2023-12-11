package hellocucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    private String today;
    private String actualAnswer;

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }


    public static class IsItFriday {
        public static String isItFriday(String today) {
            return today.toUpperCase().contains("FRIDAY") ? "TGIF" : "Nope";
        }
    }


    @Given("today is {string}")
    public void todayIsFriday(String day) {
        today = day;
    }

    @When("I ask whether it's Friday yet")
    public void iAskWhetherItSFridayYet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void iShouldBeToldString(String expectedAnswer) {
        assert expectedAnswer.equals(actualAnswer);
    }
}

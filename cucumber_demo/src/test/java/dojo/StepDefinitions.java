package dojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class StepDefinitions {
    private Order order;
    @Given("{string} who wants to buy a drink")
    public void romeoWhoWantsToBuyADrink(String owner) {
        order = new Order(owner);
    }

    @When("an order is declared for {string}")
    public void anOrderIsDeclaredForJuliette(String target) {
        order.setTarget(target);
    }

    @Then("there is {int} cocktails in the order")
    public void thereIsNoCocktailInTheOrder(int nbCocktails) {
        List<String> cocktails = order.getCocktails();
        assert cocktails.size() == nbCocktails;
    }
}

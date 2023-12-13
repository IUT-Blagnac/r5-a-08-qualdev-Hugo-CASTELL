package dojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
    private String owner;
    private String target;
    private final List<String> cocktails;

    public Order(String owner, String target, List<String> cocktails) {
        this.owner = owner;
        this.target = target;
        this.cocktails = cocktails;
    }

    public Order(String owner) {
        this(owner, null, new ArrayList<>());
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
        if(!(this.owner.equals("Romeo") && this.target.equals("Juliette"))) {
            this.addCocktails("You are not Romeo & Juliette");
        }
    }

    public List<String> getCocktails() {
        return this.cocktails;
    }

    public void addCocktails(String... cocktails) {
        Collections.addAll(this.cocktails, cocktails);
    }
}

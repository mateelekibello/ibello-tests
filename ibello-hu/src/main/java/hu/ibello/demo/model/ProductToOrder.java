package hu.ibello.demo.model;

import hu.ibello.core.Description;
import hu.ibello.data.Model;

@Model
@Description("Test data choose product to order")
public class ProductToOrder {

    private int outpost;
    private int sentinel;
    private int hunter;
    private int masterHunter;

    @Description("It is used to identify testdata.")
    private String id;

    public int getOutpost() {
        return outpost;
    }

    public int getSentinel() {
        return sentinel;
    }

    public int getHunter() {
        return hunter;
    }

    public int getMasterHunter() {
        return masterHunter;
    }

    @Override
    public String toString() {
        if (id != null) {
            return id;
        }
        return "No given id";
    }
}

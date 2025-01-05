package edwin.simplespringbootrestapi.cost;

public class Cost {
    final String owner;
    final Double cost;

    public Cost(String owner, Double cost) {
        this.owner = owner;
        this.cost = cost;
    }

    public Double getCost() {
        return cost;
    }

    public String getOwner() {
        return owner;
    }
}

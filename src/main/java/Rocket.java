import java.math.BigDecimal;

public class Rocket implements SpaceShip {
    private int cost;
    private int weight;
    private int maxWeight;
    private int currentWeight;

    public Rocket(int cost, int weight, int maxWeight, int currentWeight) {
        this.cost = cost;
        this.weight = weight;
        this.maxWeight = maxWeight;
        this.currentWeight = currentWeight;
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public void carry(Item item) {
        currentWeight = item.getWeight();
    }

    @Override
    public boolean canCarry(Item item) {
        return true;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }
}
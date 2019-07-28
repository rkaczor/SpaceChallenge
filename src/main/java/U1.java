import java.util.Random;

public class U1 extends Rocket {

    private double chanceOfLaunchExposion;
    private double chanceOflandingCrash;

    public U1(int cost, int weight, int maxWeight, int currentWeight, double chanceOfLaunchExposion, double chanceOflandingCrash) {
        super(cost, weight, maxWeight, currentWeight);
        this.chanceOfLaunchExposion = chanceOfLaunchExposion;
        this.chanceOflandingCrash = chanceOflandingCrash;
    }

    @Override
    public boolean launch() {

        //Chance of launch explosion = 5% * (cargo carried / cargo limit)
        Random random = new Random();

        return super.launch();
    }

    @Override
    //Chance of landing crash = 1% * (cargo carried / cargo limit)
    public boolean land() {
        return super.land();
    }

    @Override
    public void carry(Item item) {
        super.carry(item);
    }

    @Override
    public boolean canCarry(Item item) {
        return super.canCarry(item);
    }
}

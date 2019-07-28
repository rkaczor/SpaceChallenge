import java.util.Random;

public class U2 extends Rocket {
    private double chanceOfLaunchExposion;
    private double chanceOflandingCrash;

    public U2(int cost, int weight, int maxWeight, int currentWeight, double chanceOfLaunchExposion, double chanceOflandingCrash) {
        super(cost, weight, maxWeight, currentWeight);
        this.chanceOfLaunchExposion = chanceOfLaunchExposion;
        this.chanceOflandingCrash = chanceOflandingCrash;
    }

    @Override
    public boolean launch() {
        //Chance of launch explosion = 4% * (cargo carried / cargo limit)
        return super.launch();
    }

    @Override
    public boolean land() {
        //Chance of landing crash = 8% * (cargo carried / cargo limit) -> Random.double >
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


package GamePlay;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private Integer numberOfSides;

    public Dice(Integer numberOfSides){
        this.numberOfSides = numberOfSides;
    }

    //roll function
    public Integer roll(){
        Integer min = 1;
        Integer max = numberOfSides;

        return ThreadLocalRandom.current().nextInt(min, max);
    }
}

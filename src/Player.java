public class Player {
    private Integer healthPoints;
    private String name;

    public Player(String name, Integer healthPoints){
        this.healthPoints = healthPoints;
        this.name = name;
    }
    public void hit(Integer damage){
        this.healthPoints -= damage;
    }
    public Integer getHealthPoints() {
        return healthPoints;
    }
    public String getName() {
        return name;
    }
}

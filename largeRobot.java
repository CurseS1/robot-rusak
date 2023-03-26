import java.util.ArrayList;
import java.util.List;

public class largeRobot extends Robot  {
    private ArrayList<Robot> componentRobots;

    public largeRobot(String name, int maxHealth, int power, int i) {
        super(name, "large", maxHealth, power);
        componentRobots = new ArrayList<Robot>();
    }

    public void addComponentRobot(Robot robot) {
        componentRobots.add(robot);
    }

    public void removeComponentRobot(Robot robot) {
        componentRobots.remove(robot);
    }

    public void combine() {
        System.out.println("Combining...");
        int combinedMaxHealth = 0;
        int combinedPower = 0;
        for (Robot robot : componentRobots) {
            combinedMaxHealth += robot.getMaxHealth();
            combinedPower += robot.getPower();
        }
        setMaxHealth(combinedMaxHealth);
        setHealth(combinedMaxHealth);
        setPower(combinedPower);
        setType("large");
        System.out.println("Combined robot created!");
    }

   

    public void separate() {
        System.out.println("Separating...");
        for (Robot robot : componentRobots) {
            robot.setHealth(robot.getMaxHealth());
            robot.setType(robot.getClass().getSimpleName().toLowerCase());
        }
        componentRobots.clear();
        setType("large");
        System.out.println("Component robots separated!");
    }

    // @Override
    public  void move() {
        System.out.println("Large robot moving quickly and maneuverably...");
    }

    // @Override
    public void attack() {
        System.out.println("Large robot attacking with a variety of weapons...");
    }

    // @Override
    public void defend() {
        System.out.println("Large robot defending against enemy attack...");
    }

    // @Override
    public void heal() {
        System.out.println("Large robot healing itself...");
        setHealth(getMaxHealth());
    }

   
}
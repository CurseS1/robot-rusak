
import java.util.ArrayList;
import java.util.List;

public class centralBrain extends Robot  {
    public static Object combine;
    private ArrayList<Robot> componentRobots;
    private boolean isCombined;

    public centralBrain(String name, int maxHealth, int power, int i) {
        super(name, "central", maxHealth, power);
        componentRobots = new ArrayList<>();
        isCombined = false;
    }

 
    public void combine() {
        if (isCombined) {
            System.out.println("The robot is already combined.");
            return;
        }
        if (componentRobots.size() < 5) {
            System.out.println("Not enough component robots to combine.");
            return;
        }

        int totalHealth = 0;
        int totalPower = 0;
        for (Robot robot : componentRobots) {
            totalHealth += robot.getHealth();
            totalPower += robot.getPower();
        }

        setMaxHealth(totalHealth);
        setHealth(totalHealth);
        setPower(totalPower);

        System.out.println("The robot has combined into a larger robot with health " + getMaxHealth() + " and power " + getPower() + ".");
        isCombined = true;
    }

    public void separate() {
        if (!isCombined) {
            System.out.println("The robot is already separated.");
            return;
        }

        for (Robot robot : componentRobots) {
            robot.setHealth(robot.getMaxHealth());
        }

        setMaxHealth(0);
        setHealth(0);
        setPower(0);

        System.out.println("The robot has separated into its component robots.");
        isCombined = false;
    }

    public void addComponentRobot(Robot robot) {
        componentRobots.add(robot);
    }

    public void removeComponentRobot(Robot robot) {
        componentRobots.remove(robot);
    }

    public static void combine(List<Robot> smallerRobots) {
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
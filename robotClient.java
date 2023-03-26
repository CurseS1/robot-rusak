import java.util.ArrayList;
import java.util.List;

abstract class robotClient extends Robot{
    
    public robotClient(String name2, String string, int maxHealth2, int power2) {
        super(name2, string, maxHealth2, power2);
        
    }

    public static void main(String[] args) {
        // create a set of smaller robots
        List<Robot> smallerRobots = new ArrayList<>();
        smallerRobots.add(new MeleeRobot("Melee 1", 100, 100, 20));
        smallerRobots.add(new rangedRobot("Ranged 1", 80, 80, 30));
        smallerRobots.add(new SupportRobot("Support 1", 70, 70, 10));
        smallerRobots.add(new MeleeRobot("Melee 2", 90, 90, 15));
        smallerRobots.add(new rangedRobot("Ranged 2", 75, 75, 25));
        
        // create a larger robot that combines the smaller robots
        largeRobot largeRobot = new largeRobot("Robot Combine", 500, 500, 100);
        centralBrain.combine(smallerRobots);
        
        // demonstrate the functionality of the robot
        System.out.println("Smaller Robots:");
        for (Robot robot : smallerRobots) {
            robot.move();
            robot.attack();
            robot.defend();
            SupportRobot.heal();
        }
       largeRobot.combine();

        System.out.println("Larger Robot:");
        largeRobot.move();
        largeRobot.attack();
        largeRobot.defend();
        largeRobot.heal();
        largeRobot.separate();
    }
}
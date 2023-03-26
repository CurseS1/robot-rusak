import java.util.ArrayList;

public abstract class smallRobot extends Robot {
    private String role;
    private ArrayList<smallRobot> otherRobots;
    
    public smallRobot(String name, String role, int maxHealth, int power) {
        super(name, maxHealth, power);
        this.role = role;
        otherRobots = new ArrayList<smallRobot>();
    }
    
    public String getRole() {
        return role;
    }
    
    public void setOtherRobots(ArrayList<smallRobot> otherRobots) {
        this.otherRobots = otherRobots;
    }
    
    public void move(int x, int y) {
        // Code to move the robot to the specified location
        System.out.println(getName() + " moved to (" + x + "," + y + ")");
    }
    
    protected String getName() {
        return null;
    }

    public void attack() {
        // Code to attack an enemy
        System.out.println(getName() + " attacked an enemy!");
    }
    
    public void defend() {
        // Code to defend against an enemy attack
        System.out.println(getName() + " defended against an enemy attack!");
    }
    
    public void heal() {
        // Code to heal the robot
        System.out.println(getName() + " healed itself!");
    }
    
    public abstract void useAbility();
    
    public void communicate() {
        // Code to communicate with other robots to coordinate movements
        for (smallRobot robot : otherRobots) {
            System.out.println(getName() + " communicated with " + robot.getName());
        }
    }
}
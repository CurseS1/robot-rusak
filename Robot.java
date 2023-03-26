
public abstract class Robot {
    protected String name;
    protected String type;
    protected int health;
    protected int maxHealth;
    protected int power;

    public Robot(String name, String type, int health, int maxHealth, int power) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.maxHealth = maxHealth;
        this.power = power;
    }

    public Robot(String name2, int maxHealth2, int power2) {
    }

    public Robot(String name2, String string, int maxHealth2, int power2) {
    }

    public abstract void move();

    public abstract void attack();

    public abstract void defend();

    public abstract void heal();
    
    public int getHealth() {
        return 0;
    }

    public int getPower() {
        return 0;
    }
    public int setHealth(int totalHealth) {
        return totalHealth;
    }

    protected int setMaxHealth(int totalHealth) {
        return totalHealth;
    }
    
    protected int setPower(int totalPower) {
        return totalPower;
    }

    public int getMaxHealth() {
        return maxHealth;
    }
    protected void setType(String string) {
    }


    
}
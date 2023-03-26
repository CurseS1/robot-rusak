class rangedRobot extends smallRobot {
    private int range;
    
    public rangedRobot(String name, int maxHealth, int power, int range) {
        super(name, "ranged", maxHealth, power);
        this.range = range;
    }
    
    public void useAbility() {
        // Code to use a ranged ability
        System.out.println(getName() + " used a ranged ability!");
    }

    public  void move() {
        System.out.println("Range robot moving quickly and maneuverably...");
    }

    // @Override
    public void attack() {
        System.out.println("Range robot attacking with a variety of weapons...");
    }

    // @Override
    public void defend() {
        System.out.println("Range robot defending against enemy attack...");
    }

   
}
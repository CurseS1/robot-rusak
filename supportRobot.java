class SupportRobot extends smallRobot {
    private int healAmount;
    
    public SupportRobot(String name, int maxHealth, int power, int healAmount) {
        super(name, "support", maxHealth, power);
        this.healAmount = healAmount;
    }
    
    public void useAbility() {
        // Code to use a support ability
        System.out.println(getName() + " used a support ability to heal nearby allies!");
    }

    public  void move() {
        System.out.println("Support robot moving quickly and maneuverably...");
    }


    // @Override
    public void defend() {
        System.out.println("Support robot defending against enemy attack...");
    }

    // @Override
    public void heal() {
        System.out.println("Support robot healing itself...");

    }
}
class MeleeRobot extends smallRobot {
    private int armor;
    
    public MeleeRobot(String name, int maxHealth, int power, int armor) {
        super(name, "melee", maxHealth, power);
        this.armor = armor;
    }
    
    public void useAbility() {
        // Code to use a melee ability
        System.out.println(getName() + " used a melee ability!");
    }
   // @Override
   public  void move() {
    System.out.println("Melee robot moving quickly and maneuverably...");
}

// @Override
public void attack() {
    System.out.println("Melee robot attacking with a variety of weapons...");
}

// @Override
public void defend() {
    System.out.println("Melee robot defending against enemy attack...");
}

   
}


// Lab: Abstract Enemies
// Templete class
 
public abstract class Enemy {
 
    // protected instance variables: health, damage, name
    protected int health;
    protected int damage;
    protected String name;
 
    //Constructor to Initialize all fields
    public Enemy(int health, int damage, String name){
        this.health = health;
        this.damage = damage;
        this.name = name;
    }

    // abstract methods
    public abstract void update();
    public abstract void attack();

    //Allows for taking damage
    public void takeDamage(int amount){
        this.health -= amount;
        System.out.println( name + " was hit for "+amount+" damage. Health Remaning: " + health+".");
    }
 
    //Getter for name
    public String getName(){
        return this.name;
    }
}

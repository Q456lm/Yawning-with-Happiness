// Driver for the Enemy inheritance lab

public class GameDriver {
 
    public static void main(String[] args) {
 
        //Enemy cannot be instantiated:
        //Enemy e = new Enemy();
 
        //Makes an enemy array with all the diffrent types
        Enemy[] enemies = {new Slime("Red"), new Skeleton("Angry"), new Dragon("Friendly")};
 
        //Loops through each enemy and calls their methods
        for (Enemy enemy:enemies){
            System.out.println("\n==="+enemy.getName()+"===");
            enemy.update();
            enemy.attack();
            enemy.takeDamage(((int)(Math.random()*2)+6));
        }
 
        
    }
}

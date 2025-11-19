
// Slime enemy subclass
 
//Extends Enemy
 
public class Slime extends Enemy{
 
    public Slime(){
        super(30, 10, "Slime");
    }
 
    
    public Slime(String type){
        super(30, 10, type+" Slime");
    }
    
    
    //Implements update()
    public void update(){
        System.out.println(name+ " slowly sqwirms closer... ");
    }
 
    //Implements attack()
    public void attack(){
        System.out.println(name+" jumps at you for "+damage+" damage.");
    }
}
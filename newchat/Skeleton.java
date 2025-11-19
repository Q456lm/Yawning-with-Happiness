// Skeleton enemy subclass
 
//Extends Enemy
 
public class Skeleton extends Enemy{
 
    public Skeleton(){
        super(50, 20, "Skeleton");
    }
    
    public Skeleton(String type){
        super(50, 20, type+" Skeleton");
    }
 
    //Implements update()
    public void update(){
        System.out.println(name+ " runs around quickly.");
    }
 
    //Implements attack()
    public void attack(){
        System.out.println(name+" swings its sword at you for "+damage+" damage.");
    }
}

// Dragon enemy subclass
 
//Extends Enemy
 
public class Dragon extends Enemy{
 
    public Dragon(){
        super(100, 40, "Dragon");
    }
    
    public Dragon(String type){
        super(100, 40, type+" Dragon");
    }
 
    //Implements update()
    public void update(){
        System.out.println(name+ " flys above you.");
    }
 
    //Implements attack()
    public void attack(){
        System.out.println(name+" breathes fire for "+damage+" damage.");
    }
}

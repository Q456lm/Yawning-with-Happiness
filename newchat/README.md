Why can’t you instantiate the Enemy class?
The enemy class is abstract and abstract classes can't be instantiated

What would happen if a subclass did not implement update() or attack()?
It will return an  error stating that it doesn't implement the abstract methods.

How does using Enemy[] demonstrate polymorphism?
It defines diffrent enemies in one method and runs through each of these because they are all of type enemey but do diffrent things because of the subclasses they are.

Why is it helpful for Enemy to have a concrete method like takeDamage()?
So that if a method doesn't change between subclasses you do not have to write in each subclass

Could this design be implemented using interfaces alone? Why or why not?
Yes, but you would have to implement each method for each subclass.
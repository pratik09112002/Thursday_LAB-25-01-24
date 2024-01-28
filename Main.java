/*
 Q3)Creating one superclass Hill stations and three subclasses Manali, 
 Mussoorie, Gulmarg. Subclasses extend the superclass and override its location() 
 and famousfor() method. We will call the location() and famousfor() method by the Parent class’
 i.e. Hillstations class. As it refers to the base class object and 
 the base class method overrides the superclass method; the base class method is invoked at runtime. 

 */


package Practical_3_25_01;

public class Main 
{
    public static void main(String[] args) 
    {
        // Using the superclass reference to call overridden methods
        HillStation manali = new Manali();
        manali.location();  // Calls overridden location method in Manali class
        manali.famousFor(); // Calls overridden famousFor method in Manali class

        HillStation mussoorie = new Mussoorie();
        mussoorie.location();  // Calls overridden location method in Mussoorie class
        mussoorie.famousFor(); // Calls overridden famousFor method in Mussoorie class

        HillStation gulmarg = new Gulmarg();
        gulmarg.location();  // Calls overridden location method in Gulmarg class
        gulmarg.famousFor(); // Calls overridden famousFor method in Gulmarg class
    }
}

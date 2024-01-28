package Practical_3_25_01;

class Mussoorie extends HillStation 
{
    // Override location method
    @Override
    void location() 
    {
        System.out.println("Location: Mussoorie");
    }

    // Override famousFor method
    @Override
    void famousFor() 
    {
        System.out.println("Famous for: The Queen of Hills and scenic beauty");
    }
}
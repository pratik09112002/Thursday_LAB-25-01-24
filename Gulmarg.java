package Practical_3_25_01;

class Gulmarg extends HillStation 
{
    // Override location method
    @Override
    void location() 
    {
        System.out.println("Location: Gulmarg");
    }

    // Override famousFor method
    @Override
    void famousFor() 
    {
        System.out.println("Famous for: Skiing and beautiful landscapes");
    }
}

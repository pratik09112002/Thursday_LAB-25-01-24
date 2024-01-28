package Practical_3_25_01;

class Manali extends HillStation 
{
    // Override location method
    @Override
    void location() 
    {
        System.out.println("Location: Manali");
    }

    // Override famousFor method
    @Override
    void famousFor() 
    {
        System.out.println("Famous for: Snow-capped mountains and adventure sports");
    }
}

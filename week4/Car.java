import java.awt.Color;

public class Car
{
    private String model;
    private Color color;
    private int numPassengers;
    private double amountOfGas;
    private final double mpg;

    public Car()
    {
        model = "Mustang";
        color = Color.YELLOW;
        numPassengers = 2;
        amountOfGas = 12.5;
        mpg = 15.0;
    }

    public String toString()
    {
        return "This is my Mustang";
    }

    /**
     * Drives the car the given distane. Subtracts gas from the tank
     *
     * @param distance the distance driben in miles
     * */
     public void drive(double distance)
     {
         amountOfGas -= distance / mpg;
     }

    /**
     * Gets the amount of gas in the tank
     * @return amount of gas
     */

     public double getAmountOfGas()
     {
         return amountOfGas;
     }
}
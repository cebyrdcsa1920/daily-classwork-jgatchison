import java.awt.Color;

public class House
{
    private String build;
    private Color color;
    private int numOccupants;
    private double amountOfAcres;

    public House()
    {
        build = "Two Story";
        color = Color.RED;
        numOccupants = 3;
        amountOfAcres = 12.5;
    }
    public String toString()
    {
        return "This is my House";
    }
}
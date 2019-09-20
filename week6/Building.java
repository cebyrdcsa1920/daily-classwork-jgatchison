public class Building
{
    private String name;
    private int floors;
    private double height;
    private boolean tradingCompany;

    public Building()
    {
        name = "tower";
        floors = 23;
        height = 500.0;
        tradingCompany = true;
    }

    public Building(String name, int floors, double height, boolean tradingCompany)
    {
        this.name = name;
        this.floors = floors;
        this.height = height;
        this.tradingCompany = tradingCompany;
    }
}
public class FootballGame
{
    private String name;
    private int age;
    private double time;
    private boolean scoredPoints;

    public FootballGame()
    {
        name = "Byrd";
        age = 95;
        time= 2.3;
        scoredPoints = true;
    }
    public FootballGame(String name, int age, double time, boolean scoredPoints)
    {
        this.name = name;
        this.age = age;
        this.time = time;
        this.scoredPoints = scoredPoints;
    }
}
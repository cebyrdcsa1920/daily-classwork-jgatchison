public class Teacher
{
    private int age;
    private double grade;
    private String name;
    private boolean isSmart;

    public Teacher
    {
        age = 30;
        grade = 90.5;
        name = "Goebel";
        isSmart = true;
    }

    public Teacher(int age, double grade, String name, boolean isSmart)
    {
        this.age = age;
        this.grade = grade;
        this.name = name;
        this.isSmart = isSmart;
    }
}
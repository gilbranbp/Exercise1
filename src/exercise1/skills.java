package exercise1;

public class skills 
{
    String skill1;
    String skill2;
    String skill3;
    
    skills()
    {
        this.skill1 = "1. Good in following instructions";
        this.skill2 = "2. Good in coordination";
        this.skill3 = "3. Good in basic troubleshooting";
    }
    
    public void printSkills()
    {
        System.out.println("Working Skills          : " + skill1 + "\n\t\t\t  " + skill2 + "\n\t\t\t  " + skill3);
    }
}

package exercise1;

public class talents {
  
    String talent1;
    String talent2;
    String talent3;
    
    talents()
    {
        this.talent1 = "1. Good in FPS Video Games";
        this.talent2 = "2. Decent in Java Programming";
        this.talent3 = "3. Great in cooking";
    }
    
    public void printTalents()
    {
        System.out.println("Talents                 : " + talent1 + "\n\t\t\t  " + talent2 + "\n\t\t\t  " + talent3);
    }
}

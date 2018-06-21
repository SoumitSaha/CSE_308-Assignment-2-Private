package observertest;

/**
 *
 * @author SOUMIT
 */
public class Student{
    
    private String Info;
    private static int IDtracker = 0;
    public int ID;
    public String StdName;
    
    private Subject cr;
    
    public  Student(Subject CR, String name){
        this.cr = CR;
        this.StdName = name;
        this.ID = ++IDtracker;
        cr.subscribe(this);
        System.out.println("Student ID : " + this.ID + " has been subscribed.");
    }

    public void update(String newInfo) {
        this.Info = newInfo;
        PrintMsgfromCR();
    }
    
    public void PrintMsgfromCR(){
        System.out.println("Department has updated some information.");
        System.out.println("\tNew information :");
        System.out.println(Info);
        System.out.println("- from CR");
    }
}

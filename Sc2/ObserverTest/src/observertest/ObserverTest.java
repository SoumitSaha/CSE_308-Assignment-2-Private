package observertest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author SOUMIT
 */
public class ObserverTest {

    /**
     * @param args the command line arguments
     */
    
    private static ArrayList<Student> students;
    
    public static void main(String[] args) {
        Subject cr = new CR();
        students = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("CR created.");
        
        while(true){
            System.out.println("1.Add/Subscribe\t\t2.Remove/unsubscribe");
            System.out.println("3.Update and Notify\t4.See all Subscriber(s)");
            int ch;
            ch = in.nextInt();
            if(ch == 1){
                System.out.println("Name : ");
                Scanner inp = new Scanner(System.in);
                String msg = inp.nextLine();
                Student std = new Student(cr,msg);
                students.add(std);
            }
            
            else if(ch == 2){
                System.out.println("ID : ");
                int id = in.nextInt();
                //System.out.println(id);
                Student delstd;
                Boolean found = false;
                for (Iterator<Student> it = students.iterator(); it.hasNext();) {
                    Student st = it.next();
                    if(st.ID == id){
                        delstd = st;
                        found = true;
                        students.remove(delstd);
                        cr.unsubscribe(id);
                        break;
                    }
                }
                if(!found){
                    System.out.println("No stdent by ID : " + id);
                }
            }
            
            else if(ch == 3){
                System.out.println("New Info from Dept : ");
                Scanner inp = new Scanner(System.in);
                String msg = inp.nextLine();
                cr.getNewInfofromDept(msg);
            }
            
            else if(ch == 4){
                for (Iterator<Student> it = students.iterator(); it.hasNext();) {
                    Student st = it.next();
                    System.out.println("Name : " + st.StdName + ", ID : " + st.ID);
                }
            }
            
            else{
                break;
            }
        }
    }
    
}

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
            System.out.println("1.Add/Subscribe     2.Remove/unsubscribe    3.Update and Notify");
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
                        System.out.println("Student with ID : " + delstd.ID + " unsubscribed.");
                        students.remove(delstd);
                        break;
                    }
                }
                if(!found){
                    System.out.println("No stdent by ID : " + id);
                }
                cr.unsubscribe(id);
            }
            else if(ch == 3){
                System.out.println("New Info from Dept : ");
                Scanner inp = new Scanner(System.in);
                String msg = inp.nextLine();
                cr.getNewInfofromDept(msg);
            }
            else{
                break;
            }
        }
    }
    
}

package observertest;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ASUS
 */
public class CR implements Subject{
    
    private ArrayList<Student> students;
    private String InfofromDept;
    
    public CR(){
        students = new ArrayList<>();
    }
    
    @Override
    public void subscribe(Student s) {
        students.add(s);
    }

    @Override
    public void unsubscribe(int id) {
        Student delstd;
        Boolean found = false;
        for (Iterator<Student> it = students.iterator(); it.hasNext();) {
            Student st = it.next();
            if(st.ID == id){
                delstd = st;
                found = true;
                System.out.println("Student with ID : " + delstd.ID + " and Name : " + delstd.StdName + " unsubscribed.");
                students.remove(delstd);
                break;
            }
        }
        if(!found){
            System.out.println("No stdent by ID : " + id);
        }
    }

    @Override
    public void notifyallstudent() {
        for(Student st:students){
            st.update(InfofromDept);
        }
    }
    
    @Override
    public void getNewInfofromDept(String MSG){
        this.InfofromDept = MSG;
        notifyallstudent();
    }
}

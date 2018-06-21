package observertest;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class CR implements Subject{
    
    private ArrayList<Observer> students;
    private String InfofromDept;
    
    public CR(){
        students = new ArrayList<>();
    }
    
    @Override
    public void subscribe(Observer s) {
        students.add(s);
    }

    @Override
    public void unsubscribe(Observer s) {
        students.indexOf(s);
        System.out.println();
        students.remove(s);
    }

    @Override
    public void notifyallstudent() {
        for(Observer st:students){
            st.update(InfofromDept);
        }
    }
    
    public void getNewInfofromDept(String MSG){
        this.InfofromDept = MSG;
        notifyallstudent();
    }
}

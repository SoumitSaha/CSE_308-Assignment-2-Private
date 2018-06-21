package observertest;

/**
 *
 * @author SOUMIT
 */
public interface Subject {
    public void subscribe(Student s);
    public void unsubscribe(int id);
    public void notifyallstudent();
    public void getNewInfofromDept(String MSG);
}

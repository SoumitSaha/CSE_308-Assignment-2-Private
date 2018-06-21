package observertest;

/**
 *
 * @author SOUMIT
 */
public interface Subject {
    public void subscribe(Observer s);
    public void unsubscribe(Observer s);
    public void notifyallstudent();
}

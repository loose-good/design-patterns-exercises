package p5;

import java.util.HashSet;
import java.util.Set;

public abstract class Subject {

    protected Set<Observer> observers = new HashSet<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void update() {
        IssueReport report = computeIssueReport();

        observers.forEach(o -> o.notify(report));
    }

    protected abstract IssueReport computeIssueReport();
}

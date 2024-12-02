package p5;

public class Manager implements Observer {
    private final String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void update(IssueReport issueReport) {
        System.out.println(" I am manager " + name + "!\n I got the report " + issueReport);
    }
}

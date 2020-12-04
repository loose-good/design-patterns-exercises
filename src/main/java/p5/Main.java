package p5;

public class Main {

    public static void main(String[] args) {
        Jira jira = new Jira();

        jira.subscribe(new Manager("Andy"));

        jira.createIssue("1");
        jira.createIssue("2");
        jira.createIssue("3");

        jira.subscribe(new Manager("Darius"));


        jira.createIssue("4");

        jira.closeIssue("3");
        jira.closeIssue("4");
    }
}

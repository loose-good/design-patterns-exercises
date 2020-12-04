package p5;

import java.util.HashMap;
import java.util.Map;

public class Jira extends Subject {

    private Map<String, Issue> issues = new HashMap<>();

    public void createIssue(String id) {
        issues.put(id, new Issue(id));
        update();
    }

    public void closeIssue(String id) {
        Issue issue = issues.get(id);
        if (issue != null) {
            issue.close();
            update();
        }
    }

    @Override
    public void update() {
        System.out.println("Updating");
        super.update();
    }

    @Override
    protected IssueReport computeIssueReport() {
        return new IssueReport(
                (int) issues.values().stream().filter(issue -> issue.getStatus() == IssueStatus.OPEN).count(),
                (int) issues.values().stream().filter(issue -> issue.getStatus() == IssueStatus.CLOSED).count()
        );
    }
}

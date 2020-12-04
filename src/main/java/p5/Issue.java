package p5;


import java.util.Objects;

public class Issue {

    private String id;
    private IssueStatus status = IssueStatus.OPEN;

    public Issue(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IssueStatus getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Issue issue = (Issue) o;

        return Objects.equals(id, issue.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public void close() {
        this.status = IssueStatus.CLOSED;
    }
}

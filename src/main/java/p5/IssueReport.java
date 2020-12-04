package p5;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IssueReport {
    private int openIssues;
    private int closedIssues;
}

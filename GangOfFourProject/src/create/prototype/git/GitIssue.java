package create.prototype.git;

import java.util.Objects;
import java.util.function.Function;

public class GitIssue implements Cloneable{
    private GitRepository gitRepository;
    private String message;

    public GitIssue(){}
    public GitIssue(GitRepository gitRepository, String message) {
        this.gitRepository = gitRepository;
        this.message = message;
    }

    public GitRepository getGitRepository() {
        return gitRepository;
    }

    public void setGitRepository(GitRepository gitRepository) {
        this.gitRepository = gitRepository;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public GitIssue clone() throws CloneNotSupportedException {
        return (GitIssue) super.clone();
    }

    public <R extends GitIssue> R clone(Function<? super GitIssue, R> func) {
        return func.apply(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GitIssue gitIssue = (GitIssue) o;
        return Objects.equals(gitRepository, gitIssue.gitRepository) && Objects.equals(message, gitIssue.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gitRepository, message);
    }

    @Override
    public String toString() {
        return "GitIssue{" +
                "gitRepository=" + gitRepository +
                ", message='" + message + '\'' +
                '}';
    }
}

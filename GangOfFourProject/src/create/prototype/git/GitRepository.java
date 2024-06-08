package create.prototype.git;

public class GitRepository {
    private String URL;

    public GitRepository(String URL) {
        this.URL = URL;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    @Override
    public String toString() {
        return "GitRepository{" +
                "URL='" + URL + '\'' +
                '}';
    }
}

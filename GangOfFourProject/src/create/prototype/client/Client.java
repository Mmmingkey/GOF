package create.prototype.client;

import create.prototype.git.GitIssue;
import create.prototype.git.GitRepository;

import java.util.function.Function;

public class Client {

    public static void main(String[] args) throws Exception{
        GitIssue gitIssue = new GitIssue(new GitRepository("https://github.com/Mmmingkey"),
                "Prototype");

        //만약 GitIssue를 생성하는게 DB접근 등 cost가 높은 네트워크 통신을 필요로 한다고 가정하에
        //이를 다른 객체로 복사하는것이 prototype

        // 1. Sallow copy
        GitIssue copy1 = gitIssue;

        // 2. 내부 참조값만 Sallow copy (Object에서 제공하는 clone 메소드 이용)
        GitIssue copy2 = gitIssue.clone();

        // 3. clone 메소드를 override 해서 deep 복사
        GitIssue copy3 = gitIssue.clone( (git) -> {
            GitIssue result = new GitIssue(new GitRepository(git.getGitRepository().getURL()),
                    git.getMessage());
           return result;
        });

        System.out.println(gitIssue == copy1);
        System.out.println(gitIssue == copy2);
        System.out.println(gitIssue == copy3);

        System.out.println("==========================");

        System.out.println(gitIssue.getGitRepository() == copy1.getGitRepository());
        System.out.println(gitIssue.getGitRepository() == copy2.getGitRepository());
        System.out.println(gitIssue.getGitRepository() == copy3.getGitRepository());

        System.out.println("==========================");

        System.out.println(gitIssue.equals(copy1));
        System.out.println(gitIssue.equals(copy2));
        System.out.println(gitIssue.equals(copy3));

        System.out.println("==========================");

        System.out.println(copy1);
        System.out.println(copy2);
        System.out.println(copy3);

        gitIssue.getGitRepository().setURL("changeURL");
        System.out.println("==========================");

        System.out.println(copy1);
        System.out.println(copy2);
        System.out.println(copy3);

    }
}

import java.util.ArrayList;
import java.util.List;

public class SocialMediaAccount {
  private   List<Follower> followers = new ArrayList<>();
  private String latestPost;

  public void addFollower(Follower follower) {
    followers.add(follower);
  }

  public void removeFollower(Follower follower) {
      followers.remove(follower);
  }

  public String getLatestPost(String message) {
      this.latestPost = message;
      notifyFollowers();

      return message;
  }

  private void notifyFollowers() {
      for (Follower follower :followers) {
          follower.update(latestPost);
      }

  }
}

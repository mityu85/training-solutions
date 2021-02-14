package week15d03;

import java.util.List;

public class PostFinder {

    List<Post> postList;

    public PostFinder(List<Post> postList) {
        this.postList = postList;
    }

    public Post findPostsFor(String user) {
        Post result = null;
        for (Post p : postList) {
            if (p.getOwner().equals(user)) {
                result = p;
            }
        }
        return result;
    }
}

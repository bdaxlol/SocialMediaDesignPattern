package socialmedia;

/**
 * @author Ducks
 * @since 7/8/2015
 */
public class YouTubeAdapter implements SocialMediaEntry {
    YouTubeVideo youTubeVideo;

    public YouTubeAdapter(YouTubeVideo youTubeVideo) {
        this.youTubeVideo = youTubeVideo;
    }

    @Override
    public String getPostText() {
        return youTubeVideo.getTitle();
    }

    @Override
    public String getUser() {
        return youTubeVideo.getAuthor();
    }
}

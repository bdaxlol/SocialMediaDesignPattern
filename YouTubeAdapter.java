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

        String titleAndDesc = youTubeVideo.getTitle() + ": " + youTubeVideo.getDescription();
        return titleAndDesc;
    }

    @Override
    public String getUser() {
        return youTubeVideo.getAuthor();
    }
}

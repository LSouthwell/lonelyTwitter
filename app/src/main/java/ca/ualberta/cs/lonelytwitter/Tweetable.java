package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Interface for Tweetable tweets
 */
public interface Tweetable {
    // getMessage returns the tweet message.
    public String getMessage();
    public Date getDate();
}
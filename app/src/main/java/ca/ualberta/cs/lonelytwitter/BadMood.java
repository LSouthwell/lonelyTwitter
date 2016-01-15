package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by southwel on 1/12/16.
 */
public class BadMood extends TweetMood {
    public BadMood (Date date, String message) {
        super(date, message);
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMood(String mood) {
        this.mood = "I am in a bad mood";
    }
}

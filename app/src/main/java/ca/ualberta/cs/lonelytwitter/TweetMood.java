package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by southwel on 1/12/16.
 */
public abstract class TweetMood {
    protected Date date;
    protected String mood;

    public TweetMood(Date date, String mood) {
        this.date = date;
        this.mood = mood;
    }

    public TweetMood(String mood){
        this.mood = mood;
        this.date = new Date();
    }


    public String getMood() {
        return mood;
    }


}

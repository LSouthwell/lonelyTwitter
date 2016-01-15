package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by southwel on 1/12/16.
 */
public abstract class Tweet {
    protected Date date;
    protected String message;
    protected ArrayList<TweetMood> moodList;

    public abstract Boolean isImportant();

    public Tweet(Date date, String message, ArrayList moodList){
        this.date = date;
        this.message = message;
        this.moodList = moodList;
    }

    public Tweet(String message){
        this.message = message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

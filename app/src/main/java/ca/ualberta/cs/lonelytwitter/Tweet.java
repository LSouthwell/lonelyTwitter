package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Class for Tweet
 */
public abstract class Tweet {
    protected Date date;
    protected String message;
    protected ArrayList<TweetMood> moodList;

    public abstract Boolean isImportant();

    /**
     * Constructor for a basic tweet
     * @param date date tweet was added
     * @param message content fo the tweet
     * @param moodList list of moods attached to the tweet
     */
    public Tweet(Date date, String message, ArrayList moodList){
        this.date = date;
        this.message = message;
        this.moodList = moodList;
    }

    public Tweet(String message){
        this.date = new Date();
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


    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }


}

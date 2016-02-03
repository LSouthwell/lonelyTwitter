package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Class for Important Tweets
 */
public class ImportantTweet extends Tweet implements Tweetable {
    /**
     * All important tweets are in fact important.
     * @return TRUE
     */
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    public ImportantTweet(Date date, String message, ArrayList moodList) {
        super(date, message,moodList);
    }

    public ImportantTweet(String message) {
        super(message);
    }

    public Date getDate() {
        return this.date;
    }

    public String getMessage() {
        return "!IMPORTANT! " + this.message;
    }
}
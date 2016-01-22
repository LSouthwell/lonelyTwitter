package ca.ualberta.cs.lonelytwitter;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by southwel on 1/12/16.
 */
public class NormalTweet extends Tweet implements Tweetable {
    public NormalTweet(Date date, String message, ArrayList moodList) {
        super(date, message, moodList);
    }

    public NormalTweet(String message) {
        super(message);
    }

    public Date getDate() {
        return this.date;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}

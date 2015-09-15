
import java.util.Date;
/**
 *
 * @author monica
 */
public class Post {
    private String topic;
    private Date dateCreated;
    private Date lastupdate;
    private boolean isAllowed;
    
    public void comment(){}
    public void rate(){}
    public void share(){}

    public String getTopic() {
        return topic;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public boolean isIsAllowed() {
        return isAllowed;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public void setIsAllowed(boolean isAllowed) {
        this.isAllowed = isAllowed;
    }
    
    
    
}


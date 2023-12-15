package vttp.ssf.assessment.eventmanagement.model;

public class event {

    private int eventId;
    private int eventSize;
    private long eventDate;
    private int participants;
    private String eventName;
    
    public int getEventId() {
        return eventId;
    }
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }
    public int getEventSize() {
        return eventSize;
    }
    public void setEventSize(int eventSize) {
        this.eventSize = eventSize;
    }
    public long getEventDate() {
        return eventDate;
    }
    public void setEventDate(int eventDate) {
        this.eventDate = eventDate;
    }
    public int getParticipants() {
        return participants;
    }
    public void setParticipants(int participants) {
        this.participants = participants;
    }
    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    @Override
    public String toString() {
        return "event [eventId=" + eventId + ", eventSize=" + eventSize + ", eventDate=" + eventDate + ", participants="
                + participants + ", eventName=" + eventName + "]";
    }
    
}

public class MusicConcertEvent{
    
    private boolean merchandiseRequired;
    private double merchandiseCost;
    private double musicConcertEventCost;
    private String eventID;
   private String eventName;
   private String eventLocation;
   private String pointOfContact;
   private Double eventCost;
   private int totalParticipants;
   private int totalEventDays;

  
    public MusicConcertEvent(String eventID, String eventName, String eventLocation, String pointOfContact, int totalParticipants, int totalEventDays, double merchandiseCost) {
        
        this.merchandiseCost = merchandiseCost;this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.pointOfContact = pointOfContact;    
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
    }


    public boolean isMerchandiseRequired() {
        return merchandiseRequired;
    }

    public void setMerchandiseRequired(boolean merchandiseRequired) {
        this.merchandiseRequired = merchandiseRequired;
    }

    public double getmerchandiseCost() {
        return merchandiseCost;
    }

    public void setmerchandiseCost(double merchandiseCost) {
        this.merchandiseCost = merchandiseCost;
    }

    public double getMusicConcertEventCost() {
        return musicConcertEventCost;
    }

    public void setMusicConcertEventCost(double musicConcertEventCost) {
        this.musicConcertEventCost = musicConcertEventCost;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getPointOfContact() {
        return pointOfContact;
    }

    public void setPointOfContact(String pointOfContact) {
        this.pointOfContact = pointOfContact;
    }

    public Double getEventCost() {
        return eventCost;
    }

    public int getTotalParticipants() {
        return totalParticipants;
    }

    public void setTotalParticipants(int totalParticipants) {
        this.totalParticipants = totalParticipants;
    }

    public int getTotalEventDays() {
        return totalEventDays;
    }

  
    public void calculateEventCost() {
         musicConcertEventCost = getEventCost() + (getmerchandiseCost() *  getTotalParticipants() * getTotalEventDays());
    }

  
    @Override
    public String toString() {
        return  "Event ID: " + getEventID() + "\n" +
                "Event Name: " + getEventName() + "\n" +
                "Event Location: " + getEventLocation() + "\n" +    
                "Total Participants: " + getTotalParticipants() + "\n" +
                "Total MusicConcert q Cost: " + musicConcertEventCost;
    }
}
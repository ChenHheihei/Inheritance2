public class PastEvents{
    
    public static final double pastEventCost = 10000.00;
    public static final double tax = 0.3; 

    private String eventID;
    private String paymentStatus;
    private boolean requiresExtension;
    private String paymentDetails;
    private String eventName;
    private String eventLocation;
    private String pointOfContact;
    private Double eventCost;
    private int totalParticipants;
    private int totalEventDays;
    

    public PastEvents(String eventID, String eventName, String eventLocation, String pointOfContact,int totalParticipants, int totalEventDays) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.pointOfContact = pointOfContact;    
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
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

    public void setTotalEventDays(int totalEventDays) {
        this.totalEventDays = totalEventDays;
    }


    public String getPaymentStatus() {
        return paymentStatus;
    }

    public boolean getRequiresExtension() {
        return requiresExtension;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setRequiresExtension(boolean requiresExtension) {
        this.requiresExtension = requiresExtension;
    }

    public void setPaymentDetails(String paymentStatus, boolean requiresExtension) {
        this.paymentDetails = "The event cost was " + pastEventCost + " and the payment is " + paymentStatus + 
        "\n" + "The Customer requires extension?:" + requiresExtension;
    }

    
    private void calculateCost() {
        double cost = 1000 + (1000 * tax);
    }

    @Override
    public String toString() {
        return "\n" + "Event ID:" + eventID + "\n" + "They past event details: " + "\n" + 
        "The payment details are as follows: " + "\n" + 
        paymentDetails;
    }
}


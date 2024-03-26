public class ConferenceEvent extends Event {
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;
    private double eventCost;
    private double conferenceEventCost;

    public ConferenceEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact,
                           double eventCost, int totalParticipants, int totalEventDays,
                           boolean breakfastRequired, double breakfastCost,
                           boolean lunchRequired, double lunchCost,
                           boolean dinnerRequired, double dinnerCost) {
        super(eventID, eventName, eventLocation, eventPointOfContact, eventCost, totalParticipants, totalEventDays);
        this.breakfastRequired = breakfastRequired;
        this.breakfastCost = breakfastCost;
        this.lunchRequired = lunchRequired;
        this.lunchCost = lunchCost;
        this.dinnerRequired = dinnerRequired;
        this.dinnerCost = dinnerCost;
    }
    public double getBreakfastCost(){
        return breakfastCost;
    }
    public void setBreakfastCost(double BreakfastCost){
        this.breakfastCost = breakfastCost;
    }
    public double getLunchCost() {
        return lunchCost;
    }
    public void setLunchCost(double LunchCost){
        this.lunchCost = lunchCost;
    }
    public double getDinnerCost() {
        return dinnerCost;
    }
    public void setDinnerCost(double DinnerCostt){
        this.dinnerCost = dinnerCost;
    }
    public double getEventCost() {
        return eventCost;
    }
    public void setEventCost(double EventCost){
        this.eventCost = eventCost;
    }

    @Override
    public void calculateEventCost(){
       conferenceEventCost = getEventCost() + ((getBreakfastCost() + getLunchCost() + getDinnerCost()));
    }

    @Override
    public String toString() {
        String eventDetails = super.toString();
        eventDetails += "\nBreakfast Required: " + breakfastRequired +
                "\nBreakfast Cost: $" + breakfastCost +
                "\nLunch Required: " + lunchRequired +
                "\nLunch Cost: $" + lunchCost +
                "\nDinner Required: " + dinnerRequired +
                "\nDinner Cost: $" + dinnerCost;

        return eventDetails;
    }
}

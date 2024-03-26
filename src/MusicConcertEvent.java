public class MusicConcertEvent {
    private boolean merchandiseRequired;
    private double merchandiseCost;


    public MusicConcertEvent(boolean merchandiseRequired, double merchandiseCost) {
        this.merchandiseRequired = merchandiseRequired;
        this.merchandiseCost = merchandiseCost;
    }

    public double calculateEventCost() {
        double eventCost = 0.0;

        if (merchandiseRequired) {
            eventCost += merchandiseCost;
        }

        return eventCost;
    }
    @Override
    public String toString() {
        return "Music Concert Event\n" +
                "Merchandise Required: " + merchandiseRequired + "\n" +
                "Merchandise Cost: $" + merchandiseCost + "\n" +
                "Total Event Cost: $" + calculateEventCost();
    }
}
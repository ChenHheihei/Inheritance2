public class Main {
    public static void main(String[] args) throws Exception{
       ConferenceEvent conferenceEvent = new ConferenceEvent("E001", "AI Conference", "Paris", "aha", 0, 0, 0, false, 0, false, 0, false, 0);
       conferenceEvent.calculateEventCost();
       System.out.println(conferenceEvent);
        MusicConcertEvent event1 = new MusicConcertEvent(true, 1000.0);
        System.out.println(event1.toString());

        MusicConcertEvent event2 = new MusicConcertEvent(false, 0.0);
        System.out.println(event2.toString());
    }
}

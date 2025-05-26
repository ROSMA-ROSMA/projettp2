package participant;

import observer.Observer;

public class Miseajourparticpant implements Observer {
    @Override
    public void onEventUpdated(String eventId, String message) {
        String nom;
        System.out.println("Notification pour " + nom + " (" + email + "): " + message);
    }
}

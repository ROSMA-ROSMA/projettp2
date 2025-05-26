package evenements;

import java.time.LocalDateTime;
import java.util.ArrayList;

public  abstract class  Evenement {
    protected String id;
    protected String nom;
    protected LocalDateTime date;
    protected String lieu;
    protected int capaciteMax;
    protected List<Participant> participants;
    protected List<EventObserver> observers;

    // Constructeurs
    public Evenement() {
        this.participants = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public Evenement(String id, String nom, LocalDateTime date, String lieu, int capaciteMax) {
        this();
        this.id = id;
        this.nom = nom;
        this.date = date;
        this.lieu = lieu;
        this.capaciteMax = capaciteMax;
    }
}

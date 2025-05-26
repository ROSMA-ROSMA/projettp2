package evenements;

import observer.Observer;
import participant.Participant;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public  abstract class  Evenement {
    protected String id;
    protected String nom;
    protected LocalDateTime date;
    protected String lieu;
    protected int capaciteMax;
    protected List<Participant> participants;
    protected List<Observer> observers;

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

    // Getters et Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
        notifierObservers("Nom de l'événement modifié: " + nom);
    }

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
        notifierObservers("Date de l'événement modifiée: " + date);
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
        notifierObservers("Lieu de l'événement modifié: " + lieu);
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public List<Participant> getParticipants() {
        return new ArrayList<>(participants);
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

}
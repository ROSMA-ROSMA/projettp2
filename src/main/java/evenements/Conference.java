package evenements;


import java.time.LocalDateTime;
import java.util.ArrayList;

public class Conference extends Evenement {
    private String theme;
    private List<Intervenant> intervenants;

    // Constructeurs
    public Conference() {
        super();
        this.intervenants = new ArrayList<>();
    }

    public Conference(String id, String nom, LocalDateTime date, String lieu, int capaciteMax, String theme) {
        super(id, nom, date, lieu, capaciteMax);
        this.theme = theme;
        this.intervenants = new ArrayList<>();
}

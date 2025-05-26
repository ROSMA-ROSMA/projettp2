package participant;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Organisateur extends Participant {
        private List<String> evenementsOrganisesIds;

    public Organisateur(String id, String nom, LocalDateTime date, String lieu, int capaciteMax) {
        super(id, nom, date, lieu, capaciteMax);
        this.evenementsOrganisesIds = new ArrayList<>();
    }
    public List<String> getEvenementsOrganisesIds() { return new ArrayList<>(evenementsOrganisesIds); }
    public void setEvenementsOrganisesIds(List<String> evenementsOrganisesIds) {
        this.evenementsOrganisesIds = evenementsOrganisesIds;
    }
}

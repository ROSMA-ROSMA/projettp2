package observer;

import evenements.Evenement;

import java.util.Map;

public interface Repertoireevenement {
    void enregistrer (Map<String, Evenement> evenements, String destination) throws Exception;
    Map<String, Evenement> load(String source) throws Exception;

}

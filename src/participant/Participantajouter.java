package participant;

public interface Participantajouter {
    void ajouterParticipant(String eventId, Participant participant) throws CapaciteMaxAtteinteException;
}

package jsonevent;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import evenements.RepertoireEvenement;

public class JsonRepertoireEvenement implements RepertoireEvenement {
    private final ObjectMapper objectMapper;

    public JsonEventRepository() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
}

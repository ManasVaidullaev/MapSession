package Gadgetarium.Models;

import Gadgetarium.Models.Enums.KeyCharacter;

import java.util.List;
import java.util.Map;

public class Characters {
    private Long id;
    private Map<KeyCharacter,List<String>>map;

    public Characters(Long id, Map<KeyCharacter, List<String>> map) {
        this.id = id;
        this.map = map;
    }

    public Characters() {
    }

    public Characters(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map<KeyCharacter, List<String>> getMap() {
        return map;
    }

    public void setMap(Map<KeyCharacter, List<String>> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "\nCharacters{" +
                "id=" + id +
                ", map=" + map +
                '}';
    }
}

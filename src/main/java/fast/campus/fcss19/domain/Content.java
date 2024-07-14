package fast.campus.fcss19.domain;

import lombok.Getter;

@Getter
public class Content {
    private final String name;
    private final String owner;

    public Content(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }
}

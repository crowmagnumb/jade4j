package de.neuland.jade4j.parser.node;

/**
 * Created by christoph on 29.10.15.
 */
public class Attr {
    private String name;
    private Object value;
    private boolean escaped;

    public Attr(String name, Object value, boolean escaped) {
        this.name = name;
        this.value = value;
        this.escaped = escaped;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

    public boolean isEscaped() {
        return escaped;
    }
}

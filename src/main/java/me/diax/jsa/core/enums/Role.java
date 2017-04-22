package me.diax.jsa.core.enums;

/**
 * Created by Comportment on 22/04/17.
 *
 * Putting the role into ROLEplay.
 */
public enum Role {

    USER("User"),
    ADMIN("Admin");

    private String name;

    Role(String name) {
        this.name = name;
    }
}

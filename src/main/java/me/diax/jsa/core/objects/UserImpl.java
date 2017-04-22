package me.diax.jsa.core.objects;

import me.diax.jsa.core.enums.Role;

/**
 * Created by Comportment on 22/04/17.
 *
 * User!
 */
public class UserImpl implements User {

    private String displayname;
    private String username;
    private Role role = Role.USER;

    public UserImpl(String displayname, String username) {
        this.displayname = displayname;
        this.username    = username;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getDisplayname() {
        return displayname;
    }

    @Override
    public Role getRole() {
        return role;
    }

    @Override
    public Contact getContact() {
        return null; //TODO: Contact WS and get contact.
    }
}
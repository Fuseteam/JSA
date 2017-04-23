package me.diax.jsa.core.objects.channel;

import me.diax.jsa.core.Skype;
import me.diax.jsa.core.SkypeImpl;
import me.diax.jsa.core.objects.message.Message;
import me.diax.jsa.core.objects.user.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Comportment on 23/04/17.
 *
 * Let's get riiiiiiiiight into the newssss!
 */
public abstract class ChannelImpl implements ChannelBase {

    private final SkypeImpl client;
    private final String identifier;
    private final Map<String, User> users = new HashMap<>();

    ChannelImpl(SkypeImpl client, String identifier) {
        this.client = client;
        this.identifier = identifier;
    }

    @Override
    public void sendMessage(String message) {
        //TODO: The WS magic stuff
    }

    @Override
    public void sendMessage(Message message) {
        sendMessage(message.getRawContent());
    }

    @Override
    public void setAlerts(boolean on) {
        //TODO: WS stuff
    }

    @Override
    public void alertOn(String keyword) {
        //TODO: WS stuff
    }

    @Override
    public User getSelfUser() {
        return getUser(getClient().getUsername());
    }

    @Override
    public User getUser(String name) {
        return getUsers().get(name);
    }

    @Override
    public Skype getClient() {
        return client;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public Map<String, User> getUsers() {
        return users;
    }
}
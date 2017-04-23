package me.diax.jsa.core.objects.channel;

import me.diax.jsa.core.SkypeImpl;
import me.diax.jsa.core.objects.user.User;

/**
 * Created by Comportment on 23/04/17.
 *
 * Time to get private
 */
public class PrivateChannelImpl extends ChannelImpl implements PrivateChannel {

    public PrivateChannelImpl(SkypeImpl client, String identifier) {
        super(client, identifier);
        load();
    }

    @Override
    public User getOtherUser() {
        return getUsers().remove(getClient().getUsername());
    }

    @Override
    protected void load() {
        this.users = null; //TODO: WS stuff
    }
}

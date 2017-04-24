package me.diax.jsa.core;

import me.diax.jsa.core.request.Dispatcher;
import me.diax.jsa.core.request.Request;
import me.diax.jsa.core.request.Requests;

/**
 * Created by Comportment on 24/04/17.
 * <p>
 * Happy w/ my naming conventions now @Crystal?
 */
public class AbstractSkype implements Skype {

    private final Request request;
    private final String ident;
    private final String secret;

    public AbstractSkype(String ident, String secret) {
        this.ident = ident;
        this.secret = secret;
        request = Requests.getToken.body("grant_type=client_credentials&client_id=" + ident + "&client_secret=" + secret + "&scope=https%3A%2F%2Fgraph.microsoft.com%2F.default");

    }

    @Override
    public void login() {
        getDispatcher().dispatch(request).handle(success -> {
            if (success.getStatus() == 200) {
                String token = success.getBody().toString();
                System.out.println(token);
            }
        });
    }

    @Override
    public Dispatcher getDispatcher() {
        return new Dispatcher();
    }
}

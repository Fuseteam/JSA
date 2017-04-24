package me.diax.jsa.testing;

import me.diax.jsa.core.AbstractSkype;
import me.diax.jsa.core.Skype;

/**
 * Created by comportment on 24/04/17.
 */
public class Main {

    public static void main(String[] args) {
        new Main().main();
    }

    public void main() {
        Skype skype = new AbstractSkype("45a37a68-68ef-4b04-9bd1-a4f0bd915e01", "JfmDQd3OVhF6gVbGWpsc0MT");
        skype.login();
    }
}

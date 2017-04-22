package me.diax.coab;

import me.diax.jsa.core.Skype;
import me.diax.jsa.core.SkypeBuilder;
import me.diax.jsa.core.enums.AccountType;
import me.diax.jsa.core.enums.Status;

/**
 * Created by Comportment on 22/04/17.
 *
 * Example for the scrubs.
 */
public class Main {

    public static void main(String[] args) {
        new Main().main();
    }

    public void main() {
        Skype skype = new SkypeBuilder(AccountType.BOT).setCredentials("45a37a68-68ef-4b04-9bd1-a4f0bd915e01", "JfmDQd3OVhF6gVbGWpsc0MT").build();
        skype.setMoodMessage("Powered by SJA (Skype Java API)").setStatus(Status.AWAY).logout();
    }
}

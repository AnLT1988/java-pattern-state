package ap.com.modules.state;

import java.lang.Exception;

import ap.com.modules.application.Application;

public class FinalizedState implements State {

    private String name = "finalized";

    public String getSaveError() {
        return "Cannot save once application is finalized, use update";
    }

	@Override
	public int update(Application app, String receipt) throws Exception {
        logger("Updating receipt");
        app.set_receipt(receipt);
        return 0;
	}

	@Override
	public State sign(Application app) {
        logger("Signing app");

        if (app.get_owner() == "An") {
            return new SignedState();
        } else {
            return this;
        }
	}

    public String get_name() {
        return name;
    }
}

package ap.com.modules.state;

import java.lang.Exception;

import ap.com.modules.application.Application;

public class DraftState implements State {
    
    private String name = "draft";

    @Override
    public int save(Application app, String owner) throws Exception {
        app.set_owner(owner);
        return 0;
    }

    @Override
    public String getUpdateError() {
       return "Update error from concrete state"; 
    }

	@Override
	public State sign(Application app) {
        logger("Signing app");

        if (app.get_owner() == "An") {
            return new SignedState();
        } else {
            return new FinalizedState();
        }
	}

    public String get_name() {
        return name;
    }

    public String getPaymentError() {
        return "Cannot make payment special ultra.";
    }
}

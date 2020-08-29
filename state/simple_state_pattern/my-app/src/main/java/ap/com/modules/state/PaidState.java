package ap.com.modules.state;

import ap.com.modules.application.Application;

public class PaidState implements State {

    public final String name = "Paid";

	@Override
	public String get_name() {
		return name;
	}
}

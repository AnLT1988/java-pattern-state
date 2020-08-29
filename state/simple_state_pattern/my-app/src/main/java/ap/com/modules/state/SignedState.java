package ap.com.modules.state;

import java.util.Random;
import ap.com.modules.application.Application;

public class SignedState implements State {

    final public String name = "Signed";

	@Override
	public State payment(Application app) throws Exception {
        logger("Making payment");
        int paymentResult = new Random().nextInt(2);
        logger("Payment result " + String.valueOf(paymentResult));
        if (paymentResult >= 1) {
            return new PaidState();
        } else {
            return this;
        }
	}

	@Override
	public String get_name() {
		return name;
	}
}

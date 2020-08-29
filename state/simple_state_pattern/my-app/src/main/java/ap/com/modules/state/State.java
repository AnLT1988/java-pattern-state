package ap.com.modules.state;

import ap.com.modules.application.Application;

public interface State {
    public String name = "State";
    default public int save(Application app, String owner) throws Exception {
        String errorMessage = prepareErrorMessage(getSaveError());
        throw new Exception(errorMessage);
    }

    default public int update(Application app, String receipt) throws Exception {
        String errorMessage = prepareErrorMessage(getUpdateError());
        throw new Exception(errorMessage);
    }

    default public State sign(Application app) throws Exception {
        String errorMessage = prepareErrorMessage(getSignError());
        throw new Exception(errorMessage);
    }

    default public State payment(Application app) throws Exception {
        String errorMessage = prepareErrorMessage(getPaymentError());
        throw new Exception(errorMessage);
    }

    public String get_name();

    default public void logger(String msg) {
        String fullMessage = "[" + get_name() + "]" + msg;
        System.out.println(fullMessage);
    }

    default String getPaymentError() {
        return "Cannot make payment.";
    }

    default String getSaveError() {
        return "Cannot save application.";
    }

    default String getUpdateError() {
        return "Cannot update application.";
    }

    default String getSignError() {
        return "Cannot sign.";
    }

    default String prepareErrorMessage(String msg) {
        String stateName = get_name();
        return "[" + stateName + "]" + msg;
    }
}

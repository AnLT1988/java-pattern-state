package ap.com.modules.application;

import ap.com.modules.state.State;

public interface Application {

    public String owner = null;
    public String receipt = null;
    public State state = null;
    public int save(String owner);
    public int update(String receipt); 
    public int sign();
    public int payment();

    default public void show() {
        System.out.println("Owner is: " + get_owner());
    }

    public String get_owner();
    public void set_owner(String owner);
    public String get_receipt();
    public void set_receipt(String receipt);
    public String get_state();
    public void set_state(State state);
}

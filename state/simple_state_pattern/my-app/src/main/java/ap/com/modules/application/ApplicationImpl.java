package ap.com.modules.application;

import ap.com.modules.state.State;
import ap.com.modules.state.DraftState;


public class ApplicationImpl implements Application {
    private String owner;
    private State state;
    private String receipt;
    
    public ApplicationImpl() {
        state = new DraftState();
    }

    public int save(String owner) {
        try {
            return state.save(this, owner);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public int update(String receipt) {
        try {
            return state.update(this, receipt);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public int sign() {
        try {
            state = state.sign(this);
            return 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public int payment() {
        try {
            state = state.payment(this);
            return 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public String get_owner() {
        return owner;
    }

    public void set_owner(String owner) {
        this.owner = owner;
    }

    public String get_receipt() {
        return receipt;
    }

    public void set_receipt(String receipt) {
        this.receipt = receipt;
    }

    public String get_state() {
        return state.get_name();
    }

    public void set_state(State state) {
        this.state = state;
    }
}

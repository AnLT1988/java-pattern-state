package ap.com;

import ap.com.modules.application.Application;
import ap.com.modules.application.ApplicationImpl;

public class Client {
    
    public static void main(String[] args) {
        System.out.println("Hello there!!!");
        Application app = new ApplicationImpl();
        app.show();
        app.save("An");
        app.payment();
        app.update("my receipt");
        app.show();
        app.sign();
        app.sign();

        app.update("my receipt");

        app.payment();
        app.sign();
    }
}

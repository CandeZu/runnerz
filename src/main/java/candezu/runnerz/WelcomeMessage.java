package candezu.runnerz;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WelcomeMessage {
    public String getWelcomeMessage() {
        return "Welcome to the Runnerz application!";
    }
}

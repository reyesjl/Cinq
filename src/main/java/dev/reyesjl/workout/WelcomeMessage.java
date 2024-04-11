package dev.reyesjl.workout;
import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {
   public String getWelcomeMessage() {
        return "Welcome to my spring boot application!";
   } 
}

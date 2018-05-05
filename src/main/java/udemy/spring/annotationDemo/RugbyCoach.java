package udemy.spring.annotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// use default instead @Component("theRugbyCoach")
@Component
public class RugbyCoach implements Coach {

    // A dependency to play with.  Give it a setter we can use
    private Motivation motivation;

//    @Autowired  // want to see if constructor AND setter autowiring can coexist
    @Qualifier("carrotMotivation")
    public void setMotivation(Motivation motivation) {
        this.motivation = motivation;
    }

    // Allow two approaches to construction. One allows the dependency to be passed in
    @Autowired  // Spring grabs a suitable "motivation" and then injects it for us
    public RugbyCoach(@Qualifier("stickMotivation")   Motivation theMotivation){
        motivation=theMotivation;
    }

    public RugbyCoach(){}

    @Override
    public String getDailyWorkout() {
        return "Odd shaped balls!";
    }

    @Override
    public String getMotivation() {
        if (motivation!=null) {
            return motivation.getMotivation();
        } else {
            return "your fate is in your own hands";
        }
    }
}

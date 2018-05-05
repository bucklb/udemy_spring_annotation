package udemy.spring.annotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    // A dependency to play with.  Give it a setter we can use
    private Motivation motivation;

    @Autowired // if there's an implementation of Motivation (flagged with @Component) then inject it
    @Qualifier("stickMotivation")
    public void setMotivation(Motivation motivation) {
        this.motivation = motivation;
    }

    @Override
    public String getDailyWorkout(){
        return "run 4 it!";
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

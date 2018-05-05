package udemy.spring.annotationDemo;

import org.springframework.beans.factory.annotation.Qualifier;

public class SwimCoach implements Coach {

    // A dependency to play with.  Give it a setter we can use
    private Motivation motivation;


    public SwimCoach(Motivation theMotivation){
        motivation=theMotivation;
    }

    public void setMotivation(Motivation motivation) {
        this.motivation = motivation;
    }

    @Override
    public String getDailyWorkout() {
        return "100 laps of the cat!";
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

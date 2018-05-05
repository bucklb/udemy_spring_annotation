package udemy.spring.annotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  // allow it to be a bean for others
public class BaseballCoach implements Coach {

    @Autowired  // motivation can't be set by constructor, setter or in fact any method.  It can still be autowired though
    @Qualifier("stickMotivation")
    private Motivation motivation;


    @Override
    public String getDailyWorkout() {
        return "Pitcher this!";
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

package udemy.spring.annotationDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // flag it's a similar thing to appContext
public class CoachCodeConfig {

    // basically doing what we started doing in AppCtx.xml?

    @Bean
    public Motivation stickMotivation(){
        return new StickMotivation();
    }

    @Bean
    public Motivation carrotMotivation(){
        return new CarrotMotivation();
    }

    @Bean
    public Coach swimCoach(){
        return new SwimCoach(stickMotivation());
    }



}

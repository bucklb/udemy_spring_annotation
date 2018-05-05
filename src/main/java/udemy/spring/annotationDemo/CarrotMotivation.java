package udemy.spring.annotationDemo;

import org.springframework.stereotype.Component;

@Component
public class CarrotMotivation implements Motivation {
    @Override
    public String getMotivation() {
        return "and I'll love you forever ...";
    }
}

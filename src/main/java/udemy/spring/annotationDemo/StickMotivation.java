package udemy.spring.annotationDemo;

import org.springframework.stereotype.Component;

@Component
public class StickMotivation implements Motivation {
    @Override
    public String getMotivation() {
        return "or I'll kill you!";
    }
}

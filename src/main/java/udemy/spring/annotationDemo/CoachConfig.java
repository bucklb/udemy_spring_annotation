package udemy.spring.annotationDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Use a non-XML way to get a context we can get beans from
@Configuration  // flag it's a similar thing to appContext
@ComponentScan("udemy.spring.annotationDemo")
public class CoachConfig {

}

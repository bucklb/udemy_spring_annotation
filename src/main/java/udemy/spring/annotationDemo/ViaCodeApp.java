package udemy.spring.annotationDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// No scanning, no annotation (swimCoach only ?)
public class ViaCodeApp {
    public static void main(String[] args) {

        // Use the config class to get the beans directly (rather than via Scan & annotation)
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CoachCodeConfig.class);

        System.out.println( "=== It begins CODE ONLY!! ===========================================================" );
        Coach codeCoach=context.getBean("swimCoach",Coach.class);
        System.out.println("code only 1:" +"\t"+ codeCoach.getDailyWorkout()+ "\t" + codeCoach.getMotivation());


    }
}

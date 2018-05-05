package udemy.spring.annotationDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class annotationViaCodeApp {

    //
    // Avoid any use of applicationContext.xml ?
    //
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CoachConfig.class);

        System.out.println( "=== It begins without XML ===========================================================" );

        // Use the annotation out there to find a bean labelled as component/annotationCoach
        // can use an explicit name OR can let it work out rugbyCoach => instance of RugbyCoach
        // use default instead        Coach slowCoach=context.getBean("theRugbyCoach",Coach.class);
        Coach slowCoach=context.getBean("rugbyCoach",Coach.class);
        System.out.println("annotated 1:" +"\t"+ slowCoach.getDailyWorkout()+ "\t" + slowCoach.getMotivation());

        Coach otherCoach=context.getBean("trackCoach",Coach.class);
        System.out.println("annotated 2:" +"\t"+ otherCoach.getDailyWorkout()+ "\t" + otherCoach.getMotivation());

        Coach bb_Coach=context.getBean("baseballCoach",Coach.class);
        System.out.println("annotated 3:" +"\t"+ bb_Coach.getDailyWorkout()+ "\t" + bb_Coach.getMotivation());





    }
}

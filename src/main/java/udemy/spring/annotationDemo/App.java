package udemy.spring.annotationDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Look at how we do annotations and bean
 *
 */
public class App 
{
    public static void main(String[] args )
    {
        // Get context.  Go via xml that simply tells it to scan!
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println( "=== It begins =========================================================================" );

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

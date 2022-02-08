package peaksoft;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import peaksoft.animal.Animal;
import peaksoft.config.MyConfig;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("person",Person.class);
        Friend friend = context.getBean("friend",Friend.class);
        System.out.println("\n"+person+"\n"+person.getAnimal().animalPlus()+"\n"
                +"------------------------"+"\n"+friend+"\n" +
                friend.getAnimal().animalMinus());

    context.close();
    }
}

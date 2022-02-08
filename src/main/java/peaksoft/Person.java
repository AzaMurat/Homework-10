package peaksoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import peaksoft.animal.Animal;
import peaksoft.animal.Horse;

@Component
public class Person {
    private String name;
    private int age;
    @Qualifier("Horse")
    private Animal animal;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Autowired
    public Person(Animal animal) {
        this.animal = animal;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    @Value("${Person.name}")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Value("${Person.age}")
    public void setAge(int age) {
        this.age = age;
    }

    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return  " Person " +
                " name " + name +"|"+
                " age " + age +"|"+
                " animal " + animal+"|";
    }
}

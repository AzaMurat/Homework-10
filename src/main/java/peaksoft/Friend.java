package peaksoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import peaksoft.animal.Animal;
@Component
public class Friend {
    private String name;
    private int age;
    @Qualifier("Rabbit")
    private Animal animal;

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Autowired
    public Friend(Animal animal) {
        this.animal = animal;
    }

    public Friend() {
    }

    public String getName() {
        return name;
    }
    @Value("${Friend.name}")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    @Value("${Friend.age}")
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
        return " Friend " + "\n"+
                " name " + name +"|"+
                " age " + age + "|"+
                " animal " + animal+"|";
    }
}

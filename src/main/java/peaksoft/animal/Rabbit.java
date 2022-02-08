package peaksoft.animal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Rabbit implements Animal {
    private String breed;
    private String color;
    private int age;

    public Rabbit(String breed, String color, int age) {
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    public Rabbit() {
    }

    public String getBreed() {
        return breed;
    }
    @Value("${Rabbit.breed}")
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }
    @Value("${Rabbit.color}")
    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }
    @Value("${Rabbit.age}")
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String animalPlus() {
        return ("fluffy!!!");
    }

    @Override
    public String animalMinus() {
        return ("wild!!!");
    }

    @Override
    public String toString() {
        return " Rabbit " +
                " breed " + breed +"|"+
                " color " + color +"|"+
                " age " + age +"|"+"\n";
    }
}

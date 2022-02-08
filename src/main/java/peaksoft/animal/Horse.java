package peaksoft.animal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Horse implements Animal{
    private String name;
    private String color;
    private int age;

    public Horse(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Horse() {
    }

    public String getName() {
        return name;
    }
    @Value("${Horse.name}")
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }
    @Value("${Horse.color}")
    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }
    @Value("${Horse.age}")
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String animalPlus() {
        return ("drive fast!!!");
    }
    public String animalMinus() {
        return ("cost dearly!!!");
    }

    @Override
    public String toString() {
        return " Horse " +
                " name " + name +" | "+
                " color " + color +" | "+
                " age " + age +" | "+"\n";
    }
}


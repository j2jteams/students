import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person1 {
    String name;
    int age;

    


    public  Person1(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;

    }

    public int getAge() {
        return age;
    }

    public String toString() {
        String name;
        return " ( " + age + " )";
    }
}

public class LambdaStreamExample {
    public void main(String args[]) {
        List<Person1> candidate = Arrays.asList (new Person1("AJay", 25),
        new Person1("monisha", 31),
        new Person1("Arasu", 36),
        new Person1("nivasni", 7));

        List<String> name=candidate.stream().filter(person -> person.getAge() <15).map(Person1::getName).collect(Collectors.toUnmodifiableList());
       System.out.println("people below age 7:" + name);
    }
}




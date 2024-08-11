import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }

}

class ComparablePractice {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Sort the list using the natural ordering (age)
        Collections.sort(people);

        // Output the sorted list
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

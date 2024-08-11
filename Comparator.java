import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {

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

}

class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {

        int comparison = Integer.compare(o1.getAge(), o2.getAge());

        if (comparison == 0) {
            return o1.getName().compareTo(o2.getName());
        }

        return comparison;
    }

}

class ComparatorPractice {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Sort the list using the NameComparator
        Collections.sort(people, new NameComparator());

        // Output the sorted list
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

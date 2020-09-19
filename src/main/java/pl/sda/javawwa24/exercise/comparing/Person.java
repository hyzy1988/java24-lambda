package pl.sda.javawwa24.exercise.comparing;
import java.util.List;

public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    // -1 before
    // 0
    //1 after

    static int orderPersons (Person one, Person two) {

        return one.name.compareTo(two.name);

    }

    //napisz metodę, która

    public static void main(String[] args) {

        List<Person> perons = List.of(new Person("olaf", "www")),
            new Person("kamila", "kiel");

//        perons.sort((o1, o2) -> Person.orderPersons(o1, o2));
        perons.sort(Person::orderPersons);
        perons.sort(MyComparing::comparePerson);
        perons.sort((first, second) -> MyComparing.comparePerson(first, second));
    }
}

package pl.sda.javawwa24.exercise.comparing;

/**
 * ... comment class ...
 *
 * @author Paweł
 * @since 2020-09-19
 */

//MyComparin:: ComparedPersons
public class MyComparing {
    //metoda porównująca dwie osoby od drugiej litery nazwiska
    public static int  comparePerson( Person first, Person second) {
        return first.getSurname().substring(1).compareTo(second.getSurname().substring(1));
    }
}

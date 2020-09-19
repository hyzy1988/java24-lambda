package pl.sda.javawwa24.exercise.calculator;

import java.util.Optional;

/**
 * ... comment class ...
 *
 * @author Paweł
 * @since 2020-09-19
 */
final class Calculator {
    public static void main(String[] args) {
//        Add adder= (c,d) -> c + d;
        Add adder= (c,d) -> {
            System.out.println("inside lambda");
            return c + d;
        } ;

        System.out.println(adder.add(5.5, 8.5));

        Sub sub = (x,y) -> x - y;
        System.out.println(sub.sub(10.2, 9.2));

//        GenericAdd<Integer> genericAdd = (Integer a, Integer b) -> a+ b;
        GenericAdd<Integer> genericAdd = ( a,  b) -> a+ b;

//        getNick().length();
//        getNickWithOptional().get();

        if (getNickWithOptional().isPresent()) {        //taki sobie kod
            getNickWithOptional().get();
        }
        getNickWithOptional()
                .ifPresent(s -> {});


        getNickWithOptional()
                .map(s -> s.length())
                .ifPresent(integer -> System.out.println("Nick length: " + integer));

    }

    static String getNick(){
        return null;
    }



    static Optional<String> getNickWithOptional() {
//        return Optional.ofNullable("Paweł"); //zawsze musi być pudełko, nawet jeśli jest puste
        return Optional.empty(); //zawsze musi być pudełko, nawet jeśli jest puste
    }
}

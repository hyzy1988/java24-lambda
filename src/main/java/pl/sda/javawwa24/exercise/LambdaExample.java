package pl.sda.javawwa24.exercise;

import java.util.Optional;
import java.util.function.Function;


class  StringMapper implements Function<String, Integer> {

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

//interfejs funkcyjny jest wtedy gdy jest tlyko jedna matoda

@FunctionalInterface
interface DoubleString {
    String doubleDouble (String value);
   default String tripleTriple (String value) {return "";};
}

class DoubleStringMapper implements DoubleString {
    @Override
    public String doubleDouble(String value) {
        return value + value;
    }
}


final class LambdaExample {
    public static void main(String[] args) {
        DoubleString myDoubleString = value -> value + value;
        System.out.println(myDoubleString);


        Function<String, Integer> myFunction = new Function<String, Integer>() { //klasa anonimowa
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };



        //zamiana stringa na jego długość
        String myName = "Paweł";
        Optional<String> maybeName = Optional.ofNullable(myName);
        maybeName.map(new StringMapper());

//            maybeName.map(s -> s.length()) //wyr. lambda
//                        .ifPresent();


//        maybeName.map(s -> s.length()) //wyr. lambda
//                .ifPresent();
    }
}

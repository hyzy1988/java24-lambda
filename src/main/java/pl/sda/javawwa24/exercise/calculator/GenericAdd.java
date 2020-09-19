package pl.sda.javawwa24.exercise.calculator;

@FunctionalInterface
public interface GenericAdd<T> {
//    Double add (Double a, Double b);
    T add (T a, T b);
}

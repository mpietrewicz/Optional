package workshop.java.optional;

import java.util.Optional;

public class _III_IfIsPresent {
    public static void main(String[] args) {

        /*
            boolean isPresent()
            boolean isEmpty()  >= Java 11 , odwrotność isPresent()

            void ifPresent(Consumer<? super T> consumer)


            TODO 1 utwórz Optional<Stirng>, sprawdź i wypisz wartość do konsoli

            TODO 2 powtórz TODO 1 używając konstruktu ifPresent
         */

        Optional<String> optional = Optional.of("jakaś wartość");
        if (optional.isPresent()){
            System.out.printf("Znaleziono wartość: %s, użyto isPresent %n",optional.get());
        }

        optional.ifPresent(s -> System.out.printf("Znaleziono wartość: %s, użyto ifPresent %n",s));

        Car car = new Car("Tesla", "3");
        Optional<Car> optionalCar = Optional.of(car);
        if (optionalCar.isPresent()) {
            System.out.printf("Znaleziono samochód: %s, model: %s%n", car.getName(), car.getModel());
        }
        optionalCar.ifPresent(s -> System.out.printf("Znaleziono samochód: %s, model: %s%n", s.getName(), s.getModel()));

    }
}

package workshop.java.optional;

import java.util.Optional;

public class _II_Tworzenie {
    public static void main(String[] args) {
        /*

    static <T> Optional<T> empty()
    static <T> Optional<T> of(T value)
    static <T> Optional<T> ofNullable(T value)

    TODO utwórz trzy Optional'e <String>
    1. użyj metody empty()
    2. użyj metody ofNullable i przekaż null
    3. użyj metody of i przekaż stringa

    Wydrukuj do konsoli toStringa na każdym z obiektów.

    Po Uruchomieniu programu, przekaż null do metody of i uruchom ponownie.
 */

        Optional<String> empty = Optional.empty();
        Optional<String> ofNullable = Optional.ofNullable(null);
        Optional<String> of = Optional.of("Adam");

        System.out.println(empty.toString());
        System.out.println(ofNullable.toString());
        System.out.println(of.toString());

        Optional<String> myEmpty = Optional.empty();
        Optional<String> myOfNullable = Optional.ofNullable(null);
        Optional<String> myOf = Optional.of("Marek");

        System.out.println(myEmpty);
        System.out.println(ofNullable.toString());
        System.out.println(of.toString());

    }
}


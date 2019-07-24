package workshop.java.optional;

import sun.applet.Main;

import java.util.Optional;

public class _IV_Pobieranie {
    public static void main(String[] args) {
        /*
                   T get()
                   T orElse(T other)
                   T orElseGet(Supplier<? extends T> other)
                   Wykorzystanie metod get, orElseGet, orElse, orElseThrow (z użyciem lambd)

                   <X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier)

                   TODO  Napisz przykład z użyciem orElse i orElse get - jaka jest różnica w zachowaniu tych metod?

                    Uruchom z text = null
                    Uruchom z text = "jakaś wartość"
                */

        String text = null;
        String defaultText = Optional.ofNullable(text).orElseGet(_IV_Pobieranie::getDefaultValue);
        System.out.println("Po wywołaniu orElseGet " + defaultText);
        defaultText = Optional.ofNullable(text).orElse(getDefaultValue());
        System.out.println("Po wywołaniu orElse " + defaultText);

        System.out.println("---");

        String name = null;
        String myDefaultText = Optional.ofNullable(name).orElseGet(_IV_Pobieranie::getDefaultValue);
        System.out.println("Po wywołaniu orElseGet " + myDefaultText);

        myDefaultText = Optional.ofNullable(name).orElse(getDefaultValue());
        System.out.println("Po wywołaniu orElse " + defaultText);

        myDefaultText = Optional.ofNullable(name).orElseThrow(_IV_Pobieranie::getThrowValue);
        myDefaultText = Optional.ofNullable(name).orElseThrow(() -> getThrowValue());
        myDefaultText = Optional.ofNullable(name).orElseThrow(() -> new RuntimeException("___Mój_RuntimeException___"));


    }

    public static String getDefaultValue() {
        System.out.println("inside getDefaultValue");
        return "Default Value";
    }

    public static RuntimeException getThrowValue() {
        System.out.println("<<< W przypadku null'a wyswietlam ten tekst i zwracam RuntimeException >>>");
        return new RuntimeException("___Mój_RuntimeException___");
    }

}
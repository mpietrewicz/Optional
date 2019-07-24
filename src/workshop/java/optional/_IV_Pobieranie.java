package workshop.java.optional;

import sun.applet.Main;

import java.util.Optional;

public class _IV_Pobieranie {
    public static void main(String[] args) {
        /*
                   T get()
                   T orElse(T other)
                   T orElseGet(Supplier<? extends T> other)

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
    }

    public static String getDefaultValue() {
        System.out.println("inside getDefaultValue");
        return "Default Value";
    }

}
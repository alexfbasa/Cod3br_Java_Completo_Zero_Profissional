package streamapi;

import java.util.Locale;
import java.util.function.UnaryOperator;

public class Utis {

    public static final UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
    public static final UnaryOperator<String> maisculas = n -> n.toUpperCase();
    public static final UnaryOperator<String> minusculas = n -> n.toUpperCase();
}

package playground.fancy;

public class SampleSwitch {

    public String render(Object obj) {
        return switch (obj) {
            case String s -> s;
            case Number n -> String.valueOf(n);
            case null -> "nothing";
            default -> throw new IllegalStateException("Unexpected value: " + obj);
        };
    }
}

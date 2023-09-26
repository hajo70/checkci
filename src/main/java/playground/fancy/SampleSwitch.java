package playground.fancy;

public class SampleSwitch {

    public String render(Object obj) {
        if (obj == null) {
            return "nothing";
        } else if (obj instanceof Number) {
            return String.valueOf(obj);
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            throw new IllegalStateException("Unexpected value: " + obj);
        }
    }
}

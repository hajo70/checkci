package sample;

import java.util.List;
import java.util.stream.Collectors;

public class Special {
    public String go() {
        return List.of("A", "B", "C").stream().collect(Collectors.joining(","));
    }
    
}

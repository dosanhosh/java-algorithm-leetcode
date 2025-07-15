package src.sh.future;

import java.awt.event.WindowFocusListener;
import java.io.IOException;

@FunctionalInterface
public interface FunctionInterfaceTest<T> {
    String accept(T t) throws IOException;
}

package src.sh.future;

import java.io.IOException;
import java.io.PrintStream;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) throws IOException {
        // lambdas + functional interface
//        FunctionInterfaceTest<String> functionInterfaceTest = (String s) -> s;
//        String value = functionInterfaceTest.accept("Hello world");
//        System.out.println(value);

        // method ref and constructor ref
        int i = 1;
        Function<Integer, Integer> function = Utils::Plus;
        int rs =  function.apply(i);
        System.out.println(rs);


        PrintStream printer = System.out;
        Consumer<String> print = printer::println;
        print.accept("Hello"); // 👉 Hello

    }


}

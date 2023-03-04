package Practical_13;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;
    String result;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;


    @org.junit.jupiter.api.BeforeEach
    public void init() {
        calculator = new Calculator();
        System.setOut(new PrintStream(outContent));

    }

    @org.junit.jupiter.api.AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void calculateTest1() {
        String expression = "2 3 * 1 -";
        calculator.calculate(expression);

        result = "+---------------------------------------------------------------+\n" +
                "| Method          | Return Value         | Stack Contents       |\n" +
                "+---------------------------------------------------------------+\n" +
                "| push(2)         | 2                    | (2)                  |\n" +
                "+---------------------------------------------------------------+\n" +
                "| push(3)         | 3                    | (2,3)                |\n" +
                "+---------------------------------------------------------------+\n" +
                "| push(*)         | *                    | (2,3,*)              |\n" +
                "+---------------------------------------------------------------+\n" +
                "| pop()           | *                    | (2,3)                |\n" +
                "+---------------------------------------------------------------+\n" +
                "| pop()           | 3                    | (2)                  |\n" +
                "+---------------------------------------------------------------+\n" +
                "| pop()           | 2                    | ()                   |\n" +
                "+---------------------------------------------------------------+\n" +
                "| push(6.0)       | 6.0                  | (6.0)                |\n" +
                "+---------------------------------------------------------------+\n" +
                "| push(1)         | 1                    | (6.0,1)              |\n" +
                "+---------------------------------------------------------------+\n" +
                "| push(-)         | -                    | (6.0,1,-)            |\n" +
                "+---------------------------------------------------------------+\n" +
                "| pop()           | -                    | (6.0,1)              |\n" +
                "+---------------------------------------------------------------+\n" +
                "| pop()           | 1                    | (6.0)                |\n" +
                "+---------------------------------------------------------------+\n" +
                "| pop()           | 6.0                  | ()                   |\n" +
                "+---------------------------------------------------------------+\n" +
                "| push(5.0)       | 5.0                  | (5.0)                |\n" +
                "+---------------------------------------------------------------+\n";

        assertEquals(result, outContent.toString().replace("\r", ""));

    }

    @Test
    void calculateTest2() {
        String expression = "4 5 + 1 2 * - 5 /";
        calculator.calculate(expression);

        result = "+---------------------------------------------------------------+\n" +
                "| Method          | Return Value         | Stack Contents       |\n" +
                "+---------------------------------------------------------------+\n" +
                "| push(4)         | 4                    | (4)                  |\n" +
                "+---------------------------------------------------------------+\n" +
                "| push(5)         | 5                    | (4,5)                |\n" +
                "+---------------------------------------------------------------+\n" +
                "| push(+)         | +                    | (4,5,+)              |\n" +
                "+---------------------------------------------------------------+\n" +
                "| pop()           | +                    | (4,5)                |\n" +
                "+---------------------------------------------------------------+\n" +
                "| pop()           | 5                    | (4)                  |\n" +
                "+---------------------------------------------------------------+\n" +
                "| pop()           | 4                    | ()                   |\n" +
                "+---------------------------------------------------------------+\n" +
                "| push(9.0)       | 9.0                  | (9.0)                |\n" +
                "+---------------------------------------------------------------+\n" +
                "| push(1)         | 1                    | (9.0,1)              |\n" +
                "+---------------------------------------------------------------+\n" +
                "| push(2)         | 2                    | (9.0,1,2)            |\n" +
                "+---------------------------------------------------------------+\n" +
                "| push(*)         | *                    | (9.0,1,2,*)          |\n" +
                "+---------------------------------------------------------------+\n" +
                "| pop()           | *                    | (9.0,1,2)            |\n" +
                "+---------------------------------------------------------------+\n" +
                "| pop()           | 2                    | (9.0,1)              |\n" +
                "+---------------------------------------------------------------+\n" +
                "| pop()           | 1                    | (9.0)                |\n" +
                "+---------------------------------------------------------------+\n" +
                "| push(2.0)       | 2.0                  | (9.0,2.0)            |\n" +
                "+---------------------------------------------------------------+\n" +
                "| push(-)         | -                    | (9.0,2.0,-)          |\n" +
                "+---------------------------------------------------------------+\n" +
                "| pop()           | -                    | (9.0,2.0)            |\n" +
                "+---------------------------------------------------------------+\n" +
                "| pop()           | 2.0                  | (9.0)                |\n" +
                "+---------------------------------------------------------------+\n" +
                "| pop()           | 9.0                  | ()                   |\n" +
                "+---------------------------------------------------------------+\n" +
                "| push(7.0)       | 7.0                  | (7.0)                |\n" +
                "+---------------------------------------------------------------+\n" +
                "| push(5)         | 5                    | (7.0,5)              |\n" +
                "+---------------------------------------------------------------+\n" +
                "| push(/)         | /                    | (7.0,5,/)            |\n" +
                "+---------------------------------------------------------------+\n" +
                "| pop()           | /                    | (7.0,5)              |\n" +
                "+---------------------------------------------------------------+\n" +
                "| pop()           | 5                    | (7.0)                |\n" +
                "+---------------------------------------------------------------+\n" +
                "| pop()           | 7.0                  | ()                   |\n" +
                "+---------------------------------------------------------------+\n" +
                "| push(1.4)       | 1.4                  | (1.4)                |\n" +
                "+---------------------------------------------------------------+\n";

        assertEquals(result, outContent.toString().replace("\r", ""));

    }
}
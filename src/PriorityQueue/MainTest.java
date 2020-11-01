package PriorityQueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainTest {

    private Main main;



    @BeforeEach
    void setup() {
        main = new Main();
    }

    @Test
    void test(){
    }

    @Test
    void testCase1() throws IOException {
        BufferedReader inputReader = new BufferedReader(new FileReader("src/PriorityQueue/testCases/sample-input-1.txt"));
        BufferedReader outputReader = new BufferedReader(new FileReader("src/PriorityQueue/testCases/sample-output-1.txt"));
        StringBuilder input = new StringBuilder();

        String inputLine;
        while ((inputLine = inputReader.readLine()) != null) {
            input.append(inputLine + "\n");
        }

        StringBuilder output = new StringBuilder();

        String outputLine;
        while ((outputLine = outputReader.readLine()) != null) {
            output.append(outputLine + "\n");
        }

        System.out.println("Test case 1 input:\n\n" + input.toString());

        System.out.println("Test case 1 expected output:\n\n" + output.toString());

        String result = main.runPriorityQueue(input.toString());

        System.out.println("Your output:\n\n" + result + "\n");

        assert (output.toString().equals(result));
    }

    @Test
    void testCase2() throws IOException {
        BufferedReader inputReader = new BufferedReader(new FileReader("src/PriorityQueue/testCases/sample-input-2.txt"));
        BufferedReader outputReader = new BufferedReader(new FileReader("src/PriorityQueue/testCases/sample-output-2.txt"));
        StringBuilder input = new StringBuilder();

        String inputLine;
        while ((inputLine = inputReader.readLine()) != null) {
            input.append(inputLine + "\n");
        }

        StringBuilder output = new StringBuilder();

        String outputLine;
        while ((outputLine = outputReader.readLine()) != null) {
            output.append(outputLine + "\n");
        }

        System.out.println("Test case 2 input:\n\n" + input.toString());

        System.out.println("Test case 2 expected output:\n\n" + output.toString());

        String result = main.runPriorityQueue(input.toString());

        System.out.println("Your output:\n\n" + result + "\n");

        assert (output.toString().equals(result));
    }

    @Test
    void testCase3() throws IOException {
        BufferedReader inputReader = new BufferedReader(new FileReader("src/PriorityQueue/testCases/sample-input-3.txt"));
        BufferedReader outputReader = new BufferedReader(new FileReader("src/PriorityQueue/testCases/sample-output-3.txt"));
        StringBuilder input = new StringBuilder();

        String inputLine;
        while ((inputLine = inputReader.readLine()) != null) {
            input.append(inputLine + "\n");
        }

        StringBuilder output = new StringBuilder();

        String outputLine;
        while ((outputLine = outputReader.readLine()) != null) {
            output.append(outputLine + "\n");
        }

        System.out.println("Test case 3 input:\n\n" + input.toString());

        System.out.println("Test case 3 expected output:\n\n" + output.toString());

        String result = main.runPriorityQueue(input.toString());

        System.out.println("Your output:\n\n" + result + "\n");

        assert (output.toString().equals(result));
    }

    @Test
    void testCase4() throws IOException {
        BufferedReader inputReader = new BufferedReader(new FileReader("src/PriorityQueue/testCases/sample-input-4.txt"));
        BufferedReader outputReader = new BufferedReader(new FileReader("src/PriorityQueue/testCases/sample-output-4.txt"));
        StringBuilder input = new StringBuilder();

        String inputLine;
        while ((inputLine = inputReader.readLine()) != null) {
            input.append(inputLine + "\n");
        }

        StringBuilder output = new StringBuilder();

        String outputLine;
        while ((outputLine = outputReader.readLine()) != null) {
            output.append(outputLine + "\n");
        }

        System.out.println("Test case 4 input:\n\n" + input.toString());

        System.out.println("Test case 4 expected output:\n\n" + output.toString());

        String result = main.runPriorityQueue(input.toString());

        System.out.println("Your output:\n\n" + result + "\n");

        assert (output.toString().equals(result));
    }
}
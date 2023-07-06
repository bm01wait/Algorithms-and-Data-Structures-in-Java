package main.java.com.ctci.stacksandqueues;

public class StackMinTest {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(QueueViaStacks.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Result == "+result.wasSuccessful());
    } 
}

package main.java.com.ctci.stacksandqueues;

import com.ctci.stacksandqueues.StackMin;

public class StackMinTest {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(StackMin.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Result == "+result.wasSuccessful());
    } 
}

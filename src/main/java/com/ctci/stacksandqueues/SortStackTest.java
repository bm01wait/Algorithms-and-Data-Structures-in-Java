package com.ctci.stacksandqueues;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class SortStackTest {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(QueueViaStacks.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Result == "+result.wasSuccessful());
    }
}

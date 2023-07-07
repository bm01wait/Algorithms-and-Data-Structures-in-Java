package com.ctci.arraysandstrings;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class URLifyTest {
    public static void main(String[] args) {
        //testAssertions();
        Result result = JUnitCore.runClasses(URLify.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Result == "+result.wasSuccessful());
    }
}

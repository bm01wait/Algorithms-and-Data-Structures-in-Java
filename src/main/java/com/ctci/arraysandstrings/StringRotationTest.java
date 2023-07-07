package com.ctci.arraysandstrings;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class StringRotationTest {
    public static void main(String[] args) {
        //testAssertions();
        Result result = JUnitCore.runClasses(StringRotation.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Result == "+result.wasSuccessful());
    }
}

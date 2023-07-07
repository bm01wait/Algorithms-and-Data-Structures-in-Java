package com.ctci.linkedlists;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class KthToLastElementTest {
    public static void main(String[] args) {
        //testAssertions();
        Result result = JUnitCore.runClasses(KthToLastElement.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Result == "+result.wasSuccessful());
    }
}

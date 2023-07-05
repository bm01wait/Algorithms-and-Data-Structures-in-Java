package com.ctci.recursionanddp;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class QueueViaStacksTest {
    public static void main(String[] args) {
        //testAssertions();
        Result result = JUnitCore.runClasses(QueueViaStacks.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Result == "+result.wasSuccessful());
    }
}

package com.ctci.arraysandstrings;
import com.ctci.arraysandstrings.CheckPermutation;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class CheckPermutationTest {
    public static void main(String[] args) {
        //testAssertions();
        Result result = JUnitCore.runClasses(CheckPermutation.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Result == "+result.wasSuccessful());
    }
}

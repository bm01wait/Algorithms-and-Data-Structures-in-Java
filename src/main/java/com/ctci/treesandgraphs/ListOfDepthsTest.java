package com.ctci.treesandgraphs;

import com.ctci.linkedlists.RemoveDuplicates;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ListOfDepthsTest {
    public static void main(String[] args) {
        //testAssertions();
        Result result = JUnitCore.runClasses(RemoveDuplicates.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Result == "+result.wasSuccessful());
    }
}

package com.ctci.bitmanipulation;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class FlipBitToWinTest {
    public static void main(String[] args) {
        //testAssertions();
        Result result = JUnitCore.runClasses(FlipBitToWin.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Result == "+result.wasSuccessful());
    }
}

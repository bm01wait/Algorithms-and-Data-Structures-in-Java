package main.java.com.ctci.treesandgraphs;

import com.ctci.treesandgraphs.BuildOrder;

public class BuildOrderTest {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(BuildOrder.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Result == "+result.wasSuccessful());
    } 
}

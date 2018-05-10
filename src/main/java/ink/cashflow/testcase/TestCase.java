package ink.cashflow.testcase;

public class TestCase {

    public void testIsAssignedFrom1() {
        System.out.println(String.class.isAssignableFrom(Object.class));
    }
    
    
    public static void main(String[] args) {
        TestCase testCase = new TestCase();
        testCase.testIsAssignedFrom1();
    }
    
}

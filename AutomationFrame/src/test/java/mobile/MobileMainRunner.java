import org.testng.TestNG;

public class MobileMainRunner {
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] {MobileTestSuite.class});
        testng.run();
    }
}

package website;


import de.test.path.TestLogger;

/**
 * TODO: DESC CLASS
 *
 * @author LarsG
 */
public class Controller {

  public static void main(String[] args) {
    Controller controller = new Controller();
    controller.testMethod();
    controller.libraryMethod();
  }

  public void testMethod(){
    System.out.println("TEST A");
  }

  public void libraryMethod(){
    TestLogger testLogger = new TestLogger();
    testLogger.log("HELLO FROM THE CONTROLLER A");
  }
}
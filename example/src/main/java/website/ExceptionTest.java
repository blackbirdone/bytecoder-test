package website;

/**
 * TODO: DESC CLASS
 *
 * @author LarsG
 */
public class ExceptionTest {

  public static void main(String[] args) {
    ExceptionTest exceptionTest = new ExceptionTest();
    exceptionTest.init();
  }

  private void init() {
    try {
      createElement();
      System.out.println("exception not raised");
    }catch (NullPointerException npe){
      System.out.println("exception catched");
    }

  }

  private void createElement() throws NullPointerException {
    throw new NullPointerException();
  }
}
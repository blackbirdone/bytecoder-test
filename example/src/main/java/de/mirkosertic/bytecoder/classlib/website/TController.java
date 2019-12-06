package de.mirkosertic.bytecoder.classlib.website;

import de.mirkosertic.bytecoder.api.SubstitutesInClass;
import de.test.path.TestLogger;

/**
 * TODO: DESC CLASS
 *
 * @author LarsG
 */
@SubstitutesInClass(completeReplace = true)
public class TController {

  public void testMethod() {
    System.out.println("TEST B");
  }

  public void libraryMethod() {
    TestLogger testLogger = new TestLogger();
    testLogger.log("HELLO FROM THE CONTROLLER B");
  }
}
package de.mirkosertic.bytecoder.classlib.de.test.path;

import de.mirkosertic.bytecoder.api.SubstitutesInClass;

/**
 * TODO: DESC CLASS
 *
 * @author LarsG
 */

@SubstitutesInClass(completeReplace = true)
public class TTestLogger {
  public void log(String string) {
    System.out.println("MESSAGE FROM TTestLogger " + string);
  }
}

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jacka
 * @version 1.0 on 12/21/2016.
 */
public class ReverseStringTest {
  @Test
  public void testReverseStringEmpty() throws Exception {
    assertEquals("", ReverseString.reverseString(""));
  }

  @Test
  public void testReverseString() throws Exception {
    assertEquals("abc", ReverseString.reverseString("cba"));
  }
  @Test
  public void testFail() throws Exception {
    throw new AssertionError();
  }
}
/**
 * @author jacka
 * @version 1.0 on 12/21/2016.
 */
public final class ReverseString {

  public static String reverseString(String src) {
    char[] srcArray = src.toCharArray();
    for (int i = 0; i < srcArray.length / 2; i++) {
      char tmp = srcArray[i];
      srcArray[i] = srcArray[srcArray.length - i - 1];
      srcArray[srcArray.length - i - 1] = tmp;
    }
    return new String(srcArray);
  }

}

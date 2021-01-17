package paramTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhixi
 * @version 1.0 on 1/16/2021
 */
class ContainerTest {

  @ParameterizedTest
  @MethodSource("paramProvider")
  void testOnlineCase1(int val) {
    assertEquals(val, new Container(val).val());
  }

  static Stream<Integer> paramProvider() {
    return Stream.of(
        1, 2
    );
  }
}
package config;

import config.ConfigReader.Config;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhixi
 * @version 1.0 on 1/16/2021
 */
class ConfigReaderTest {
  private static final String SRC_CONFIG = "config.txt",
      TEST_CONFIG = "testConfig.txt";
  private ConfigReader configReader;

  @BeforeEach
  void beforeEach() {
    configReader = new ConfigReader();
  }

  @Test
  void testSrcConfig() throws IOException {
    final Config actual = configReader.reader(SRC_CONFIG);
    Config expected = new Config(List.of(1, 2));
    assertEquals(expected, actual);
  }

  @Test
  void testTestConfig() throws IOException {
    final Config actual = getConfigFromTestConfig();
    Config expected = new Config(List.of(3, 4));
    assertEquals(expected, actual);
  }

  private Config getConfigFromTestConfig() throws IOException {
    final var testConfigStream = getClass().getClassLoader().getResourceAsStream(TEST_CONFIG);
    return configReader.reader(testConfigStream);
  }
}

package config;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author zhixi
 * @version 1.0 on 1/16/2021
 */
public final class ConfigReader {

  public Config reader(final String configFileName) throws IOException {
    return reader(getClass().getClassLoader().getResourceAsStream(configFileName));
  }

  public Config reader(final InputStream inputStream) throws IOException {
    try (BufferedReader bf =
             new BufferedReader(new InputStreamReader(inputStream))) {
      final List<Integer> vals = new ArrayList<>();
      String line;
      while ((line = bf.readLine()) != null) {
        vals.add(Integer.parseInt(line));
      }
      return new Config(vals);
    }
  }

  public static final class Config {
    public final List<Integer> vals;

    public Config(final List<Integer> vals) {
      this.vals = new ArrayList<>(vals);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Config)) return false;
      Config config = (Config) o;
      return Objects.equals(vals, config.vals);
    }

    @Override
    public int hashCode() {
      return Objects.hash(vals);
    }

    @Override
    public String toString() {
      return "Config{" +
          "vals=" + vals +
          '}';
    }
  }
}

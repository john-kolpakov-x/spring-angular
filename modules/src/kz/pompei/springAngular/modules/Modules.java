package kz.pompei.springAngular.modules;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Modules {

  private static Path prefix() {

    for (String s : new String[]{".", "..", "../..", "../../.."}) {
      Path path = Paths.get(s);

      if (path.resolve(".greetgo").resolve("project-name.txt").toFile().exists()) {
        return path;
      }

    }

    throw new RuntimeException("Cannot find project from "
        + Paths.get(".").toFile().getAbsoluteFile().toPath().normalize());
  }

  public static Path server() {
    return prefix().resolve("server");
  }


  public static Path embeddedTomcat() {
    return prefix().resolve("server").resolve("embedded_tomcat");
  }
}

package kz.pompei.springBootAngular.modules;

import org.testng.annotations.Test;

import java.nio.file.Paths;

import static org.fest.assertions.api.Assertions.assertThat;

public class ModulesTest {
  @Test
  public void checkServerExists() {

    System.out.println("         . = " + Paths.get(".").toFile().getAbsoluteFile().toPath().normalize());
    System.out.println("server     = " + Modules.server());
    System.out.println("server.abs = " + Modules.server().toFile().getAbsoluteFile().toPath().normalize());

    assertThat(Modules.server().toFile()).exists();

  }

  @Test
  public void embeddedTomcatExists() {

    assertThat(Modules.embeddedTomcat().toFile()).exists();

  }
}

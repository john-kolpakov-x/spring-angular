package kz.pompei.springAngular.server;

import kz.pompei.springAngular.modules.Modules;
import org.apache.catalina.startup.Tomcat;

public class EmbeddedTomcatLauncher {
  public static void main(String[] args) throws Exception {

    CrossOriginFilter.activated = true;

    String testWebappAbsPath = Modules.embeddedTomcat().resolve("test_webapp").toFile().getAbsolutePath();

    Tomcat tomcat = new Tomcat();

    tomcat.addWebapp("/", testWebappAbsPath);

    tomcat.setPort(1313);

    tomcat.start();
    tomcat.getServer().await();

  }
}

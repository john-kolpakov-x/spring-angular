package kz.pompei.springBootAngular.server;

import kz.pompei.springBootAngular.modules.Modules;
import org.apache.catalina.startup.Tomcat;

public class EmbeddedMain {
  public static void main(String[] args) throws Exception {

    String testWebappAbsPath = Modules.embeddedTomcat().resolve("test_webapp").toFile().getAbsolutePath();

    Tomcat tomcat = new Tomcat();

    tomcat.addWebapp("/", testWebappAbsPath);

    tomcat.setPort(8000);

    tomcat.start();
    tomcat.getServer().await();

    System.out.println("asd ");
  }
}

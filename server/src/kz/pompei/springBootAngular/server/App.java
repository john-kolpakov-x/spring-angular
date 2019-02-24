package kz.pompei.springBootAngular.server;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Set;

public class App implements ServletContainerInitializer {
  @Override
  public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
    System.out.println("23gvg54g6 :: starting application ....................");



  }
}

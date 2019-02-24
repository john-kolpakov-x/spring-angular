package kz.pompei.springAngular.server;

import kz.pompei.springAngular.register.importers.ImporterProduct;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import java.util.Set;

public class App implements ServletContainerInitializer {
  @Override
  public void onStartup(Set<Class<?>> set, ServletContext servletContext) {
    System.out.println("23gvg54g6 :: starting application ....................");

    AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
    ac.register(ImporterProduct.class);
    ac.refresh();

    DispatcherServlet dispatcherServlet = new DispatcherServlet(ac);
    ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcherServlet", dispatcherServlet);
    registration.addMapping("/api/*");
    registration.setLoadOnStartup(3);
  }
}

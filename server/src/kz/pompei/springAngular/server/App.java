package kz.pompei.springAngular.server;

import kz.pompei.springAngular.register.importers.ImporterProduct;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import java.nio.charset.StandardCharsets;
import java.util.EnumSet;
import java.util.Set;

public class App implements ServletContainerInitializer {
  @Override
  public void onStartup(Set<Class<?>> set, ServletContext servletContext) {
    System.out.println("23gvg54g6 :: starting application ....................");

    AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
    ac.register(ImporterProduct.class);
    ac.refresh();

    {
      DispatcherServlet dispatcherServlet = new DispatcherServlet(ac);
      ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcherServlet", dispatcherServlet);
      registration.addMapping("/api/*");
      registration.setLoadOnStartup(3);
    }

    {
      CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
      characterEncodingFilter.setEncoding("UTF-8");
      characterEncodingFilter.setForceEncoding(true);

      FilterRegistration.Dynamic registration = servletContext
          .addFilter("characterEncodingFilter", characterEncodingFilter);
      registration.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD), true, "/*");
    }

    if (CrossOriginFilter.activated) {
      CrossOriginFilter crossOriginFilter = new CrossOriginFilter();
      FilterRegistration.Dynamic registration = servletContext.addFilter("crossOriginFilter", crossOriginFilter);
      registration.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true, "/*");
    }
  }

}

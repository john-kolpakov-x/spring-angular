package kz.pompei.springAngular.controller.util;

import javax.servlet.ServletContext;

public interface CrossOriginFilter {
  void registerTo(ServletContext servletContext);
}

package kz.pompei.springAngular.server;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RouteServerFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) {
    System.out.println("3hb1gv4556 ::: RouteServerFilter init");
  }

  @Override
  public void destroy() {}

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
      throws IOException, ServletException {

    HttpServletRequest request = (HttpServletRequest) servletRequest;
    HttpServletResponse response = (HttpServletResponse) servletResponse;

    String requestURI = request.getRequestURI();

    String newUri = convertRequestURI(requestURI);

    System.out.println("c3f455656 :: requestURI = " + requestURI);

    if (newUri == null) {
      chain.doFilter(request, response);
    } else {
      System.out.println("j5n345n34 :: FORWARD TO " + newUri);
      request.getRequestDispatcher(newUri).forward(request, response);
    }


  }

  public static String convertRequestURI(String requestURI) {

    if (requestURI == null) {
      return null;
    }

    if (requestURI.length() == 0) {
      return null;
    }

    if (requestURI.startsWith("/api/")) {
      return null;
    }
    if (requestURI.equals("/")) {
      return null;
    }

    if (requestURI.startsWith("/") && requestURI.endsWith(".css")) {
      return null;
    }
    if (requestURI.startsWith("/") && requestURI.endsWith(".html")) {
      return null;
    }
    if (requestURI.startsWith("/") && requestURI.endsWith(".js")) {
      return null;
    }

    return "/index.html";
  }

}

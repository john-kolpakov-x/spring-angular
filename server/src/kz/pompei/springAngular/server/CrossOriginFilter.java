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
import java.util.Enumeration;

public class CrossOriginFilter implements Filter {

  public static boolean activated = false;

  @Override
  public void init(FilterConfig filterConfig) {}

  @Override
  public void destroy() {}

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
      throws IOException, ServletException {

    HttpServletRequest request = (HttpServletRequest) servletRequest;
    HttpServletResponse response = (HttpServletResponse) servletResponse;

    printRequestInfo(request);

    response.addHeader("Access-Control-Allow-Credentials", "true");
    response.addHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));

    response.addHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
    response.addHeader("Access-Control-Allow-Headers", "origin,x-requested-with," +
        "access-control-request-headers,content-type,access-control-request-method,accept,token,set-cookie");
    response.addHeader("Access-Control-Max-Age", "1800");

    if ("OPTIONS".equals(request.getMethod())) {
      response.setStatus(200);
      return;
    }

    chain.doFilter(request, response);
  }


  private void printRequestInfo(HttpServletRequest request) {
    System.out.println();
    System.out.println("request.getRequestURL() = " + request.getRequestURL());
    System.out.println("origin = " + extractOrigin(request.getRequestURL()));
    System.out.println("requestHeader(Origin) = " + request.getHeader("Origin"));
    System.out.println("request.getServerName() = " + request.getServerName());
    System.out.println("request.getServerPort() = " + request.getServerPort());
    System.out.println("request.getProtocol() = " + request.getProtocol());
    System.out.println("request.getRemoteAddr() = " + request.getRemoteAddr());
    System.out.println("request.getRemoteHost() = " + request.getRemoteHost());
    System.out.println("request.getRemotePort() = " + request.getRemotePort());
    System.out.println("request.getRemoteUser() = " + request.getRemoteUser());

    Enumeration<String> headerNames = request.getHeaderNames();

    while (headerNames.hasMoreElements()) {
      String headName = headerNames.nextElement();
      String headValue = request.getHeader(headName);
      System.out.println("headName = " + headName + ", headValue = " + headValue);
    }
  }

  private String extractOrigin(CharSequence url) {
    String s = url.toString();
    int i1 = s.indexOf("://");
    if (i1 < 0) {
      throw new IllegalArgumentException("It is not URL: " + url);
    }
    int i2 = s.indexOf('/', i1 + 3);
    return i2 < 0 ? s : s.substring(0, i2);
  }
}

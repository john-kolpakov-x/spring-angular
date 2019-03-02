package kz.pompei.springAngular.server;

import org.testng.annotations.Test;

import static kz.pompei.springAngular.server.RouteServerFilter.convertRequestURI;
import static org.fest.assertions.api.Assertions.assertThat;

public class RouteServerFilterTest {

  @Test
  public void convertRequestURI_js() {

    String currentUri = "/asd234fhb234hb32.js";

    String newUri = convertRequestURI(currentUri);

    assertThat(newUri).isNull();
  }

  @Test
  public void convertRequestURI_html() {

    String currentUri = "/hb423hb534h6v65g6.html";

    String newUri = convertRequestURI(currentUri);

    assertThat(newUri).isNull();
  }

  @Test
  public void convertRequestURI_css() {

    String currentUri = "/hb423hb53.4h6v,65g6.css";

    String newUri = convertRequestURI(currentUri);

    assertThat(newUri).isNull();
  }


  @Test
  public void convertRequestURI_api() {

    String currentUri = "/api/jrh54b3gv46/trw/er/t34//er/rg/dfs/dfh/hgf1dh1fg";

    String newUri = convertRequestURI(currentUri);

    assertThat(newUri).isNull();
  }

  @Test
  public void convertRequestURI_root() {

    String currentUri = "/";

    String newUri = convertRequestURI(currentUri);

    assertThat(newUri).isNull();
  }

  @Test
  public void convertRequestURI_empty() {

    String currentUri = "";

    String newUri = convertRequestURI(currentUri);

    assertThat(newUri).isNull();
  }

  @SuppressWarnings("ConstantConditions")
  @Test
  public void convertRequestURI_null() {

    String currentUri = null;

    String newUri = convertRequestURI(currentUri);

    assertThat(newUri).isNull();
  }

  @Test
  public void convertRequestURI_forward() {

    String currentUri = "/asd1fsd/agf1d/gd1sg/dfg1fds1g";

    String newUri = convertRequestURI(currentUri);

    assertThat(newUri).isEqualTo("/index.html");
  }
}

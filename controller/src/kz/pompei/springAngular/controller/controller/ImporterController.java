package kz.pompei.springAngular.controller.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

@Configuration
@ComponentScan
public class ImporterController implements WebMvcConfigurer {


  @Override
  public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
    StringHttpMessageConverter converter = new StringHttpMessageConverter(UTF_8);

    converter.setSupportedMediaTypes(Arrays.asList(
        new MediaType("text", "plain", UTF_8),
        new MediaType("text", "html", UTF_8),
        new MediaType("application", "json", UTF_8),
        new MediaType("application", "x-www-form-urlencoded", UTF_8)
    ));

    converters.add(converter);
  }

}

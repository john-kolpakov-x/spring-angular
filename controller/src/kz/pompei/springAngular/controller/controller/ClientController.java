package kz.pompei.springAngular.controller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/client/")
public class ClientController {

  @GetMapping("/asd")
  public String asd() {
    return "WOW " + new Date();
  }

}

package kz.pompei.springAngular.controller.controller;

import kz.pompei.springAngular.controller.register.ClientRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

  @Autowired
  private ClientRegister clientRegister;

  @GetMapping("/asd")
  public String asd() {
    return clientRegister.asd();
  }

  @PostMapping(value = "/load-hello-world")
  public String loadHelloWorld() {

    System.out.println("v432f5c :: Called /client/load-hello-world  ....   ");

    return clientRegister.loadHelloWorld();
  }

}

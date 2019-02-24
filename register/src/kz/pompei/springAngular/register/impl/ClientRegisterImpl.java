package kz.pompei.springAngular.register.impl;

import kz.pompei.springAngular.controller.register.ClientRegister;
import kz.pompei.springAngular.controller.util.ImplWare;
import org.springframework.stereotype.Component;

import java.util.Date;

@ImplWare
@Component
public class ClientRegisterImpl implements ClientRegister {
  @Override
  public String asd() {
    return "REG " + new Date();
  }
}

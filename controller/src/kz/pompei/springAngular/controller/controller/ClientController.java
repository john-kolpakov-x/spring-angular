package kz.pompei.springAngular.controller.controller;

import kz.pompei.springAngular.controller.model.ClientRecord;
import kz.pompei.springAngular.controller.register.ClientRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

  @Autowired
  private ClientRegister clientRegister;

  @GetMapping("/asd")
  public String asd() {
    return clientRegister.asd();
  }

  @PostMapping(value = "/load-hello-world", produces = "application/json; charset=utf-8")
  public String loadHelloWorld() {

    System.out.println("v432f5c :: Called /client/load-hello-world  ....   ");

    return clientRegister.loadHelloWorld();
  }

  @GetMapping(value = "/load-hello-world1", produces = "application/json; charset=utf-8")
  public String loadHelloWorld1() {

    System.out.println("v432f5c :: Called /client/load-hello-world1  ....   ");

    return clientRegister.loadHelloWorld();
  }

  @ResponseBody
  @GetMapping(value = "/load-client-record-list", produces = "application/json; charset=utf-8")
  public List<ClientRecord> loadClientRecordList() {

    List<ClientRecord> ret = new ArrayList<>();
    ret.add(new ClientRecord("a1", "Иванов1", "Иван", 12));
    ret.add(new ClientRecord("a2", "Иванов2", "Иван", 12));
    ret.add(new ClientRecord("a3", "Иванов3", "Иван", 12));
    ret.add(new ClientRecord("a4", "Иванов4", "Иван", 12));
    ret.add(new ClientRecord("a5", "Иванов5", "Иван", 12));
    ret.add(new ClientRecord("a6", "Иванов6", "Иван", 12));
    ret.add(new ClientRecord("a7", "Иванов7", "Иван", 12));
    ret.add(new ClientRecord("a8", "Иванов8", "Иван", 12));
    ret.add(new ClientRecord("a9", "Иванов9", "Иван", 12));
    ret.add(new ClientRecord("b1", "Иванов0", "Иван", 12));
    return ret;
  }

}

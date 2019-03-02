import {Injectable} from '@angular/core';
import {HttpService} from "../http.service";
import {ClientRecord} from "../model/ClientRecord";
import {delayTimeout} from "../util/delayTimeout";

@Injectable({providedIn: 'root'})
export class ClientListStorageService {

  constructor(private http: HttpService) {}

  loadHelloWorld(): Promise<string> {
    return this.http.post("/client/load-hello-world", {}, "text")
      .toPromise()
      .then(response => response.body as string);
  }

  async loadClientList(): Promise<ClientRecord[]> {

    await delayTimeout(1000);

    let ret: ClientRecord[] = [];
    ret.push(ClientRecord.of({id: "a01", surname: "Иванов01", name: "Иван", age: 12}));
    ret.push(ClientRecord.of({id: "a02", surname: "Иванов02", name: "Иван", age: 12}));
    ret.push(ClientRecord.of({id: "a03", surname: "Иванов03", name: "Иван", age: 12}));
    ret.push(ClientRecord.of({id: "a04", surname: "Иванов04", name: "Иван", age: 12}));
    ret.push(ClientRecord.of({id: "a05", surname: "Иванов05", name: "Иван", age: 12}));
    ret.push(ClientRecord.of({id: "a06", surname: "Иванов06", name: "Иван", age: 12}));
    ret.push(ClientRecord.of({id: "a07", surname: "Иванов07", name: "Иван", age: 12}));
    ret.push(ClientRecord.of({id: "a08", surname: "Иванов08", name: "Иван", age: 12}));
    ret.push(ClientRecord.of({id: "a09", surname: "Иванов09", name: "Иван", age: 12}));
    ret.push(ClientRecord.of({id: "a10", surname: "Иванов10", name: "Иван", age: 12}));
    ret.push(ClientRecord.of({id: "a11", surname: "Иванов11", name: "Иван", age: 12}));
    ret.push(ClientRecord.of({id: "a12", surname: "Иванов12", name: "Иван", age: 12}));
    ret.push(ClientRecord.of({id: "a13", surname: "Иванов13", name: "Иван", age: 12}));
    ret.push(ClientRecord.of({id: "a14", surname: "Иванов14", name: "Иван", age: 12}));
    ret.push(ClientRecord.of({id: "a15", surname: "Иванов15", name: "Иван", age: 12}));
    ret.push(ClientRecord.of({id: "a16", surname: "Иванов16", name: "Иван", age: 12}));
    ret.push(ClientRecord.of({id: "a17", surname: "Иванов17", name: "Иван", age: 12}));
    ret.push(ClientRecord.of({id: "a18", surname: "Иванов18", name: "Иван", age: 12}));
    ret.push(ClientRecord.of({id: "a19", surname: "Иванов19", name: "Иван", age: 12}));
    ret.push(ClientRecord.of({id: "a20", surname: "Иванов20", name: "Иван", age: 12}));
    return ret;
  }

}

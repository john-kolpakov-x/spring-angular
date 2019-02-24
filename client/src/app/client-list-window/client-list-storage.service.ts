import {Injectable} from '@angular/core';
import {HttpService} from "../http.service";

@Injectable({providedIn: 'root'})
export class ClientListStorageService {

  constructor(private http: HttpService) {}

  loadHelloWorld(): Promise<string> {
    return this.http.post("/client/load-hello-world", {}, "text")
      .toPromise()
      .then(response => response.body as string);
  }

}

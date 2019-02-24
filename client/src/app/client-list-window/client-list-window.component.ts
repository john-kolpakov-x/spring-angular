import {Component} from '@angular/core';
import {ClientListStorageService} from "./client-list-storage.service";

@Component({
  selector: 'app-client-list-window',
  templateUrl: './client-list-window.component.html',
  styleUrls: ['./client-list-window.component.scss']
})
export class ClientListWindowComponent {

  constructor(private storage: ClientListStorageService) { }

  helloMessage: string | null = null;

  async loadClicked() {
    this.helloMessage = await this.storage.loadHelloWorld();
  }

}

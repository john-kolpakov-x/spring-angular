import {Component} from '@angular/core';
import {ClientListStorageService} from "./client-list-storage.service";
import {ClientRecord} from "../model/ClientRecord";

@Component({
  selector: 'app-client-list-window',
  templateUrl: './client-list-window.component.html',
  styleUrls: ['./client-list-window.component.scss']
})
export class ClientListWindowComponent {

  constructor(private storage: ClientListStorageService) { }

  helloMessage: string | null = null;
  clientList: ClientRecord[] = [];
  selectedId: string = null;

  async loadClicked() {
    this.helloMessage = await this.storage.loadHelloWorld();
  }

  async fullListClicked() {
    this.clientList = null;
    this.clientList = await this.storage.loadClientList();
    console.log("3uu3yu2 : fullListClicked ", this.clientList);
  }

  async deleteClicked() {
    if (!this.selectedId) {
      return;
    }

    for (let i = 0; i < this.clientList.length; i++) {
      if (this.clientList[i].id === this.selectedId) {
        this.clientList.splice(i, 1);
        this.selectedId = null;
        break;
      }
    }
  }

}

import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import { DefaultWindowComponent } from './default-window/default-window.component';
import { ClientListWindowComponent } from './client-list-window/client-list-window.component';
import { UnknownPageWindowComponent } from './unknown-page-window/unknown-page-window.component';

@NgModule({
  declarations: [
    AppComponent,
    DefaultWindowComponent,
    ClientListWindowComponent,
    UnknownPageWindowComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}

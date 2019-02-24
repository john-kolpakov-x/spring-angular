import {NgModule} from "@angular/core";
import {RouterModule, Routes} from "@angular/router";
import {DefaultWindowComponent} from "./default-window/default-window.component";
import {UnknownPageWindowComponent} from "./unknown-page-window/unknown-page-window.component";
import {ClientListWindowComponent} from "./client-list-window/client-list-window.component";

const routes: Routes = [{
  path: "",
  component: DefaultWindowComponent,
}, {
  path: "client-list",
  component: ClientListWindowComponent,
}, {
  path: "**",
  component: UnknownPageWindowComponent,
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}

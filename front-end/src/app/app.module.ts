import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { OrderComponentComponent } from './component/order-component/order-component.component';
import { OrderItemComponent } from './component/order-item/order-item.component';

@NgModule({
  declarations: [
    AppComponent,
    OrderComponentComponent,
    OrderItemComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

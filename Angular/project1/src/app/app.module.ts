import { ServiceService } from './service.service';
import { AuthService } from './auth.service';
import { AuthguardGuard } from './authguard.guard';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {MatExpansionModule} from '@angular/material/expansion';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AdminComponent } from './admin/admin.component';
import { MenuComponent } from './menu/menu.component';
import { RestaurantComponent } from './restaurant/restaurant.component';
import { UserComponent } from './user/user.component';
import { MainpageComponent } from './mainpage/mainpage.component';
import {MatGridListModule} from '@angular/material/grid-list';
import {MatCardModule} from '@angular/material/card';
import {MatButtonModule} from '@angular/material/button';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import{    MatToolbarModule} from '@angular/material/toolbar'
import{    MatTableModule} from '@angular/material/table'
import{    MatIconModule} from '@angular/material/icon'





@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    MenuComponent,
    RestaurantComponent,
    UserComponent,
    MainpageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatGridListModule,
    MatCardModule,
    MatButtonModule,
    NgbModule,
    MatToolbarModule,
    MatTableModule,
    MatIconModule,
    MatExpansionModule
  ],
  providers: [AuthguardGuard, AuthService,ServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }

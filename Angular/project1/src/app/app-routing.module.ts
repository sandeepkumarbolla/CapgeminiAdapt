
import { UserComponent } from './user/user.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes} from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { MenuComponent } from './menu/menu.component';
import { RestaurantComponent } from './restaurant/restaurant.component';
import { MainpageComponent } from './mainpage/mainpage.component';
import { AuthguardGuard } from './authguard.guard';


const routes: Routes = [{path:'admin', component: AdminComponent},{path:'user', component: UserComponent},
{
component: MenuComponent,
path:'menu', canActivate: [AuthguardGuard]}
,{path:'restaurant' , component:RestaurantComponent , canActivate: [AuthguardGuard]}, {path:'main', component:MainpageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

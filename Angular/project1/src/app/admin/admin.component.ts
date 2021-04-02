import { Component, OnInit } from '@angular/core';
import { Router} from '@angular/router';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }
  can=false;
  cant=false;
  public rest(){
    this.can=!this.can;
    if(this.can){
      this.router.navigate(['restaurant']);

    }
  }
  public men(){
    this.cant=!this.cant;
    if(this.cant){
      this.router.navigate(['menu']);

    }
  }

}

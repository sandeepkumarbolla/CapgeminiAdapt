import { Component, OnInit } from '@angular/core';
import { Router} from '@angular/router';

@Component({
  selector: 'app-mainpage',
  templateUrl: './mainpage.component.html',
  styleUrls: ['./mainpage.component.css']
})
export class MainpageComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }
  can=false;
  public redirect(){
    this.can=!this.can;
    if(this.can){
            this.router.navigate(['user']);
    }
  }
  canot=false;
  public return(){
    this.canot=!this.canot;
    if(this.canot){
            this.router.navigate(['admin']);
    }
  }

}

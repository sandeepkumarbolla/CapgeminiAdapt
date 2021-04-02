import { FrmService } from './../frm.service';
import { Data } from './../data';
import { Component, OnInit } from '@angular/core';
import { formatCurrency } from '@angular/common';

@Component({
  selector: 'app-advertise',
  templateUrl: './advertise.component.html',
  styleUrls: ['./advertise.component.css']
})
export class AdvertiseComponent implements OnInit {

  constructor(private frm:FrmService ) { }
categories=['Furniture','HardWare','Mobile'];
  ngOnInit(): void {

  }
  Model= new Data('','',this.categories[0],'');
 
  a:any=[this.Model];
submited=false;
onSubmit( ){
  this.submited=true;
  this.Model=new Data('Forms','Teja',this.categories[0],'Test');
 this.frm.savedata(this.Model)
}
}

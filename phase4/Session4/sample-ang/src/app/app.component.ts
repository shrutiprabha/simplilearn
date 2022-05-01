import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'sample-ang';
  fname:string="Sonam";
  lname:string="Soni";
  
  imgurl:string="./assets/img/img2.jpg";
  h=250;
  w=250;

  flag:boolean=false;
  show(){
    this.flag=!this.flag;
  }
  color:string="red";
  we:number=700;
  products=[
    {name:"pencil","available":"08-03-2022",price:10.23,rating:4.5},
    {name:"Eraser","available":"08-03-2022",price:3.23,rating:4.5},
    {name:"scale","available":"08-03-2022",price:36.23,rating:4.5},
    {name:"pen","available":"08-03-2022",price:5.00,rating:4.5}
  ]
}

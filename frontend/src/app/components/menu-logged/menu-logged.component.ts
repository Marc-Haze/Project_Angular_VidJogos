import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menu-logged',
  templateUrl: './menu-logged.component.html',
  styleUrls: ['./menu-logged.component.scss'],
})
export class MenuLoggedComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {}

  goToProducts(){
    this.router.navigateByUrl("/products");
  }

  goToAboutUs(){
    this.router.navigateByUrl("/about-us");
  }

  goToLogIn(){
    this.router.navigateByUrl("/log-in");
  }

  goToSettings(){
    this.router.navigateByUrl("/settings");
  }

  goToLogged(){
    this.router.navigateByUrl("/logged");
  }

  goToHome(){
    this.router.navigateByUrl("/home");
  }

}

import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router'

@Component({
  selector: 'app-menu',
  templateUrl: 'menu.component.html',
  styleUrls: ['menu.component.scss'],
})
export class MenuComponent {

  constructor(private router: Router) { }

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


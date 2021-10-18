import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { IonicModule } from '@ionic/angular';
import { MenuComponent } from './menu/menu.component';
import { FooterComponent } from './footer/footer.component';
import { InfoEmpleadosComponent } from './info-empleados/info-empleados.component';
import { InfoProductosComponent } from './info-productos/info-productos.component';
import { MenuLoggedComponent } from './menu-logged/menu-logged.component';
import { FormMesageComponent } from './form-mesage/form-mesage.component';
import { FormLogInComponent } from './form-log-in/form-log-in.component';
import { ChartComponent } from './chart/chart.component';
import { HomeNoveltiesComponent } from './home-novelties/home-novelties.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';




@NgModule({
  declarations: [
    MenuComponent,
    MenuLoggedComponent,
    FooterComponent,
    InfoEmpleadosComponent,
    InfoProductosComponent,
    FormMesageComponent,
    FormLogInComponent,
    ChartComponent,
    HomeNoveltiesComponent,
  ],
  imports: [
    CommonModule,
    IonicModule,
    ReactiveFormsModule,
    FormsModule
    
  ],
  exports:[
    MenuComponent,
    MenuLoggedComponent,
    FooterComponent,
    InfoEmpleadosComponent,
    InfoProductosComponent,
    FormMesageComponent,
    FormLogInComponent,
    ChartComponent,
    HomeNoveltiesComponent,
  ]
})
export class ComponentsModule { }

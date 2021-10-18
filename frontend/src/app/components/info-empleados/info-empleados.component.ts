import { Component, OnInit } from '@angular/core';
import { Empleado } from 'src/app/models/empleado';
import { EmpleadosService } from 'src/app/services/empleados.service';

@Component({
  selector: 'app-info-empleados',
  templateUrl: './info-empleados.component.html',
  styleUrls: ['./info-empleados.component.scss'],
})
export class InfoEmpleadosComponent implements OnInit {

  public empleados: Array<Empleado> = [];
  public empleado: Empleado;

  constructor(private empleadosServices: EmpleadosService) { }

  ngOnInit(): void {
    this.loadInfo();
  }

  loadInfo() {
    this.empleadosServices.getEmpleados().subscribe((b: Array<Empleado>) =>{
      this.empleados = b;
    })
  }
}


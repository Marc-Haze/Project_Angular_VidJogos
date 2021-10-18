import { Component, OnInit } from '@angular/core';
import { Producto } from 'src/app/models/producto';
import { ProductosService } from 'src/app/services/productos.service';


@Component({
  selector: 'app-chart',
  templateUrl: './chart.component.html',
  styleUrls: ['./chart.component.scss'],
})
export class ChartComponent implements OnInit {
  public productos: Array<Producto> = [];
  public producto: Producto;

  constructor(private productosService: ProductosService) { }

  ngOnInit(): void {
    this.loadInfo();
  }

  loadInfo() {
    this.productosService.getProductos().subscribe((b: Array<Producto>) =>{
      this.productos = b;
    })
  }

}

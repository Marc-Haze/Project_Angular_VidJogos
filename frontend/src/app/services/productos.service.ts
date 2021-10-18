import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Producto } from '../models/producto';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

const httpOptionsUsingUrlEncoded = {
  headers: new HttpHeaders({ 'Content-Type': 'application/x-www-form-urlencoded' })
};

@Injectable({
  providedIn: 'root'
})
export class ProductosService {
  endpoint: string = "http://localhost:8080/producto";

  constructor(private httpClient: HttpClient) { }

  getProductos(): Observable<Producto[]>{
    return this.httpClient.get<Producto[]>(this.endpoint);
  }

  getProductoById(id: number): Observable<Producto>{
    return this.httpClient.get<Producto>(this.endpoint + "/" + id);
  }
}

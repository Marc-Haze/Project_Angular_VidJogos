import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Empleado } from '../models/empleado';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

const httpOptionsUsingUrlEncoded = {
  headers: new HttpHeaders({ 'Content-Type': 'application/x-www-form-urlencoded' })
};

@Injectable({
  providedIn: 'root'
})
export class EmpleadosService {
  endpoint: string = "http://localhost:8080/empleado";

  constructor(private httpClient: HttpClient) { }

  getEmpleados(): Observable<Empleado[]>{
    return this.httpClient.get<Empleado[]>(this.endpoint);
  }

  getEmpleadoById(id: number): Observable<Empleado>{
    return this.httpClient.get<Empleado>(this.endpoint + "/" + id);
  }
}

import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators} from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-form-log-in',
  templateUrl: './form-log-in.component.html',
  styleUrls: ['./form-log-in.component.scss'],
})
export class FormLogInComponent implements OnInit {

  myForm:FormGroup;
  submitted = false;

  constructor(public formBuilder: FormBuilder,private router: Router) { }

  ngOnInit() {
    this.myForm = this.formBuilder.group({
      username: ['',[Validators.required, Validators.minLength(3)]],
      password: ['',[Validators.required, Validators.minLength(3)]]
    })
  }
  get errorCtr() {
    return this.myForm.controls;
  }

  onSubmit(){
    this.submitted = true;
    if(!this.myForm.valid){
      console.log(this.myForm.value.username)
      console.log(this.myForm.value.password)
      console.log('Rellena todos los campos')
      return false;
    }else{
      if(this.myForm.value.username=="admin" && this.myForm.value.password=="admin"){
        console.log(this.myForm.value.username)
        console.log(this.myForm.value.password)
        this.myForm.reset();
        this.router.navigateByUrl("/logged");
      }
    }
  }
}

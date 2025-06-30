import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { LoginUser, LoginUserService } from '../model/login-user';
import { subscribe } from 'diagnostics_channel';
import { CookieService } from 'ngx-cookie-service';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  imports: [FormsModule,CommonModule],
  templateUrl: './login.html',
  styleUrl: './login.css'
})
export class LoginComponent {
  apiUrl = 'http://localhost:8080/api/user';
  userEmail = '';
  userPassword = '';
  loginFailed = false;
  loginUser: LoginUser = { userEmail: '',userPassword: '' };

  constructor(
    private loginUserService: LoginUserService,
    private cookieService: CookieService,
    private router: Router
  ){}

  onLogin() {
    this.loginUser.userEmail = this.userEmail;
    this.loginUser.userPassword = this.userPassword;

    this.loginUserService.login(this.loginUser).subscribe(login => {
      
      if (login.status=="true" && login.userEmail){
        this.cookieService.set("user",login.userEmail);
        this.loginFailed = false;
        this.router.navigate(['/']);

      }else if(login.status=="signup"){
        const confirmResult = confirm('查無此Email，是否註冊？');
        if (confirmResult){
          this.cookieService.set("userEmail",this.userEmail,1);
          this.router.navigate(['/signup']);
        }else{
          this.loginFailed = true;
        }

      }else{
        this.loginFailed = true;
      }
    }


    )
    


  }

}

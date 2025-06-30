import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CookieService } from 'ngx-cookie-service';
import { UserService } from '../model/user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signup',
  imports: [CommonModule,FormsModule,HttpClientModule],
  templateUrl: './signup.html',
  styleUrl: './signup.css'
})
export class SignupComponent  implements OnInit{

  email: string = '';
  name: string = '';
  password: string = '';

  constructor(
    private cookieService: CookieService,
    private userService: UserService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.email = this.cookieService.get('userEmail') || '';
    this.cookieService.delete('userEmail');
  }

  onSignup(): void {
    console.log('註冊成功:', {
      email: this.email,
      name: this.name,
      password: this.password
    });

    // TODO: 實作後端串接或跳轉邏輯


    const userSignupData = {
      email: this.email,
      name: this.name,
      password: this.password
    };

    if (!userSignupData.email || !userSignupData.name || !userSignupData.password) return;

    this.userService.addUser(userSignupData).subscribe(user => {
      alert("註冊成功");
      this.router.navigate(['/login']);
    });

  }
}



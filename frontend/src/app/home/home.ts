import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router, RouterOutlet } from '@angular/router';
import { CookieService } from 'ngx-cookie-service';
import { User, UserService } from '../model/user';

@Component({
  selector: 'app-home',
  imports: [FormsModule],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class HomeComponent implements OnInit{

  constructor(
    private cookieService: CookieService,
    private router: Router,
    private userService: UserService
  ){}

  user :User | undefined

  ngOnInit(): void {
    if(!this.cookieService.check("user")){
      this.router.navigate(["/login"]);
    }else{
      console.log("email: "+this.cookieService.get("user"));
      this.userService.getUser(this.cookieService.get("user")).subscribe({
        next:data =>{
          this.user=data;
          console.log("成功");
        },
        error:err =>{
        console.log(err);
        }
      })
    }
    
    
  }




}

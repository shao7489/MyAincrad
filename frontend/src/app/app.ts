import { HttpClientModule } from '@angular/common/http'; //use provideHttpClient(withInterceptorsFromDi()) as providers instead
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router, RouterModule, RouterOutlet } from '@angular/router';
import { CookieService } from 'ngx-cookie-service';



@Component({
  selector: 'app-root',
  imports: [RouterOutlet,FormsModule,RouterModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected title = 'frontend'
  
  constructor(
    private cookieService: CookieService,
    private router: Router
  ){}

  logout() {
    this.cookieService.delete('user'); 
    this.router.navigate(['/login']);  
  }


}

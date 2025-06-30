import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs/internal/Observable";



export interface LoginUser {
    
    userEmail:String,
    userPassword:String

}


interface LoginResponse {
    status: string;
    userEmail?: string;
    }

@Injectable({
  providedIn: 'root'
})
export class LoginUserService{
    private apiUrl = 'http://localhost:8080/api/user/login';

    constructor(private http: HttpClient){}





    login(loginUser: LoginUser): Observable<LoginResponse> {
        

        return this.http.post<LoginResponse>(this.apiUrl, loginUser);
    }

}

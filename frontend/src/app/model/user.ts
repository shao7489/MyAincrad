import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';



export interface User {
  id?: number;
  userName: string;
  userEmail: string;
  characterName :string;
  level :number;
  xp :number;
  hp :number;
  strValue :number;
  defValue :number;
  staValue :number;
  dexValue :number;
  spdValue :number;
  tacValue :number;
  intValue :number;
  lckValue :number;
}

interface UserSignupData{
  email: string,
  name: string,
  password: string
}

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private apiUrl = 'http://localhost:8080/api/user';

  constructor(private http: HttpClient) {}

  getUsers(): Observable<User[]> {
    return this.http.get<User[]>(this.apiUrl);
  }


  getUser(email:String): Observable<User>{
    return this.http.post<User>(this.apiUrl+"/emailGetUser", { email : email });
  }



  addUser(userSignupData: UserSignupData): Observable<UserSignupData> {
    return this.http.post<UserSignupData>(this.apiUrl+"/signup", userSignupData);
  }
}



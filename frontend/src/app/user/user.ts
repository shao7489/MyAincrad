import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { User ,UserService } from '../model/user';



@Component({
  selector: 'app-user',
  imports: [CommonModule,FormsModule,HttpClientModule],
  templateUrl: './user.html',
  styleUrl: './user.css'
})

export class UserComponent implements OnInit {

  ngOnInit(): void {
      this.loadUsers();;
  }


  users: User[] = [];
  // newUser: User = { userName: '', userEmail: '' };
  

  constructor( private userService: UserService){}



  loadUsers() {
    
    this.userService.getUsers().subscribe(data => this.users = data);
    //this.userService.getUsers().subscribe(data => console.log(data));
  }

  // addUser() {
  //   if (!this.newUser.name || !this.newUser.email) return;

  //   this.userService.addUser(this.newUser).subscribe(user => {
  //     this.users.push(user);
  //     this.newUser = { name: '', email: '' };
  //   });
  // }



}
export type { User };


import { Routes } from '@angular/router';
import { UserComponent } from './user/user';
import { HomeComponent } from './home/home';
import { LoginComponent } from './login/login';
import { SignupComponent } from './signup/signup';

export const routes: Routes = [
    { path: 'user', component: UserComponent },
    { path: '', redirectTo: '/home', pathMatch: 'full' },
    { path: 'home', component:  HomeComponent},
    { path: 'login', component:  LoginComponent},
    { path: 'signup', component:  SignupComponent},

];

import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'home',
    loadChildren: () => import('./home/home.module').then( m => m.HomePageModule)
  },
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full'
  },
  {
    path: 'about-us',
    loadChildren: () => import('./views/about-us/about-us.module').then( m => m.AboutUsPageModule)
  },
  {
    path: 'products',
    loadChildren: () => import('./views/products/products.module').then( m => m.ProductsPageModule)
  },
  {
    path: 'log-in',
    loadChildren: () => import('./views/log-in/log-in.module').then( m => m.LogInPageModule)
  },
  {
    path: 'logged',
    loadChildren: () => import('./views/logged/logged.module').then( m => m.LoggedPageModule)
  },
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }

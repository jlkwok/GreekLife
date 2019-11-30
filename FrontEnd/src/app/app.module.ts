import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChapterComponent } from './chapter/chapter.component';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { SchemasComponent } from './schemas/schemas.component';
import { MemberComponent } from './member/member.component';
import { HouseComponent } from './house/house.component';
import { PhilanthropyComponent } from './philanthropy/philanthropy.component';
import { NewMemberClassComponent } from './new-member-class/new-member-class.component';

@NgModule({
  declarations: [
    AppComponent,
    ChapterComponent,
    SchemasComponent,
    MemberComponent,
    HouseComponent,
    PhilanthropyComponent,
    NewMemberClassComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

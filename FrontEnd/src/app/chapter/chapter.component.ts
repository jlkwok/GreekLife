import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { ChapterService } from '../shared/services/chapter.service';
import { formatDate } from "@angular/common";
import { Chapter } from '../shared/models/chapter';

@Component({
  selector: 'app-chapter',
  templateUrl: './chapter.component.html',
  styleUrls: ['./chapter.component.css']
})
export class ChapterComponent implements OnInit {
  attribute = new FormControl('');
  format = 'MM-dd-yyyy';
  locale = 'en-US';

  constructor(private chapterService: ChapterService) { }

  ngOnInit() {
  }

  getGoverningBody(gb: string): GoverningBody {
    switch(gb) {
      case "Interfraternity Congress": {
        return GoverningBody.INTERFRATERNITY_CONGRESS;
      }
      case "Panhellenic Council": {
        return GoverningBody.PANHELLENIC_COUNCIL;
      }
    }
  }

  attributeQuery() {
    let attribute = (<HTMLSelectElement>document.getElementById('attribute')).value;
    let chapter = (<HTMLSelectElement>document.getElementById('chapter1')).value;
    chapter = chapter.split(' ').join('%20');
    switch (attribute) {
      case "Governing Body": {
        this.chapterService.getGoverningBody(chapter).subscribe(gb => alert(gb));
        break;
      }
      case "Local Founding Date": {
        this.chapterService.getLocalFoundingDate(chapter).subscribe(date => alert(date));
        break;
      }
      case "National Founding Date": {
        this.chapterService.getNationalFoundingDate(chapter).subscribe(date => alert(date));
        break;
      }
      /*case "Number of Members": { 
        this.chapterService.(chapter);
        break; 
     }
      case "Average GPA": {
        this.chapterService.get(chapter);
        break;
      }*/
      case "Dues": {
        this.chapterService.getDues(chapter).subscribe(dues => alert(dues));
        break;
      }
    }
  }

  relationshipQuery() { }

  updateQuery() { }

  addQuery() {
    let chapterName = (<HTMLSelectElement>document.getElementById('chapter3')).value;
    let governingBodyVal = (<HTMLSelectElement>document.getElementById('governingBody')).value;
    let governingBody = this.getGoverningBody(governingBodyVal);
    let localFoundingDate = (<HTMLSelectElement>document.getElementById('locFoundingDate')).value;
    localFoundingDate = formatDate(localFoundingDate, this.format, this.locale);
    let natFoundingDate = (<HTMLSelectElement>document.getElementById('natFoundingDate')).value;
    natFoundingDate = formatDate(natFoundingDate, this.format, this.locale);
    let natDesignation = parseInt((<HTMLSelectElement>document.getElementById('natDesignation')).value);
    let dues = parseInt((<HTMLSelectElement>document.getElementById('dues')).value);
    let chapter: Chapter = new Chapter(chapterName, governingBody, localFoundingDate, natFoundingDate, natDesignation, dues);
    this.chapterService.addNewChapter(chapter).subscribe(response => alert(response));
  }

  propertyQuery() { }

  livesInQuery() { }

}

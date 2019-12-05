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
    switch (gb) {
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
      case "Number of Members": {
        this.chapterService.getMemberCount(chapter).subscribe(response => alert(response));
        break;
      }
      case "Average GPA": {
        this.chapterService.getAvgGpa(chapter).subscribe(response => alert(response));
        break;
      }
      case "Dues": {
        this.chapterService.getDues(chapter).subscribe(dues => alert(dues));
        break;
      }
    }
  }

  relationshipQuery() {
    let relationship = (<HTMLSelectElement>document.getElementById('relationship')).value;
    let chapterName = (<HTMLSelectElement>document.getElementById('chapter2')).value;
    chapterName = chapterName.split(' ').join('%20');
    switch (relationship) {
      case "Members": {
        this.chapterService.getMembers(chapterName).subscribe(response => alert(response));
        break;
      }
      case "Philanthropy": {
        this.chapterService.getPhilanthropy(chapterName).subscribe(response => alert(response));
        break;
      }
      case "House": {
        this.chapterService.getHouse(chapterName).subscribe(response => alert(response));
        break;
      }
      case "Executive Board": {
        this.chapterService.getExec(chapterName).subscribe(response => alert(response));
        break;
      }
    }
  }

  updateQuery() {
    let chapterName = (<HTMLSelectElement>document.getElementById('chapter4')).value;
    let dues = parseInt((<HTMLSelectElement>document.getElementById('dues')).value);
    this.chapterService.updateDues(chapterName, dues).subscribe(response => alert(response));
  }

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

  propertyQuery() {
    let property = (<HTMLSelectElement>document.getElementById('property')).value;
    let gpa = parseInt((<HTMLSelectElement>document.getElementById('gpa')).value);
    switch (property) {
      case "Average GPA": {
        this.chapterService.getChapterWithAvgGpa(gpa).subscribe(chapters => alert(chapters));
        break;
      }
      case "Minimum GPA": {
        this.chapterService.getChaptersWithMinGpa(gpa).subscribe(chapters => alert(chapters));
        break;
      }
    }
  }

  livesInQuery() {
    this.chapterService.getChaptersWithAllInHouse().subscribe(chapters => alert(chapters));
  }

}

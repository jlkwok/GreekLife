import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { ChapterService } from '../shared/services/chapter.service';

@Component({
  selector: 'app-chapter',
  templateUrl: './chapter.component.html',
  styleUrls: ['./chapter.component.css']
})
export class ChapterComponent implements OnInit {
  attribute = new FormControl('');

  constructor(private chapterService: ChapterService) { }

  ngOnInit() {
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
      default: {
        //statements; 
        break;
      }
    }
  }

  relationshipQuery() { }

  updateQuery() { }

  addQuery() { }

  propertyQuery() { }

  livesInQuery() { }

}

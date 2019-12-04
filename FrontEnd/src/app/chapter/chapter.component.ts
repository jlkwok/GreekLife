import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-chapter',
  templateUrl: './chapter.component.html',
  styleUrls: ['./chapter.component.css']
})
export class ChapterComponent implements OnInit {
  attribute = new FormControl('');

  constructor() { }

  ngOnInit() {
  }

  attributeQuery() {
    let value = (<HTMLSelectElement>document.getElementById('attribute')).value;
    alert(value);
  }

  relationshipQuery() {}

  updateQuery() {}

  addQuery() {}

  propertyQuery() {}

  livesInQuery() { }

}

import {Component, OnInit} from '@angular/core';
import {Form, FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements  OnInit{

  public submitted: boolean;
  roomsearch: FormGroup;
  rooms : Room[];

  ngOnInit() {
    this.roomsearch = new FormGroup({
      checkin: new FormControl(''),
      checkout: new FormControl('')
    });
    this.rooms = ROOMS
  }

  onSubmit({value,valid}: {value:Roomsearch, valid:boolean}) {
    console.log(value);
  }
  reserveRoom(value:string) {
    console.log("Id" + value);
  }
}

export interface  Roomsearch {
  checkin: string;
  checkout: string;
}

export interface Room {
  id: string;
  roomNumber: string;
  price: string;
  links: string;

}

var ROOMS:Room[] =[
  {
    id: "00001",
    roomNumber: "101",
    price: "1",
    links: "",
  },
  {
    id: "00002",
    roomNumber: "102",
    price: "2",
    links: "",
  },
  {
    id: "00003",
    roomNumber: "103",
    price: "3",
    links: "",
  },
  {
    id: "00004",
    roomNumber: "104",
    price: "4",
    links: "",
  }
]

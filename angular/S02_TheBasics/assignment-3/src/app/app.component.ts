import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  isBtnToggled: boolean = false;
  numOfBtnClicks: any = [];

  btnClicked() {
    this.numOfBtnClicks.push(this.numOfBtnClicks.length + 1);
    if (this.isBtnToggled == false) {
      this.isBtnToggled = true;
    } else {
      this.isBtnToggled = false;
    }
  }

  getBackgroundColor(currNum: number): string {
    if (5 <= currNum) {
      return 'blue';
    }

    return 'white';
  }

  getColor(currNum: number): boolean {
    if (5 <= currNum) {
      return true;
    }

    return false;
  }
}

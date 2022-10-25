import { Component } from "@angular/core";


@Component({
    selector: 'app-user',
    templateUrl: './user.component.html',
    styleUrls: ['./user.component.css']
})
export class UserComponent {
    username: string = '';

    getUsername(): string {
        return this.username;
    }

    isUsernameEmptyString(): boolean {
        return this.username === '' ? true : false;
    }

    onClickButton() {
        if (this.getUsername() !== '') {
            this.username = '';
        }
    }
}
"use strict";
//Display Class Data Using Advanced Feature of typescript
exports.__esModule = true;
exports.displayUserDetails = exports.User = void 0;
var User = /** @class */ (function () {
    function User(UserId, UserName, UserAge) {
        this.UserId = UserId;
        this.UserName = UserName;
        this.UserAge = UserAge;
    }
    User.prototype.display = function () {
        console.log("\n            User Id            ::" + this.UserId + "\n            User Name          ::" + this.UserName + "\n            User Age           ::" + this.UserAge + "\n        ");
    };
    return User;
}());
exports.User = User;
function displayUserDetails() {
    console.log("user info is");
}
exports.displayUserDetails = displayUserDetails;
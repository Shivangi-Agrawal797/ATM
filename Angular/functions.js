
var me = function () {
    console.log("kesan baa! babua");
};
//ANONYMOUS FUNTION
//without parameter and without return type
console.log("without parameter and without return type");
var temp2 = function () {
    console.log(4 - 2);
};
temp2();
//with parameter and without return type
console.log("with parameter and without return type");
var temp3 = function (a, b) {
    console.log(a - b);
};
temp3(5, 2);
//without parameter and with return type
console.log("without parameter and with return type");
var temp4 = function () {
    return (4 - 2);
};
var res = temp4();
console.log(res);
//with parameter and with return type
console.log("with parameter and with return type");
var temp5 = function (x, y) {
    return (x - y);
};
console.log(temp5(4, 8));
//FAT ARROW FUNCTION
console.log("Fat Arrow");
//without parameter and without return type
console.log("without parameter and without return type");
var temp6 = function () {
    console.log(4 - 2);
};
temp6();
//with parameter and without return type
console.log("with parameter and without return type");
var temp7 = function (a, b) {
    console.log(a - b);
};
temp7(5, 2);
//without parameter and with return type
console.log("without parameter and with return type");
var temp8 = function () {
    return (4 - 2);
};
var res1 = temp8();
console.log(res1);
//with parameter and with return type
console.log("with parameter and with return type");
var temp9 = function (x, y) {
    return (x - y);
};
console.log(temp9(4, 8));
var array1 = [];
array1.push(1);
array1.push(2);
array1.push(3);
array1.push(4);
array1.push(5);
//Direct printing array
console.log(array1);
//FOR loop
for (var i = 0; i < array1.length; i++) {
    console.log(array1[i]);
}
//FOREACH loop
array1.forEach(function (element, i, a) {
    console.log("Value at index " + i + " is: " + element);
});
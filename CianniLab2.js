/*
 * This is a JavaScript Scratchpad.
 *
 * Enter some JavaScript, then Right Click or choose from the Execute Menu:
 * 1. Run to evaluate the selected text (Ctrl+R),
 * 2. Inspect to bring up an Object Inspector on the result (Ctrl+I), or,
 * 3. Display to insert the result in a comment after the selection. (Ctrl+L)
 */

//Cianni Hayes
//Cse 001
//Lab 2
var evenSum = 0;
var evenNumberTotal= 0;
var oddSum = 0;
var oddNumberTotal= 0;
var i = 0;
var evenAverage= 0;
var oddAverage= 0;
for (i=0; i<=15; i++){
  total += i;

if (i % 2 == 0) {
  evenSum= evenSum+i;
  evenNumberTotal++;
  evenAverage= evenSum/ evenNumberTotal;
  console.log( i +  " is even");
}
if (i % 2 == 1){
  oddSum= oddSum+i;
  oddNumberTotal++;
  oddAverage= oddSum/oddNumberTotal;
  console.log( i +  " is odd");
}
}
console.log("sum of even numbers: " + evenSum);
console.log("number of even numbers: " + evenNumberTotal);
console.log ("average of even numbers : " +  evenAverage)
console.log("sum of odd numbers: " + oddSum);
console.log("numberof odd numbers: " + oddNumberTotal);
console.log("average of odd numbers: " + oddAverage);

var a;
var b;
for(a=10; a<=20; a++);{
for (b=1; b<a; b++); { 
if (a % b !== 0){
  console.log(a + "is not prime");
if (a % b == 0){
  console.log (a + "is prime")
}
}
}
}
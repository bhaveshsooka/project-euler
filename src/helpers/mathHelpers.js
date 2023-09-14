"use strict";

function isPrime(number) {
  if (isNaN(number) || !isFinite(number) || number % 1 || number < 2)
    return false;
  if (number % 2 == 0) return number == 2;
  if (number % 3 == 0) return number == 3;

  var numberSqrt = Math.sqrt(number);
  for (var i = 5; i <= numberSqrt; i += 6) {
    if (number % i == 0) return false;
    if (number % (i + 2) == 0) return false;
  }
  return true;
}

function getFactors(number) {
  let numberSqrt = Math.sqrt(number);
  let factors = [];
  for (let i = 1; i <= numberSqrt; i++) {
    if (number % i == 0) {
      factors.push(i);
      factors.push(number / i);
    }
  }
  return factors;
}

function isDivisibleBy(num, div) {
  return num % div === 0;
}

function gcd_array(input) {
  if (toString.call(input) !== "[object Array]") throw "Not given an array";
  if (!input.length) throw "Array is empty";

  let a = input[0];
  for (let i = 1; i < input.length; i++) {
    let b = input[i];
    a = gcd_two_numbers(a, b);
  }
  return a;
}

function gcd_two_numbers(x, y) {
  if (typeof x !== "number" || typeof y !== "number")
    throw "a or b not a number";

  x = Math.abs(x);
  y = Math.abs(y);
  while (y) {
    var t = y;
    y = x % y;
    x = t;
  }
  return x;
}

function lcm_array(input) {
  if (toString.call(input) !== "[object Array]") throw "Not given an array";
  if (!input.length) throw "Array is empty";

  let a = input[0];
  for (let i = 1; i < input.length; i++) {
    let b = input[i];
    a = lcm_two_numbers(a, b);
  }
  return a;
}

function lcm_two_numbers(x, y) {
  if (typeof x !== "number" || typeof y !== "number")
    throw "a or b not a number";
  return !x || !y ? 0 : Math.abs((x * y) / gcd_two_numbers(x, y));
}

function convertToBinary(num) {
  return (num >>> 0).toString(2);
}

module.exports = {
  isPrime,
  getFactors,
  isDivisibleBy,
  gcd_two_numbers,
  gcd_array,
  lcm_two_numbers,
  lcm_array,
  convertToBinary,
};

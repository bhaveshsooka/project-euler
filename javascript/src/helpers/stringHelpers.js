"use strict";

function arraysEqual(a, b) {
  // Sort the arrays and convert them to strings, then compare the strings
  return JSON.stringify(a.slice().sort()) === JSON.stringify(b.slice().sort());
}

function isPalindrome(string) {
  return string.split("").reverse().join("") == string;
}

function sumDigits(num) {
  let stringNum = num.toString();
  let sum = 0;
  for (let i = 0; i < stringNum.length; i++) {
    sum += Number(stringNum[i]);
  }
  return sum;
}

module.exports = {
  arraysEqual,
  isPalindrome,
  sumDigits,
};

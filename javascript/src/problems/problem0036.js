"use strict";

const mathHelpers = require("../helpers/mathHelpers");
const stringHelpers = require("../helpers/stringHelpers");

function solve(limit) {
  let sum = 0;
  for (let num = 1; num < limit; num += 2) {
    let binary = mathHelpers.convertToBinary(num);
    let numIsPalindrome = stringHelpers.isPalindrome(num.toString());
    let binaryIsPalindrome = stringHelpers.isPalindrome(binary.toString());

    if (numIsPalindrome && binaryIsPalindrome) {
      sum += Number.parseInt(num);
    }
  }
  return sum;
}

module.exports = {
  solve,
};

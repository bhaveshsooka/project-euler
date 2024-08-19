"use strict";

const arrayHelpers = require("../helpers/arrayHelpers");
const mathHelpers = require("../helpers/mathHelpers");

function solveBruteForce() {
  let inputArray = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];
  let index = Math.pow(10, 6) - 1;
  let permutations = arrayHelpers.getPermutations(inputArray);

  return permutations[index].join("");
}

function solve() {
  let inputArray = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];
  let remainder = Math.pow(10, 6) - 1;
  let N = inputArray.length;
  let result = "";
  for (let i = 1; i < N; i++) {
    let index = Math.floor(remainder / mathHelpers.factorial(N - i));
    remainder = Math.floor(remainder % mathHelpers.factorial(N - i));
    result += inputArray[index];
    inputArray.splice(index, 1);
    if (remainder == 0) break;
  }

  result += inputArray.join("");

  return result;
}

module.exports = {
  solve,
};

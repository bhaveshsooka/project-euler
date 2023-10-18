const arrayHelpers = require("../helpers/arrayHelpers");

function solve() {
  let inputArray = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];
  let index = Math.pow(10, 6) - 1;
  let permutations = arrayHelpers.getPermutations(inputArray);

  return permutations[index].join("");
}

module.exports = {
  solve,
};

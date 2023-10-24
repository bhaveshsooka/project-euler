"use strict";

const stringHelpers = require("../helpers/stringHelpers");

function solve() {
  let maxSumOfDigits = 0;
  let maxBase = 0;
  let maxExponent = 0;

  for (let base = 1; base < 100; base++) {
    for (let exponent = 1; exponent < 100; exponent++) {
      let power = (BigInt(base) ** BigInt(exponent)).toString();

      let sumOfDigits = stringHelpers.sumDigits(power);
      if (sumOfDigits > maxSumOfDigits) {
        maxSumOfDigits = sumOfDigits;
        maxBase = base;
        maxExponent = exponent;
      }
    }
  }

  console.log(maxBase, maxExponent, maxSumOfDigits);
  return { maxBase, maxExponent, maxSumOfDigits };
}

module.exports = {
  solve,
};

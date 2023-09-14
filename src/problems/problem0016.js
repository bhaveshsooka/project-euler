"use strict";

function solve(base, exponent) {
  let power = BigInt(base ** exponent).toString();

  return sumDigits(power);
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
  solve,
};

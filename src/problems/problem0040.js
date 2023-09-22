"use strict";

const d1 = Math.pow(10, 0);
const d10 = Math.pow(10, 1);
const d100 = Math.pow(10, 2);
const d1000 = Math.pow(10, 3);
const d10000 = Math.pow(10, 4);
const d100000 = Math.pow(10, 5);
const d1000000 = Math.pow(10, 6);

function solve() {
  let tenThousandString = generateString(d1000000);
  let idx1 = tenThousandString.charAt(d1 - 1);
  let idx10 = tenThousandString.charAt(d10 - 1);
  let idx100 = tenThousandString.charAt(d100 - 1);
  let idx1000 = tenThousandString.charAt(d1000 - 1);
  let idx10000 = tenThousandString.charAt(d10000 - 1);
  let idx100000 = tenThousandString.charAt(d100000 - 1);
  let idx1000000 = tenThousandString.charAt(d1000000 - 1);

  return (
    parseInt(idx1) *
    parseInt(idx10) *
    parseInt(idx100) *
    parseInt(idx1000) *
    parseInt(idx10000) *
    parseInt(idx100000) *
    parseInt(idx1000000)
  );
}

function generateString(limit) {
  let string = "";
  let num = 1;
  while (string.length < limit) {
    string += num;
    num++;
  }

  return string;
}

module.exports = {
  solve,
  generateString,
};

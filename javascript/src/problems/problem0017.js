"use strict";

let ones = {
  1: "one",
  2: "two",
  3: "three",
  4: "four",
  5: "five",
  6: "six",
  7: "seven",
  8: "eight",
  9: "nine",
  10: "ten",
};

let teens = {
  11: "eleven",
  12: "twelve",
  13: "thirteen",
  14: "fourteen",
  15: "fifteen",
  16: "sixteen",
  17: "seventeen",
  18: "eighteen",
  19: "nineteen",
};

let tens = {
  20: "twenty",
  30: "thirty",
  40: "forty",
  50: "fifty",
  60: "sixty",
  70: "seventy",
  80: "eighty",
  90: "ninety",
};

let hundreds = {
  100: "onehundred",
  200: "twohundred",
  300: "threehundred",
  400: "fourhundred",
  500: "fivehundred",
  600: "sixhundred",
  700: "sevenhundred",
  800: "eighthundred",
  900: "ninehundred",
};

function toWord(num) {
  if (num == 1000) return "onethousand";
  if (num <= 10) return ones[num];
  if (num <= 19) return teens[num];

  if (num < 100) {
    let rem = num % 10;
    let index = num - rem;

    if (rem == 0) return tens[index];
    return tens[index] + toWord(rem);
  }

  if (num < 1000) {
    let rem = num % 100;
    let index = num - rem;
    if (rem == 0) return hundreds[index];
    return hundreds[index] + "and" + toWord(rem);
  }
}

function solve() {
  let letterCounts = 0;
  for (let num = 1; num < 1001; num++) {
    let wordOfNum = toWord(num);
    letterCounts += wordOfNum.length;
  }
  return letterCounts;
}

module.exports = {
  toWord,
  solve,
};

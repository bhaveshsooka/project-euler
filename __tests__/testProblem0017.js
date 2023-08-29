const problem0017 = require("../src/problems/problem0017");

test("Problem 17 solution should be 21124", () => {
  expect(problem0017.solve()).toBe(21124);
});

test("toWord works for the first 10 numbers", () => {
  let units = {
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
  for (let i in units) {
    expect(problem0017.toWord(i)).toBe(units[i]);
  }
});

test("toWord works for the teens", () => {
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
  for (let i in teens) {
    expect(problem0017.toWord(i)).toBe(teens[i]);
  }
});

test("toWord works for a set of random numbers in [20,100)", () => {
  let numbers = {
    27: "twentyseven",
    89: "eightynine",
    50:  "fifty",
  };
  for (let i in numbers) {
    expect(problem0017.toWord(i)).toBe(numbers[i]);
  }
});

test("toWord works for a set of random numbers in [100,1000]", () => {
  let numbers = {
    800: "eighthundred",
    306: "threehundredandsix",
    111:  "onehundredandeleven",
    829: "eighthundredandtwentynine",
    238: "twohundredandthirtyeight",
    142: "onehundredandfortytwo",
    450: "fourhundredandfifty",
    763: "sevenhundredandsixtythree",
    371:  "threehundredandseventyone",
    989: "ninehundredandeightynine",
    999:  "ninehundredandninetynine",
    1000: "onethousand",
  };
  for (let i in numbers) {
    expect(problem0017.toWord(i)).toBe(numbers[i]);
  }
});



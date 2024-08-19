const problem0056 = require("../src/problems/problem0056");

test("Problem 56 solution should be 972 with a base of 99 and an exponent of 95", () => {
  expect(problem0056.solve()).toStrictEqual({
    maxBase: 99,
    maxExponent: 95,
    maxSumOfDigits: 972,
  });
});

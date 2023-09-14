const problem0005 = require("../src/problems/problem0005");

test("Problem 5 solution should be 232792560", () => {
  expect(problem0005.solve(20)).toBe(232792560);
});

test("base case (limit = 10) should be 2520", () => {
  expect(problem0005.solve(10)).toBe(2520);
});

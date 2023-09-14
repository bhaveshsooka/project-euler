const problem0016 = require("../src/problems/problem0016");

test("Problem 16 base case 15 solution should be 26", () => {
  expect(problem0016.solve(2, 15)).toBe(26);
});

test("Problem 16 solution should be 1366", () => {
  expect(problem0016.solve(2, 1000)).toBe(1366);
});

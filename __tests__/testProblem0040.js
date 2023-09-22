const problem0040 = require("../src/problems/problem0040");

test("Problem 40 solution should be 210", () => {
  expect(problem0040.solve()).toBe(210);
});

test("generateString simple case", () => {
  expect(problem0040.generateString(13)).toBe("1234567891011");
});

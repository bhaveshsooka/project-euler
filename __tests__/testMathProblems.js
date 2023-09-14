const mathHelpers = require("../src/helpers/mathHelpers");

test("gcd_array simple cases", () => {
  expect(mathHelpers.gcd_array([5, 15, 110])).toBe(5);
});

test("lcm_array simple cases", () => {
  expect(
    mathHelpers.lcm_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13])
  ).toBe(360360);
});

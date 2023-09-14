const mathHelpers = require("../src/helpers/mathHelpers");

test("gcd_array simple cases", () => {
  expect(mathHelpers.gcd_array([5, 15, 110])).toBe(5);
});

test("lcm_array simple cases", () => {
  expect(
    mathHelpers.lcm_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13])
  ).toBe(360360);
});

test("convertToBinary simple cases", () => {
  let facts = {
    1: "1",
    2: "10",
    3: "11",
    4: "100",
    6: "110",
    7: "111",
    9: "1001",
    10: "1010",
    11: "1011",
    12: "1100",
    17: "10001",
    18: "10010",
    20: "10100",
    "-1": "11111111111111111111111111111111",
    "-3": "11111111111111111111111111111101",
  };

  for (let i in facts) {
    expect(mathHelpers.convertToBinary(i)).toBe(facts[i]);
  }
});

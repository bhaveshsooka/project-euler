const stringHelpers = require("../src/helpers/stringHelpers");

test("isPalindrome", () => {
  let facts = {
    racecar: true,
    kdjhf: false,
    "": true,
    a: true,
    ab: false,
    aba: true,
    987358767853789: true,
  };

  for (let i in facts) {
    expect(stringHelpers.isPalindrome(i)).toBe(facts[i]);
  }
});

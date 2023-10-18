const arrayHelpers = require("../src/helpers/arrayHelpers");

test("getPermutations simple case", () => {
  let facts = [
    {
      input: ['c','a','t'],
      output: [
        ["c", "a", "t"],
        ["c", "t", "a"],
        ["a", "c", "t"],
        ["a", "t", "c"],
        ["t", "c", "a"],
        ["t", "a", "c"],
      ],
    },
  ];

  for (let testCaseIndex in facts) {
    let testCase = facts[testCaseIndex];
    let testCaseInput = testCase.input;
    let testCaseOutput = testCase.output;
    expect(arrayHelpers.getPermutations(testCaseInput)).toStrictEqual(testCaseOutput);
  }
});

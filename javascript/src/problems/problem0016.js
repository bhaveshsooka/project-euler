"use strict";

const stringHelpers = require("../helpers/stringHelpers");

function solve(base, exponent) {
  let power = BigInt(base ** exponent).toString();

  return stringHelpers.sumDigits(power);
}

module.exports = {
  solve,
};

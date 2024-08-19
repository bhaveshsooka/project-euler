"use strict";

const mathHelpers = require("../helpers/mathHelpers");
const arrayHelpers = require("../helpers/arrayHelpers");

function solve(limit) {
  let nums = arrayHelpers.range(1, limit);
  return mathHelpers.lcm_array(nums);
}

module.exports = {
  solve,
};

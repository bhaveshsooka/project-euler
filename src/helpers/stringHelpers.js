"use strict";

function arraysEqual(a, b) {
  // Sort the arrays and convert them to strings, then compare the strings
  return JSON.stringify(a.slice().sort()) === JSON.stringify(b.slice().sort());
}

module.exports = {
  arraysEqual,
};

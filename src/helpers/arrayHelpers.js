"use strict";

function range(min, max) {
  var arr = [];
  for (var i = min; i <= max; i++) {
    arr.push(i);
  }
  return arr;
}

function isSubset(subsetArr, parentArr) {
  return subsetArr.every((e) => parentArr.includes(e));
}

module.exports = {
  range,
  isSubset,
};

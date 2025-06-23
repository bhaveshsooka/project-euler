module Problems.Problem0002
  ( solution,
  )
where

import Util.Math (fibs)

solution :: Integer
solution = sum $ takeWhile (<= 4000000) $ filter even fibs

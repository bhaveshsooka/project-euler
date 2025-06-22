module Problems.Problem0002
  ( solution,
  )
where

import Util.Math (fibs)

solution :: Int
solution = sum $ takeWhile (<= 4000000) $ filter even fibs

module Problems.Problem0012
  ( solution,
  )
where

import Util.Math (factors)

solution :: Integer
solution = case moreThan500 of
  (x : _) -> x
  [] -> error "No triangular number with more than 500 factors found"
  where
    moreThan500 = [n | n <- triangularNumbers, length (factors n) > 500]
    triangularNumbers = scanl1 (+) [1 ..]

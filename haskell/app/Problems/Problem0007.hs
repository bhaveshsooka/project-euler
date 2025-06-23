module Problems.Problem0007
  ( solution,
  )
where

import Util.Math (primes)

solution :: Int
solution = primes !! 10000

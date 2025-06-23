module Problems.Problem0007
  ( solution,
  )
where

import Util.Math (primes)

solution :: Integer
solution = primes !! 10000

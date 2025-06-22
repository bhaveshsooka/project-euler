module Problems.Problem0007
  ( solution,
  )
where

import Util.Math (isPrime)

solution :: Int
solution = last $ take 10001 primes
  where
    primes = filter isPrime [2 ..]

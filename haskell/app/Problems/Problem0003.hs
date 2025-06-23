module Problems.Problem0003
  ( solution,
  )
where

import Util.Math (primeFactors)

solution :: Integer
solution = maximum $ primeFactors 600851475143
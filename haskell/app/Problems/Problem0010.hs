module Problems.Problem0010
  ( solution,
  )
where
import Util.Math (sieveOfEratosthenes)

solution :: Int
solution = sum $ sieveOfEratosthenes 2000000

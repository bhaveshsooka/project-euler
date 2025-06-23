module Problems.Problem0010
  ( solution,
  )
where
import Util.Math (sieveOfEratosthenes)

solution :: Integer
solution = sum $ sieveOfEratosthenes 2000000

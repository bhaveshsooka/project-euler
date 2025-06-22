module Problems.Problem0006
  ( solution,
  )
where

solution :: Int
solution = abs (sumOfSquares - squareOfSum)
  where
    sumOfSquares = sum [x * x | x <- [1 .. 100]]
    squareOfSum = sum [1 .. 100] ^ (2 :: Int)

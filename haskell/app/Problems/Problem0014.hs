module Problems.Problem0014
  ( solution,
  )
where

import Data.Function (on)
import Data.List (maximumBy)

solution :: Int
solution = fst $ maximumBy (compare `on` snd) collatzSequences
  where
    collatzSequences = (\i -> (i, length $ collatz i)) <$> [1 .. 1000000]

collatz :: Int -> [Int]
collatz n
  | n == 1 = []
  | n == 2 = [2, 1]
  | even n = n : collatz (n `div` 2)
  | otherwise = n : collatz (3 * n + 1)

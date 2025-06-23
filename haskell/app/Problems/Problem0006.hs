module Problems.Problem0006
  ( solution,
  )
where

solution :: Int
solution = (sum nums ^ power) - sum ((^power) <$> nums)
  where
    nums = [1 .. 100]
    power :: Int = 2

module Problems.Problem0005
  ( solution,
  )
where

solution :: Int
solution = foldl1 lcm [1 .. 20]

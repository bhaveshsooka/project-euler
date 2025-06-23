module Problems.Problem0005
  ( solution,
  )
where

solution :: Int
solution = foldr1 lcm [1 .. 20]

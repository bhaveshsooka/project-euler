module Problems.Problem0016
  ( solution,
  )
where

solution :: Integer
solution = foldr (\x acc -> acc + read [x]) 0 (show num)
  where
    num :: Integer = 2 ^ (1000 :: Integer)
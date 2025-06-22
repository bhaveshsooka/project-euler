module Problems.Problem0009
  ( solution,
  )
where

solution :: Int
solution =
  sum $
    [ a * b * c
      | a <- [1 .. 1000],
        b <- [1 .. 1000],
        a < b,
        c <- [1 .. 1000],
        b < c,
        a + b + c == 1000,
        a * a + b * b == c * c
    ]

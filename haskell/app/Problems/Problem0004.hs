module Problems.Problem0004
  ( solution,
  )
where

solution :: Int
solution =
  maximum $
    [ z
      | x <- [100 .. 999],
        y <- [100 .. 999],
        let z = x * y,
        let s = show z,
        s == reverse s
    ]

module Problems.Problem0017
  ( solution,
  )
where

solution :: Int
solution =
  sum $
    [ length $ numberToWord n
      | n <- [1 .. 1000]
    ]
  where
    numberToWord :: Int -> String
    numberToWord n
      | n == 1000 = "onethousand"
      | n >= 100 =
          numberToWord hundreds
            ++ "hundred"
            ++ if rest > 0 then "and" ++ numberToWord rest else ""
      | n >= 20 =
          tensWords !! (tens - 2)
            ++ if units > 0 then unitsWords !! (units - 1) else ""
      | n >= 10 = teensWords !! (n - 10)
      | n >= 1 = unitsWords !! (n - 1)
      | otherwise = ""
      where
        (tens, units) = divMod n 10
        (hundreds, rest) = divMod n 100
    teensWords = ["ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"]
    tensWords = ["twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"]
    unitsWords = ["one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]

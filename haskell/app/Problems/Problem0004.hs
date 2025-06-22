module Problems.Problem0004
  ( solution,
  )
where

solution :: Int
solution = maximum palindromes
  where
    isPalindrome n = show n == reverse (show n)
    palindromes = [x * y | x <- [100 .. 999], y <- [100 .. 999], isPalindrome (x * y)]
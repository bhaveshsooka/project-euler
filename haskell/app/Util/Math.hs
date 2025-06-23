module Util.Math where

import Data.List (unfoldr)

fibs :: [Integer]
fibs =
  unfoldr
    (\(a, b) -> Just (a, (b, a + b)))
    (0, 1)

factors :: Integer -> [Integer]
factors n =
  [x | x <- [1 .. nRoot], n `mod` x == 0]
    ++ [n `div` x | x <- [1 .. nRoot], n `mod` x == 0, x /= n `div` x]
  where
    nRoot = floor (sqrt (fromIntegral n) :: Double)

isPrime :: Integer -> Bool
isPrime n
  | n < 2 = False
  | otherwise = null [x | x <- [2 .. nRoot], n `mod` x == 0]
  where
    nRoot = floor (sqrt (fromIntegral n) :: Double)

primeFactors :: Integer -> [Integer]
primeFactors n = filter isPrime (factors n)

primes :: [Integer]
primes = filter isPrime [2 ..]

sieveOfEratosthenes :: Integer -> [Integer]
sieveOfEratosthenes n = sieve [2 .. n]
  where
    sieve [] = []
    sieve (p : xs)
      | p * p > n = p : xs
      | otherwise = p : sieve [x | x <- xs, x `mod` p /= 0]

binomialCoefficient :: Integer -> Integer -> Integer
binomialCoefficient n k = product [1 .. n] `div` (product [1 .. k] * product [1 .. (n - k)])
module Util.Math where

import Data.List (unfoldr)

fibs :: [Int]
fibs =
  unfoldr
    (\(a, b) -> Just (a, (b, a + b)))
    (0, 1)

factors :: Int -> [Int]
factors n =
  [x | x <- [1 .. nRoot], n `mod` x == 0]
    ++ [n `div` x | x <- [1 .. nRoot], n `mod` x == 0, x /= n `div` x]
  where
    nRoot = floor (sqrt (fromIntegral n) :: Double)

primeFactors :: Int -> [Int]
primeFactors n = filter isPrime (factors n)

isPrime :: Int -> Bool
isPrime n
  | n < 2 = False
  | otherwise = null [x | x <- [2 .. nRoot], n `mod` x == 0]
  where
    nRoot = floor (sqrt (fromIntegral n) :: Double)

primes :: [Int]
primes = filter isPrime [2 ..]

sieveOfEratosthenes :: Int -> [Int]
sieveOfEratosthenes n = sieve [2 .. n]
  where
    sieve [] = []
    sieve (p : xs)
      | p * p > n = p : xs
      | otherwise = p : sieve [x | x <- xs, x `mod` p /= 0]
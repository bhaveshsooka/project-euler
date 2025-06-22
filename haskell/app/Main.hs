module Main where

import Model (EulerAnswer (EulerAnswer))
import Problems.Module (getSolution)

main :: IO ()
main = do
  putStrLn "Which problem do you want to solve?"
  p <- readLn :: IO Int
  let sol = getSolution p
  case sol of
    EulerAnswer a -> print a

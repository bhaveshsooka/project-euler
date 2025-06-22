module Problems.Module
  ( getSolution,
  )
where

import Model (EulerAnswer (EulerAnswer))
import Problems.Problem0001 qualified as P0001
import Problems.Problem0002 qualified as P0002
import Problems.Problem0003 qualified as P0003

getSolution :: Int -> EulerAnswer
getSolution 0001 = EulerAnswer P0001.solution
getSolution 0002 = EulerAnswer P0002.solution
getSolution 0003 = EulerAnswer P0003.solution
getSolution _ = error "Problem not found"
module Problems.Module
  ( getSolution,
  )
where

import Model (EulerAnswer (EulerAnswer))
import Problems.Problem0001 qualified as P0001
import Problems.Problem0002 qualified as P0002
import Problems.Problem0003 qualified as P0003
import Problems.Problem0004 qualified as P0004
import Problems.Problem0005 qualified as P0005
import Problems.Problem0006 qualified as P0006
import Problems.Problem0007 qualified as P0007
import Problems.Problem0008 qualified as P0008
import Problems.Problem0009 qualified as P0009
import Problems.Problem0010 qualified as P0010
import Problems.Problem0011 qualified as P0011

getSolution :: Int -> EulerAnswer
getSolution 0001 = EulerAnswer P0001.solution
getSolution 0002 = EulerAnswer P0002.solution
getSolution 0003 = EulerAnswer P0003.solution
getSolution 0004 = EulerAnswer P0004.solution
getSolution 0005 = EulerAnswer P0005.solution
getSolution 0006 = EulerAnswer P0006.solution
getSolution 0007 = EulerAnswer P0007.solution
getSolution 0008 = EulerAnswer P0008.solution
getSolution 0009 = EulerAnswer P0009.solution
getSolution 0010 = EulerAnswer P0010.solution
getSolution 0011 = EulerAnswer P0011.solution
getSolution _ = error "Problem not found"
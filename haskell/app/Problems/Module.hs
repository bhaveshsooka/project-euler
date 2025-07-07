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
import Problems.Problem0012 qualified as P0012
import Problems.Problem0013 qualified as P0013
import Problems.Problem0014 qualified as P0014
import Problems.Problem0015 qualified as P0015
import Problems.Problem0016 qualified as P0016
import Problems.Problem0017 qualified as P0017
import Problems.Problem0018 qualified as P0018
import Problems.Problem0067 qualified as P0067

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
getSolution 0012 = EulerAnswer P0012.solution
getSolution 0013 = EulerAnswer P0013.solution
getSolution 0014 = EulerAnswer P0014.solution
getSolution 0015 = EulerAnswer P0015.solution
getSolution 0016 = EulerAnswer P0016.solution
getSolution 0017 = EulerAnswer P0017.solution
getSolution 0018 = EulerAnswer P0018.solution
getSolution 0067 = EulerAnswer P0067.solution
getSolution _ = error "Problem not found"
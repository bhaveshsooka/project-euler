USE [euler_db]
GO
/****** Object:  UserDefinedFunction [dbo].[fibonacci]    Script Date: 2022/12/05 14:03:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE FUNCTION [dbo].[fibonacci]
(	
	@limit bigint
)
RETURNS TABLE 
AS
RETURN 
(

	WITH Fibonacci (PrevN, N) AS
	(
		 SELECT 0, 1
		 UNION ALL
		 SELECT N, PrevN + N
		 FROM Fibonacci
		 WHERE N < @limit
	)

	SELECT PrevN as Fibonacci
	FROM Fibonacci
)
GO

USE [euler_db]
GO
/****** Object:  StoredProcedure [dbo].[problem_0002]    Script Date: 2022/12/05 14:03:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE procedure [dbo].[problem_0002] as
begin

	-- 4613732

	select 
		2				[problem_number],
		sum(Fibonacci)	[answer]
	from fibonacci(4000000)
	where 1=1
		and Fibonacci % 2 = 0
	
end
GO

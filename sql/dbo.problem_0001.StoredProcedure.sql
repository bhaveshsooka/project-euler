USE [euler_db]
GO
/****** Object:  StoredProcedure [dbo].[problem_0001]    Script Date: 2022/12/05 14:03:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE procedure [dbo].[problem_0001] as
begin

	-- 233168

	select 
		1		[problem_number],
		sum(N)	[answer]
	from natural_numbers
	where 1=1
		and N < 1000
		and (N % 3 = 0 or N % 5 = 0)
end
GO

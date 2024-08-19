USE [euler_db]
GO
/****** Object:  StoredProcedure [dbo].[problem_0003]    Script Date: 2022/12/05 14:03:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

create procedure [dbo].[problem_0003] as
begin

	-- 6857

	declare @number bigint = 600851475143 

	select
		3		[problem_number],
		max(N)	[answer]
	from natural_numbers
	where 1=1
		and N <= floor(sqrt(@number))
		and @number % N = 0
		and dbo.is_prime(N) = 1

	
end
GO

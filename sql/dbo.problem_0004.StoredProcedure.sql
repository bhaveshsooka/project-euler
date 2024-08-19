USE [euler_db]
GO
/****** Object:  StoredProcedure [dbo].[problem_0004]    Script Date: 2022/12/05 14:03:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

create procedure [dbo].[problem_0004] as
begin

	-- 906609

	with data_subset (id, N) as
	(
		select 
			1 as id,
			N 
		from natural_numbers
		where 1=1
			and N <= 999
			and N >= 100
	)

	select
		4		[problem_number],
		max(a.N * b.N)	[answer]
	from data_subset a
		join data_subset b
		on a.id = b.id
	where 1=1
		and dbo.isPalindrome(cast(a.N * b.N as varchar(max))) = 1

end
GO

USE [euler_db]
GO
/****** Object:  UserDefinedFunction [dbo].[is_prime]    Script Date: 2022/12/05 14:03:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

-- select test_db.dbo.is_prime(23)
CREATE function [dbo].[is_prime]
(
	@number bigint
)
returns bit
as
begin
	
	if( @number <= 1) 
		return 0
	if( @number in (2, 3, 5, 7, 11)) 
		return 1

	declare @x bigint = 2;

	while (@x <= floor(sqrt(@number)) + 1 )
	begin
		if (( @number % @x) = 0 )
		begin
			return 0
		end
		set @x = @x + 1
	end

	return 1
end
GO

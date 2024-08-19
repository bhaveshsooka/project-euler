USE [euler_db]
GO
/****** Object:  UserDefinedFunction [dbo].[isPalindrome]    Script Date: 2022/12/05 14:03:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

-- select dbo.isPalindrome('aaas')
CREATE function [dbo].[isPalindrome]
(
	@str varchar(max)
)
returns bit
as
begin

	declare @reversed_str varchar(max)

	select @reversed_str = REVERSE(@str)

	if (@str = @reversed_str)
	begin
		return  1
	end

	return 0
	
end
GO

USE [euler_db]
GO
/****** Object:  StoredProcedure [dbo].[get_answers]    Script Date: 2022/12/05 14:03:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

-- exec get_answers
CREATE procedure [dbo].[get_answers] as
begin

	IF OBJECT_ID('tempdb..#answers') IS NOT NULL DROP TABLE #answers
	

	CREATE TABLE #answers (problem_number int, answer bigint)

	insert #answers exec problem_0001
	insert #answers exec problem_0002
	insert #answers exec problem_0003
	insert #answers exec problem_0004

	select * from #answers

end
GO

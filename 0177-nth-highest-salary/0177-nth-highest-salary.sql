CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
SET N=N-1;
  RETURN (
      # Write your MySQL query statement below.# Write your MySQL query statement below
 select distinct salary from Employee order by salary desc 
limit 1 OFFSET N
  );
END

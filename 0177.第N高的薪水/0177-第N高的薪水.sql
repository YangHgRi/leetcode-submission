CREATE FUNCTION getNthHighestSalary(N int) RETURNS INT
BEGIN
    SET n = N - 1;
    RETURN (
        SELECT DISTINCT salary
        FROM employee
        ORDER BY salary DESC
        LIMIT n,1
    );
end;

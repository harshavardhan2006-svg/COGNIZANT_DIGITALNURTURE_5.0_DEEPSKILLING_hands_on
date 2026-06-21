CREATE TABLE employees (
    empID NUMBER PRIMARY KEY,
    empName VARCHAR2(50),
    department VARCHAR2(30),
    salary NUMBER
);

INSERT INTO employees VALUES (1,'Siddu','HR',40000);
INSERT INTO employees VALUES (2,'Vikash','IT',50000);
INSERT INTO employees VALUES (3,'Harsha','IT',60000);
INSERT INTO employees VALUES (4,'Revanth','Finance',45000);

COMMIT;

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    deptName IN VARCHAR2,
    bonusPercent IN NUMBER
)
AS
BEGIN

   UPDATE employees
   SET salary =
       salary + (salary * bonusPercent / 100)
   WHERE department = deptName;

   COMMIT;

   DBMS_OUTPUT.PUT_LINE(
      'Bonus Updated Successfully'
   );

END;
/

BEGIN
   UpdateEmployeeBonus('IT',10);
END;
/

SELECT * FROM employees;
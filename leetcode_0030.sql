SELECT employee.name AS Employee from Employee employee, Employee manager
WHERE employee.managerId = manager.id AND employee.salary > manager.salary;

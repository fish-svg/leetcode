select Customers.name as Customers from Customers
left outer join Orders
on Customers.id = Orders.customerId
where Orders.customerId is null;

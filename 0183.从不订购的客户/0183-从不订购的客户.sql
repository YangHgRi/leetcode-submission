select c.Name as Customers
from Customers as c
        LEFT join Orders as o on c.Id = o.CustomerId
where o.Id is null;
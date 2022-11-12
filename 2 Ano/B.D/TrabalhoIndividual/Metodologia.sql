SELECT COUNT (CustomerId), Country
FROM customers
WHERE Country = 'Brazil'
GROUP BY Country;


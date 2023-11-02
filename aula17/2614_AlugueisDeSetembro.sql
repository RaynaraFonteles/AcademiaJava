SELECT
    c.name, r.rentals_date
FROM
    customers c
LEFT JOIN
    rentals r
ON 
    c.id = r.id_customers
WHERE
    rentals_date >= '2016-09-01'
    AND rentals_date <= '2016-09-30';
SELECT
    c.name, SUM(p.amount)
FROM
    products p
LEFT JOIN
    categories c
ON
    p.id_categories = c.id
GROUP BY 
    1;
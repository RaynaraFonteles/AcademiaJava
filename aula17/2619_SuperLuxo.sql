SELECT
    prod.name, prov.name, prod.price
FROM
    products prod
LEFT JOIN
    providers prov
ON
    prod.id_providers = prov.id
LEFT JOIN
    categories c
ON    
    prod.id_categories = c. id
WHERE
    price > 1000
    AND c.name = 'Super Luxury';
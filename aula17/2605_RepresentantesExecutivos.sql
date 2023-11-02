SELECT
    prod.name, prov.name
FROM products prod
LEFT JOIN 
    providers prov 
ON
    prod.id_providers = prov.id
WHERE
    id_categories = 6;
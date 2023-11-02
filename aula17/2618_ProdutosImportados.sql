SELECT
    prod.name, prov.name, c.name
FROM
    products prod
LEFT JOIN
    providers prov
ON
    prod.id_providers = prov.id
LEFT JOIN
    categories c
ON
    prod.id_categories = c.id
WHERE 
    prov.name = 'Sansul SA'
    AND c.name = 'Imported';
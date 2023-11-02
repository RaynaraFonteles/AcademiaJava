SELECT
    CONCAT(SUBSTRING(np.cpf, 1, 3), '.', 
    SUBSTRING(np.cpf, 4, 3), '.', 
    SUBSTRING(np.cpf, 7, 3), '-', 
    SUBSTRING(np.cpf, 10, 2)) 
    AS CPF
FROM
    natural_person np
LEFT JOIN
    customers c
ON
    c.id = np.id_customers;
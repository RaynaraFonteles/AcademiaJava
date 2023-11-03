-- 1)

CREATE TABLE Departamentos (
	ID SERIAL NOT NULL PRIMARY KEY, 
	nome character varying (50)
);
	
CREATE TABLE Funcionario (
	ID SERIAL NOT NULL PRIMARY KEY,
	nome text,
	cargo text,
	salario numeric(16,2),
	data_contratacao date,
	departamento_id integer,
	FOREIGN KEY (departamentos_id) REFERENCES departamentos (ID)
);
	
-- 2)

INSERT INTO Departamentos (Nome) VALUES
('DEPARTAMENTO 1'),
('DEPARTAMENTO 2'),
('DEPARTAMENTO 3');

INSERT INTO Funcionario (nome, cargo, salario, data_contratacao, departamento_id) VALUES
('João Silva', 'Gerente', 5000.00, '2020-01-01', 1),
('Maria Santos', 'Assistente', 2000.00, '2019-05-15', 2),
('Pedro Costa', 'Analista', 3000.00, '2020-03-20', 3),
('Ana Pereira', 'Gerente', 5000.00, '2021-01-01', 1);

-- 3)

SELECT f.nome, d.nome FROM funcionarios AS f
LEFT JOIN departamentos AS d ON f.departamentoid = d.id;

SELECT count(*) from departamentos;

-- 4)

SELECT * FROM funcionarios
WHERE salario > 3000

-- 5)

BEGIN;
UPDATE funcionarios 
	SET salario = 3500
	WHERE id = 3;
	
-- 6)

DELETE FROM funcionarios WHERE Nome = 'Maria Santos';

-- 7)

SELECT
	nome, salario
FROM 
	funcionarios
ORDER BY
	salario DESC;
	
-- 8)

SELECT 
	cargo, ROUND(AVG(salario), 2)
FROM funcionarios
GROUP BY cargo

-- 9)

SELECT
	f.nome, d.nome
FROM
	funcionarios f
LEFT JOIN
	departamentos d
ON
	f.departamentoID = d.id;
	
-- 10)

SELECT
	d.nome AS departamento,
	COUNT(*) AS nroFuncionarios	
FROM
	funcionarios f
LEFT JOIN 
	departamentos d
ON
	f.departamentoID = d.id
GROUP BY 
	1;
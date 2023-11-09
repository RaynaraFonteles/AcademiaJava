-- Table: public.funcionarios

-- DROP TABLE IF EXISTS public.funcionarios;

CREATE TABLE IF NOT EXISTS public.funcionarios
(
    id integer NOT NULL DEFAULT nextval('funcionarios_id_seq'::regclass),
    nome text COLLATE pg_catalog."default",
    cargo text COLLATE pg_catalog."default",
    salario numeric(16,2),
    data_contratacao date,
    departamento_id integer,
    CONSTRAINT funcionarios_pkey PRIMARY KEY (id),
    CONSTRAINT funcionarios_departamento_id_fkey FOREIGN KEY (departamento_id)
        REFERENCES public.departamentos (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.funcionarios
    OWNER to postgres;
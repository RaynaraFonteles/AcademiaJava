-- Table: public.departamentos

-- DROP TABLE IF EXISTS public.departamentos;

CREATE TABLE IF NOT EXISTS public.departamentos
(
    id integer NOT NULL DEFAULT nextval('departamentos_id_seq'::regclass),
    nome character varying(50) COLLATE pg_catalog."default",
    CONSTRAINT departamentos_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.departamentos
    OWNER to postgres;
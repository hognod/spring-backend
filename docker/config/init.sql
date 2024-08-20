create table employees
(
    id                  bigserial constraint employees_pk primary key,
    first_name          varchar(255)    not null,
    last_name           varchar(255)    not null,
    email               varchar(255)    not null,
    phone               varchar(255)    not null,
    job_title           varchar(255)    not null,
    hire_date           date            not null,
    created_by          bigint          not null,
    created_at          timestamp       not null,
    updated_by          bigint          not null,
    updated_at          timestamp       not null,
    deleted             boolean         default false,
    deleted_by          bigint,
    deleted_at          timestamp
);

alter table employees owner to hognod;

INSERT INTO public.employees (first_name, last_name, email, phone, job_title, hire_date, created_by, created_at, updated_by, updated_at)
VALUES ('길동', '홍', 'abc@email.com', '010-1234-5678', 'pro', '2024-01-01', 1, '2024-08-18 01:26:25.503312', 1, '2024-08-18 01:26:25.503312');
INSERT INTO public.employees (first_name, last_name, email, phone, job_title, hire_date, created_by, created_at, updated_by, updated_at)
VALUES ('흥민', '손', 'abc@email.com', '010-1234-5678', 'pro', '2024-01-01', 1, '2024-08-18 01:26:25.503312', 1, '2024-08-18 01:26:25.503312');
INSERT INTO public.employees (first_name, last_name, email, phone, job_title, hire_date, created_by, created_at, updated_by, updated_at)
VALUES ('연아', '김', 'abc@email.com', '010-1234-5678', 'pro', '2024-01-01', 1, '2024-08-18 01:26:25.503312', 1, '2024-08-18 01:26:25.503312');
INSERT INTO public.employees (first_name, last_name, email, phone, job_title, hire_date, created_by, created_at, updated_by, updated_at)
VALUES ('세형', '양', 'abc@email.com', '010-1234-5678', 'pro', '2024-01-01', 1, '2024-08-18 01:26:25.503312', 1, '2024-08-18 01:26:25.503312');
INSERT INTO public.employees (first_name, last_name, email, phone, job_title, hire_date, created_by, created_at, updated_by, updated_at)
VALUES ('재석', '유', 'abc@email.com', '010-1234-5678', 'pro', '2024-01-01', 1, '2024-08-18 01:26:25.503312', 1, '2024-08-18 01:26:25.503312');
INSERT INTO public.employees (first_name, last_name, email, phone, job_title, hire_date, created_by, created_at, updated_by, updated_at)
VALUES ('세호', '조', 'abc@email.com', '010-1234-5678', 'pro', '2024-01-01', 1, '2024-08-18 01:26:25.503312', 1, '2024-08-18 01:26:25.503312');
INSERT INTO public.employees (first_name, last_name, email, phone, job_title, hire_date, created_by, created_at, updated_by, updated_at)
VALUES ('두호', '김', 'abc@email.com', '010-1234-5678', 'pro', '2024-01-01', 1, '2024-08-18 01:26:25.503312', 1, '2024-08-18 01:26:25.503312');
INSERT INTO public.employees (first_name, last_name, email, phone, job_title, hire_date, created_by, created_at, updated_by, updated_at)
VALUES ('정환', '안', 'abc@email.com', '010-1234-5678', 'pro', '2024-01-01', 1, '2024-08-18 01:26:25.503312', 1, '2024-08-18 01:26:25.503312');
INSERT INTO public.employees (first_name, last_name, email, phone, job_title, hire_date, created_by, created_at, updated_by, updated_at)
VALUES ('지성', '박', 'abc@email.com', '010-1234-5678', 'pro', '2024-01-01', 1, '2024-08-18 01:26:25.503312', 1, '2024-08-18 01:26:25.503312');
INSERT INTO public.employees (first_name, last_name, email, phone, job_title, hire_date, created_by, created_at, updated_by, updated_at)
VALUES ('날두', '호', 'abc@email.com', '010-1234-5678', 'pro', '2024-01-01', 1, '2024-08-18 01:26:25.503312', 1, '2024-08-18 01:26:25.503312');
INSERT INTO public.employees (first_name, last_name, email, phone, job_title, hire_date, created_by, created_at, updated_by, updated_at)
VALUES ('덕배', '김', 'abc@email.com', '010-1234-5678', 'pro', '2024-01-01', 1, '2024-08-18 01:26:25.503312', 1, '2024-08-18 01:26:25.503312');
INSERT INTO public.employees (first_name, last_name, email, phone, job_title, hire_date, created_by, created_at, updated_by, updated_at)
VALUES ('민재', '김', 'abc@email.com', '010-1234-5678', 'pro', '2024-01-01', 1, '2024-08-18 01:26:25.503312', 1, '2024-08-18 01:26:25.503312');
INSERT INTO public.employees (first_name, last_name, email, phone, job_title, hire_date, created_by, created_at, updated_by, updated_at)
VALUES ('강인', '이', 'abc@email.com', '010-1234-5678', 'pro', '2024-01-01', 1, '2024-08-18 01:26:25.503312', 1, '2024-08-18 01:26:25.503312');
INSERT INTO public.employees (first_name, last_name, email, phone, job_title, hire_date, created_by, created_at, updated_by, updated_at)
VALUES ('희찬', '황', 'abc@email.com', '010-1234-5678', 'pro', '2024-01-01', 1, '2024-08-18 01:26:25.503312', 1, '2024-08-18 01:26:25.503312');
INSERT INTO public.employees (first_name, last_name, email, phone, job_title, hire_date, created_by, created_at, updated_by, updated_at)
VALUES ('기현', '설', 'abc@email.com', '010-1234-5678', 'pro', '2024-01-01', 1, '2024-08-18 01:26:25.503312', 1, '2024-08-18 01:26:25.503312');
INSERT INTO public.employees (first_name, last_name, email, phone, job_title, hire_date, created_by, created_at, updated_by, updated_at)
VALUES ('남일', '김', 'abc@email.com', '010-1234-5678', 'pro', '2024-01-01', 1, '2024-08-18 01:26:25.503312', 1, '2024-08-18 01:26:25.503312');
INSERT INTO public.employees (first_name, last_name, email, phone, job_title, hire_date, created_by, created_at, updated_by, updated_at)
VALUES ('민혁', '양', 'abc@email.com', '010-1234-5678', 'pro', '2024-01-01', 1, '2024-08-18 01:26:25.503312', 1, '2024-08-18 01:26:25.503312');
INSERT INTO public.employees (first_name, last_name, email, phone, job_title, hire_date, created_by, created_at, updated_by, updated_at)
VALUES ('승호', '백', 'abc@email.com', '010-1234-5678', 'pro', '2024-01-01', 1, '2024-08-18 01:26:25.503312', 1, '2024-08-18 01:26:25.503312');
INSERT INTO public.employees (first_name, last_name, email, phone, job_title, hire_date, created_by, created_at, updated_by, updated_at)
VALUES ('승우', '이', 'abc@email.com', '010-1234-5678', 'pro', '2024-01-01', 1, '2024-08-18 01:26:25.503312', 1, '2024-08-18 01:26:25.503312');
INSERT INTO public.employees (first_name, last_name, email, phone, job_title, hire_date, created_by, created_at, updated_by, updated_at)
VALUES ('준호', '배', 'abc@email.com', '010-1234-5678', 'pro', '2024-01-01', 1, '2024-08-18 01:26:25.503312', 1, '2024-08-18 01:26:25.503312');
INSERT INTO public.employees (first_name, last_name, email, phone, job_title, hire_date, created_by, created_at, updated_by, updated_at)
VALUES ('자깡', '감', 'abc@email.com', '010-1234-5678', 'pro', '2024-01-01', 1, '2024-08-18 01:26:25.503312', 1, '2024-08-18 01:26:25.503312');
INSERT INTO public.employees (first_name, last_name, email, phone, job_title, hire_date, created_by, created_at, updated_by, updated_at)
VALUES ('세영', '안', 'abc@email.com', '010-1234-5678', 'pro', '2024-01-01', 1, '2024-08-18 01:26:25.503312', 1, '2024-08-18 01:26:25.503312');

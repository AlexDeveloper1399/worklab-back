CREATE TABLE account(
    id BIGSERIAL PRIMARY KEY,
    created_at TIMESTAMP WITHOUT TIME ZONE DEFAULT now() NOT NULL,
    updated_at TIMESTAMP WITHOUT TIME ZONE,
    login VARCHAR(255) UNIQUE,
    password VARCHAR(255),
    surname VARCHAR(255),
    name VARCHAR(255),
    date_of_birth DATE,
    phone VARCHAR(255),
    email VARCHAR(255)
);

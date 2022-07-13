CREATE TABLE fornecedor(
    id UUID PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    niver DATE,
    cnpj VARCHAR(14) UNIQUE
);

CREATE TABLE produto(
    id UUID PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    valor NUMERIC(10, 2) NOT NULL
);

CREATE TABLE fornecedor_produto(
    fornecedor_id UUID REFERENCES fornecedor(id),
    produto_id UUID REFERENCES produto(id),
    PRIMARY KEY (fornecedor_id, produto_id)
);

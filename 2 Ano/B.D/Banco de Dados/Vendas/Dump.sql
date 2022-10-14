CREATE TABLE Estado(
    codEstado INT NOT NULL PRIMARY KEY,
    nome VARCHAR(45) NULL
);

CREATE TABLE TipoCliente(
    codTipo INT NOT NULL PRIMARY KEY,
    nomeTipo VARCHAR(45)
);

CREATE TABLE Cliente(
    codCliente INT NOT NULL PRIMARY KEY,
    nome VARCHAR(100) NULL,
    email VARCHAR(100) NULL,
    telefone VARCHAR(45) NULL,
    cep VARCHAR(45) NULL,
    rua VARCHAR(45) NULL,
    numero INT NULL,
    complemento VARCHAR(45) NULL,
    cidade VARCHAR(45) NULL,
    codEstado INT NOT NULL,
    codTipo INT NOT NULL,
    FOREIGN KEY(codEstado) REFERENCES Estado(codEstado),
    FOREIGN KEY(codTipo) REFERENCES TipoCliente(codTipo)
);

CREATE TABLE Pedido(
    codPedido INT NOT NULL PRIMARY KEY,
    dataPedido DATE NULL,
    valor DECIMAL(22,7) NULL,
    codCliente INT NOT NULL,
    FOREIGN KEY(codCliente) REFERENCES Cliente(codCliente)
);

CREATE TABLE Categoria(
    codCategoria INT NOT NULL PRIMARY KEY,
    nome VARCHAR(100) NULL
);

CREATE TABLE Produto(
    codProduto INT NOT NULL PRIMARY KEY,
    nome VARCHAR(100) NULL,
    preco DECIMAL(22,7) NULL,
    codCategoria INT NOT NULL,
    FOREIGN KEY(codCategoria) REFERENCES Categoria(codCategoria)
);

CREATE TABLE Item(
    codItem INT NOT NULL PRIMARY KEY,
    quantidade INT NULL,
    valorUnitario DECIMAL(22,7) NULL,
    codPedido INT NOT NULL,
    codProduto INT NOT NULL,
    FOREIGN KEY(codProduto) REFERENCES Produto(codProduto),
    FOREIGN KEY(codPedido) REFERENCES Pedido(codPedido)
)
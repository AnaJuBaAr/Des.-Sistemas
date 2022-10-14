CREATE TABLE Cliente(
    codCompra INT NOT NULL PRIMARY KEY,
    nome VARCHAR(150) NULL,
    rg VARCHAR(25) NULL,
    cpf VARCHAR(25) NULL
);

CREATE TABLE Produtos(
    codProduto INT NOT NULL PRIMARY KEY,
    nome VARCHAR(150) NULL,
    preco DECIMAL(22,7)
);

CREATE TABLE Compra(
    codCompra INT NOT NULL PRIMARY KEY,
    valor DECIMAL(22,7) NULL,
    codCliente INT NOT NULL,
    FOREIGN KEY (codCliente) REFERENCES Cliente(codCliente)
);

CREATE TABLE Carrinho(
    codItem INT NOT NULL PRIMARY KEY,
    quantidade INT NULL,
    valorUnidade DECIMAL(22,7) NULL,
    codProduto INT NOT NULL,
    codCompra INT NOT NULL,
    FOREIGN KEY (codCompra) REFERENCES Compra(codCompra),
    FOREIGN KEY (codProduto) REFERENCES Produtos(codProduto)
);

CREATE TABLE Filiais(
    codFilial INT NOT NULL PRIMARY KEY,
    cidade VARCHAR(100) NULL,
    estado VARCHAR(50) NULL
);

CREATE TABLE Cargos(
    codCargo INT NOT NULL PRIMARY KEY,
    cargo VARCHAR(100) NULL
);

CREATE TABLE Funcionarios(
    codFuncionario INT NOT NULL PRIMARY KEY,
    nome VARCHAR(150) NULL,
    cpf INT NULL,
    rg VARCHAR(25) NULL,
    ctps INT NULL,
    contato INT NULL,
    codFilial INT NOT NULL,
    FOREIGN KEY (codFilial) REFERENCES Filiais(codFilial)
);

CREATE TABLE CargosOcupados(
    codFuncionario INT NOT NULL,
    codCargo INT NOT NULL,
    PRIMARY KEY(codFuncionario, codCargo),
    FOREIGN KEY (codFuncionario) REFERENCES Funcionarios(codFuncionario),
    FOREIGN KEY (codCargo) REFERENCES Cargos(codCargo)
);
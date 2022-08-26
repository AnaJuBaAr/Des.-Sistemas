CREATE TABLE Aluno
(
    idAluno INT NOT NULL PRIMARY KEY,
    nome VARCHAR(50),
    sobrenome VARCHAR(50),
    cidade VARCHAR(100)
);

CREATE TABLE Curso
(
    idCurso INT NOT NULL PRIMARY KEY,
    nome VARCHAR(50),
    sigla VARCHAR(5)
);

CREATE TABLE AlunoCurso
(
    idAluno INT NOT NULL,
    idCurso INT NOT NULL,
    valor DECIMAL(10,7),
    PRIMARY KEY(idAluno, idCurso),
    FOREIGN KEY(idAluno) REFERENCES Aluno(idAluno),
    FOREIGN KEY(idCurso) REFERENCES Curso(idCurso)
);

INSERT INTO Aluno(idAluno, nome, sobrenome, cidade) VALUES(1, 'Ana Júlia', 'Barros Araújo', 'Almenara');
INSERT INTO Curso(idCurso, nome, sigla) VALUES(1, 'Banco de Dados', 'BD');
INSERT INTO AlunoCurso(idAluno, idCurso, valor) VALUES(1, 1, 25.50);

INSERT INTO Aluno(idAluno, nome, sobrenome, cidade) VALUES(2, 'Marcos', 'Antunes', 'Santo Antonio do Jacinto');
INSERT INTO Curso(idCurso, nome, sigla) VALUES(2, 'Desenvolvimento de Sistemas', 'DS');
INSERT INTO AlunoCurso(idAluno, idCurso,valor) VALUES(2, 2, 25.50);

INSERT INTO Aluno(idAluno, nome, sobrenome, cidade) VALUES(3, 'Sanzio', 'Cardoso', 'Almenara');
INSERT INTO Curso(idCurso, nome, sigla) VALUES(3, 'Biologia', 'BI');
INSERT INTO AlunoCurso(idAluno, idCurso,valor) VALUES(3, 3, 25.50);

INSERT INTO Aluno(idAluno, nome, sobrenome, cidade) VALUES(4, 'José Paulo', 'Rodrigues', 'Jequitinhonha');
INSERT INTO Curso(idCurso, nome, sigla) VALUES(4, 'Algoritmos', 'AG');
INSERT INTO AlunoCurso(idAluno, idCurso, valor) VALUES(4, 4, 25.50);

INSERT INTO Aluno(idAluno, nome, sobrenome, cidade) VALUES(5, 'Larissa', 'Almeida', 'Jequitinhonha');
INSERT INTO Curso(idCurso, nome, sigla) VALUES(5, 'Banco de Dados', 'BD');
INSERT INTO AlunoCurso(idAluno, idCurso, valor) VALUES(5, 5, 25.50);

INSERT INTO Aluno(idAluno, nome, sobrenome, cidade) VALUES(6, 'Maria Eduarda', 'Reis', 'Rubim');
INSERT INTO Curso(idCurso, nome, sigla) VALUES(6, 'Artes', 'AR');
INSERT INTO AlunoCurso(idAluno, idCurso, valor) VALUES(6, 6, 25.50);

INSERT INTO Aluno(idAluno, nome, sobrenome, cidade) VALUES(7, 'Iane', 'Santos', 'Joaíma');
INSERT INTO Curso(idCurso, nome, sigla) VALUES(7, 'Português', 'PT');
INSERT INTO AlunoCurso(idAluno, idCurso, valor) VALUES(7, 7, 25.50);

INSERT INTO Aluno(idAluno, nome, sobrenome, cidade) VALUES(8, 'Bernardo', 'Morais', 'Almenara');
INSERT INTO Curso(idCurso, nome, sigla) VALUES(8, 'Filosofia', 'FL');
INSERT INTO AlunoCurso(idAluno, idCurso, valor) VALUES(8, 8, 25.50);

INSERT INTO Aluno(idAluno, nome, sobrenome, cidade) VALUES(9, 'Joana', 'Gonçalvez', 'Jequitinhonha');
INSERT INTO Curso(idCurso, nome, sigla) VALUES(9, 'Matemática', 'MT');
INSERT INTO AlunoCurso(idAluno, idCurso, valor) VALUES(9, 9, 25.50);

INSERT INTO Aluno(idAluno, nome, sobrenome, cidade) VALUES(10, 'Leonardo', 'Pinheiro', 'Almenara');
INSERT INTO Curso(idCurso, nome, sigla) VALUES(10, 'Desenvolvimento de Sistemas', 'DS');
INSERT INTO AlunoCurso(idAluno, idCurso, valor) VALUES(10, 10, 25.50);
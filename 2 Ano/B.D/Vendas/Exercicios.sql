/*QUESTÕES DA AULA DE 17 DE OUTUBRO DE 2022*/
/*QUESTÃO 01: Atualizar a tabela cliente alterando o cep de acordo com cada cidade.*/
UPDATE Cliente
SET cep = 07262130
WHERE cidade = 'Belo Horizonte';

UPDATE Cliente
SET cep = 20081000
WHERE cidade = 'Rio de Janeiro';

UPDATE Cliente
SET cep = 1311000
WHERE cidade = 'Sao Paulo';

/*QUESTÃO 02:*/
UPDATE Cliente
SET cidade = 'Sao Paulo'
WHERE codEstado = 27;

/*QUESTÃO 03: Atualize o código do estado da cidade de São Paulo da tabela cliente*/
UPDATE Cliente
SET codEstado = 25
WHERE cidade = 'Sao Paulo';

/*QUESTÃO 04: Altere o telefone de TODOS os clientes para o seu telefone*/
UPDATE Cliente
SET telefone = '33 988631799'



/*-------------------------------------------------------------------------------------------------------------------------------------------------------*/



/*QUESTÕES DA AULA DE 10 DE OUTUBRO DE 2022*/
/*MAX*/
SELECT c.nome, MAX(p.valor)
FROM Cliente c, Pedido p
WHERE c.codCliente = p.codCliente
GROUP BY c.nome;

/*MIN*/
SELECT c.nome, MIN(p.valor)
FROM Cliente c, Pedido p
WHERE c.codCliente = p.codCliente
GROUP BY c.nome;

/*SUM*/
SELECT c.nome, SUM(p.valor)
FROM Cliente c, Pedido p
WHERE c.codCliente = p.codCliente
GROUP BY c.nome;

/*AVG*/
SELECT c.nome, AVG(p.valor)
FROM Cliente c, Pedido p
WHERE c.codCliente = p.codCliente
GROUP BY c.nome;

/*COUNT*/
SELECT c.nome, COUNT(p.valor)
FROM Cliente c, Pedido p
WHERE c.codCliente = p.codCliente
GROUP BY c.nome;


/*-------------------------------------------------------------------------------------------------------------------------------------------------------*/


/*QUESTÕES DA AULA DE 30 DE SETEMBRO DE 2022*/
/*QUESTÃO 01: Recupere todos os clientes do estado de 'Minas Gerais' e que comece com a letra 'F'.*/
SELECT * FROM Cliente 
INNER JOIN Estado ON Cliente.codEstado = Estado.codEstado
WHERE Estado.nome = 'Minas Gerais';

/*QUESTÃO 02: Recupere todos os pedidos do cliente 'x', onde x é o nome de um cliente cadastrado na tabela CLIENTE*/
SELECT * FROM Pedido
INNER JOIN Cliente ON Pedido.codCliente = Cliente.codCliente
WHERE Cliente.nome = 'Aaron Nelson Lopes';

/*QUESTÃO 03: Mostre todos os clientes do tipo 'PRATA'.*/
SELECT * FROM Cliente
INNER JOIN TipoCliente ON Cliente.codTipo = TipoCliente.codTipo
WHERE TipoCliente.nomeTipo = 'PRATA';

/*QUESTÃO 04: Exibir o nome dos produtos da categoria 'Trainning' e que comece com quaisquer letras e termine com 'o'.*/
SELECT Produto.nome FROM Produto
INNER JOIN Categoria ON Produto.codCategoria = Categoria.codCategoria
WHERE Categoria.nome = 'Trainning' AND Produto.nome LIKE '%O';

/*QUESTÃO 05: Exibir o nome e valor do pedido dos clientes do estado de Minas Gerais.*/
SELECT Cliente.nome, Pedido.valor
FROM Cliente, Pedido, Estado
WHERE Cliente.codCliente = Pedido.codCliente
	AND Cliente.codEstado = Estado.codEstado
	AND Estado.nome = 'Minas Gerais';

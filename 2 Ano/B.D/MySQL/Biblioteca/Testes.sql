--Iner join
	SELECT l.titulo, a.nome
	FROM Livro l
	INNER JOIN Autor a ON a.idautor = l.Autor_idautor;

--Left join
	SELECT l.titulo, a.nome
	FROM Livro l
	LEFT JOIN Autor a ON a.idautor = l.Autor_idautor;

--Right join
	SELECT l.titulo, a.nome
	FROM Livro l
	RIGHT JOIN Autor a ON a.idautor = l.Autor_idautor;

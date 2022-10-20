/*
QUESTÃO 08:
  É um tipo especial de classe que não pode ser instanciada, somente herdada. Sendo assim, não possui objetos.
  A principal diferença entre os dois é que uma interface é considerada um contrato, tendo que ser assinado pelas classes. Além disso, uma classe
abstrata é herdada, enquanto uma interface é implementada.

QUESTÃO 09:
  Sim. Porém uma classe abstrata só é PURA quando não possui métodos concretos.
  
QUESTÃO 10:
  Sim. Não é obrigatório que uma classe abstrata tenha métodos abstratos.
  
QUESTÃO 11:
  Ela serve para que as classes filhas não precisem se preocupar com comportamentos padrões, somente com suas particularidades.

QUESTÃO 12:
  Construtores são, por padrão, métodos concretos, o que não é permitido em uma interface.
  
QUESTÃO 13:
  As classes abstratas são usadas de modelo para as classes filhas. Se um de seus métodos é privado, ele não pode ser acessado pelas subclasses, o que 
vai contra o propósito de sua criação.

QUESTÃO 15:
  Um jeito de fazer isso é transformar a classe Veiculo em abstrata, assim como o método calcularFrete, implementando assim o método calcularFrete em todas
as outras classes, acrescentando suas particularidades.
*/

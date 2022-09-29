# Cadastro-banco

Projeto para criar uma conta no banco, colocando as seguintes informações:

- O ID da conta.
- Nome completo (Caso mude de nome e sobrenome, podera ser mudado no futuro)
- Deposito inicial (Não é obrigatorio)
- A cada saque o banco recebe 5 reais.


## O que aprendi!

- Encapsulamento (getter e setter)

Foi utilizado encapsulamento nos membros Nome,ID e Saldo.
o ID foi o unico que não teve setter porque que ele não pode ser mudado pelo usuario.

- Sobrecarga

Como não é obrigatorio o deposito inicial, foi feito a verificação
com o if-then-else para saber si o usuario quer fazer o deposito inicial e para isso 
utilizei 2 construtores com os seguintes argumentos: 

	- O primeiro construtor tem como argumento o ID, Nome e o deposito inicial.
	- O segundo construto tem como argumento o ID e o Nome.

- Object toString()

Para evitar codigo repetido e converter os objetos para string.

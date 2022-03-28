CREATE DATABASE revisao;

use revisao;

create table correntista( 
ag int not null, 
conta int not null, 
nome varchar(50) not null, 
email varchar(80) not null, 
telefone char(11) not null, 
saldo decimal(8,2) not null, 
primary key (ag,conta));

INSERT INTO 
correntista(ag,conta,nome,email,telefone,saldo)
VALUES
(4444, 987654, "Filipe Luiz", "ffilipeluiz@gmail.com", "99876453", 500),
(3333, 777777, "Ana Eliza", "anaEliza@gmail.com", "8943333", 1230);

Select * from correntista;

create table fluxo_caixa( 
ag int not null, 
conta int not null, 
fluxo int not null, 
entrada decimal(8,2) not null, 
saida decimal(8,2) not null, 
primary key(ag,conta,fluxo));

Select * from fluxo_caixa;

INSERT INTO 
fluxo_caixa(ag,conta,fluxo,entrada,saida)
VALUES
(4444, 987654, 1, 19, 21),
(4444, 987654, 2, 20.30, 22.00),
(3333, 777777, 4, 18.30, 21.00);

Select c.nome, c.saldo, f.entrada, f.saida from correntista as c
inner join fluxo_caixa as f 
on c.ag = f.ag

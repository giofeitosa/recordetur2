CREATE DATABASE IF NOT EXISTS recordetur;
use recordetur;

CREATE TABLE `cliente` (
  `id_cliente` int NOT NULL AUTO_INCREMENT,
  `cpf` varchar(45) DEFAULT NULL,
  `nome_cliente` varchar(45) DEFAULT NULL,
  `email_cliente` varchar(45) DEFAULT NULL,
  `telefone_cliente` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `viagem` (
  `id_viagem` int NOT NULL AUTO_INCREMENT,
  `destino` varchar(45) DEFAULT NULL,
  `descricao` varchar(45) NOT NULL,
  `preco` double NOT NULL,
  PRIMARY KEY (`id_viagem`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `reserva` (
  `id_reserva` int NOT NULL AUTO_INCREMENT,
  `data_reserva` varchar(20) DEFAULT NULL,
  `valor_reserva` double DEFAULT NULL,
  `id_cliente` int DEFAULT NULL,
  `id_viagem` int DEFAULT NULL,
  PRIMARY KEY (`id_reserva`),
  KEY `FK_viagem` (`id_viagem`),
  KEY `FK_cliente` (`id_cliente`),
  CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`),
  CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`id_viagem`) REFERENCES `viagem` (`id_viagem`),
  CONSTRAINT `reserva_ibfk_3` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE VIEW cliente_viagem AS SELECT R.id_reserva, r.data_reserva, R.valor_reserva, c.*, v.*
 FROM reserva r, cliente c, viagem v
WHERE r.id_cliente = c.id_cliente AND r.id_viagem = v.id_viagem;

select * from cliente_viagem;

select * from contato;

select * from cliente;









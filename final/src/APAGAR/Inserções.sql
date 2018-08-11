INSERT INTO `tenis`.`endereco` (`id`, `rua`, `numero`, `bairro`) VALUES ('0', 'av 12', '45', 'Santos');
INSERT INTO `tenis`.`recepcionista` (`cpf`, `nome`, `telefone`, `email`, `usuario`, `senha`, `endereco_id`) VALUES ('0123123', 'Juh', '120112345', '@yahoo', '1234', '1234', '0');
INSERT INTO `tenis`.`endereco` (`id`, `rua`, `numero`, `bairro`) VALUES ('1', 'av 25', '56', 'Carmelo');
INSERT INTO `tenis`.`professor` (`siap`, `cpf`, `nome`, `telefone`, `email`, `endereco_id`) VALUES ('123456', '78421321', 'nuzia', '9658965', '@hoaoo', '1');
INSERT INTO `tenis`.`professor` (`siap`, `cpf`, `nome`, `telefone`, `email`, `endereco_id`) VALUES ('124', '56879854', 'marco', '21975642', '@ihio', '0');
INSERT INTO `tenis`.`turma` (`idturma`) VALUES ('0');
INSERT INTO `tenis`.`turma` (`idturma`) VALUES ('1');
INSERT INTO `tenis`.`turma` (`idturma`) VALUES ('2');
UPDATE `tenis`.`professor` SET `siap`='123' WHERE `siap`='123456';
INSERT INTO `tenis`.`aula` (`idaulas`, `codigosala`, `duracao`, `professor_siap`, `turma_idturma`) VALUES ('0', '58', '2', '123', '0');
INSERT INTO `tenis`.`aula` (`idaulas`, `codigosala`, `duracao`, `professor_siap`, `turma_idturma`) VALUES ('1', '56', '3', '124', '1');
ALTER TABLE aula ADD horario varchar(10);
truncate table aula;
INSERT INTO `tenis`.`aula` (`idaulas`, `codigosala`, `duracao`, `professor_siap`, `turma_idturma`, `horario`) VALUES ('0', '56', '2', '123', '0', 'tarde');
INSERT INTO `tenis`.`aula` (`idaulas`, `codigosala`, `duracao`, `professor_siap`, `turma_idturma`, `horario`) VALUES ('1', '57', '5', '124', '1', 'manha');


ALTER TABLE aula
DROP COLUMN horario;
ALTER TABLE aula
ADD COLUMN horario date;
UPDATE `tenis`.`aula` SET `horario`='2008-07-05' WHERE `idaulas`='0';
UPDATE `tenis`.`aula` SET `horario`='2008-07-06' WHERE `idaulas`='1';

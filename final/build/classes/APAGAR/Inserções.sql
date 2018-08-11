INSERT INTO `tenis`.`endereco` (`id`, `rua`, `numero`, `bairro`) VALUES ('0', 'av 12', '45', 'Santos');
INSERT INTO `tenis`.`recepcionista` (`cpf`, `nome`, `telefone`, `email`, `usuario`, `senha`, `endereco_id`) VALUES ('0123123', 'Juh', '120112345', '@yahoo', '1234', '1234', '1');
INSERT INTO `tenis`.`endereco` (`rua`, `numero`, `bairro`) VALUES ('av 25', '56', 'Carmelo');
INSERT INTO `tenis`.`professor` (`siap`, `cpf`, `nome`, `telefone`, `email`, `endereco_id`) VALUES ('123456', '78421321', 'nuzia', '9658965', '@hoaoo', '1');
INSERT INTO `tenis`.`professor` (`siap`, `cpf`, `nome`, `telefone`, `email`, `endereco_id`) VALUES ('124', '56879854', 'marco', '21975642', '@ihio', '2');
INSERT INTO `tenis`.`turma` (`idturma`) VALUES ('1');
INSERT INTO `tenis`.`turma` (`idturma`) VALUES ('2');
select * from aula;
INSERT INTO `tenis`.`aula` (`codigosala`, `duracao`, `professor_siap`, `turma_idturma`, horario) VALUES ('56', '3', '124', '1','1998-10-15');


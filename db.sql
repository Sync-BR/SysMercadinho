CREATE SCHEMA `sysmercadinho` ;

CREATE TABLE `sysmercadinho`.`contato` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(100) NOT NULL,
  `mensagem` VARCHAR(260) NOT NULL,
  `date` VARCHAR(9) NOT NULL,
  PRIMARY KEY (`id`, `email`));

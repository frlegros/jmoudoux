CREATE SCHEMA `java_trainning` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;

CREATE TABLE `java_trainning`.`personnes` (
  `id` INT NULL,
  `prenom` VARCHAR(50) NOT NULL,
  `nom` VARCHAR(50) NOT NULL,
  `datenaissance` DATETIME NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `idpersonne_UNIQUE` (`id` ASC));

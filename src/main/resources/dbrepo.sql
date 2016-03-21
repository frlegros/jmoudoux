CREATE TABLE `java_training`.`personnes` (
  `id` INT NULL,
  `prenom` VARCHAR(50) NOT NULL,
  `nom` VARCHAR(50) NOT NULL,
  `datenaissance` DATETIME NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `idpersonne_UNIQUE` (`id` ASC));

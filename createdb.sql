CREATE DATABASE `inventario_libros` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE inventario_libros;

CREATE TABLE `libros` (
  `ISBN` varchar(45) NOT NULL,
  `Edicion` int NOT NULL,
  `FechaPublicacion` int NOT NULL,
  `Titulo` varchar(45) NOT NULL,
  `NombreAutor` varchar(45) NOT NULL,
  `PrimerApellidoAutor` varchar(45) DEFAULT NULL,
  `SegundoApellidoAutor` varchar(45) DEFAULT NULL,
  `Paginas` int NOT NULL,
  `Categoria` varchar(45) NOT NULL,
  `Editorial` varchar(45) NOT NULL,
  PRIMARY KEY (`ISBN`,`Edicion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
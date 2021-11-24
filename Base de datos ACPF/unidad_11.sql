-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-11-2021 a las 22:42:20
-- Versión del servidor: 10.4.17-MariaDB
-- Versión de PHP: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `unidad_11`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `codoacodo`
--

CREATE TABLE `codoacodo` (
  `id` int(11) NOT NULL,
  `nombre` varchar(40) CHARACTER SET latin1 NOT NULL,
  `apellido` varchar(40) CHARACTER SET latin1 NOT NULL,
  `edad` tinyint(2) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `provincia` varchar(30) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `codoacodo`
--

INSERT INTO `codoacodo` (`id`, `nombre`, `apellido`, `edad`, `fecha`, `provincia`) VALUES
(123456, 'Ana', 'Suarez', 25, '2021-11-23 12:21:12', 'Santa Fe'),
(123457, 'Carlos', 'Perez', 24, '2021-11-23 12:21:12', 'Salta'),
(123856, 'Maria', 'Hernandez', 31, '2021-11-23 12:21:12', 'Cordoba'),
(123956, 'Pedro', 'Lopez', 21, '2021-11-23 12:21:12', 'Mendoza'),
(124456, 'Jose', 'Rios', 35, '2021-11-23 12:23:38', 'Rio Negro');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `codoacodo`
--
ALTER TABLE `codoacodo`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `codoacodo`
--
ALTER TABLE `codoacodo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=124457;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

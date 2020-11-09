-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-11-2020 a las 05:00:33
-- Versión del servidor: 10.4.8-MariaDB
-- Versión de PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `prueba_nexos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `family_information`
--

CREATE TABLE `family_information` (
  `id` bigint(20) NOT NULL,
  `person_id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `identification_number` varchar(10) NOT NULL,
  `relationship` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `family_information`
--

INSERT INTO `family_information` (`id`, `person_id`, `name`, `last_name`, `identification_number`, `relationship`) VALUES
(1, 8, 'jairo', 'velasquez', '79468874', 'padre'),
(2, 1, 'mary', 'eligio', '79468654', 'madre');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `person`
--

CREATE TABLE `person` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `identification_number` varchar(10) NOT NULL,
  `gender` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `person`
--

INSERT INTO `person` (`id`, `name`, `last_name`, `identification_number`, `gender`) VALUES
(1, 'Andrey', 'velasquez', '1013595992', 'masculino'),
(6, 'miguel', 'rojas', '1016826886', 'masculino'),
(8, 'jhon', 'tellez', '146589632', 'masculino');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `family_information`
--
ALTER TABLE `family_information`
  ADD PRIMARY KEY (`id`),
  ADD KEY `person_id` (`person_id`);

--
-- Indices de la tabla `person`
--
ALTER TABLE `person`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `family_information`
--
ALTER TABLE `family_information`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `person`
--
ALTER TABLE `person`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `family_information`
--
ALTER TABLE `family_information`
  ADD CONSTRAINT `family_information_ibfk_1` FOREIGN KEY (`person_id`) REFERENCES `person` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

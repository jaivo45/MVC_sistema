-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-11-2016 a las 15:14:12
-- Versión del servidor: 10.1.13-MariaDB
-- Versión de PHP: 5.6.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistema`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `id_cliente` int(11) NOT NULL,
  `nombre` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `ap_pat` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `ap_mat` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `telefon` int(10) NOT NULL,
  `email` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `RFC` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `calle` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `numero` int(30) NOT NULL,
  `colonia` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `ciudad` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `estancia` varchar(30) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id_producto` int(11) NOT NULL,
  `producto` varchar(16) COLLATE utf8_spanish_ci NOT NULL,
  `descripcion` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `precio_compra` int(10) NOT NULL,
  `precio_venta` int(10) NOT NULL,
  `existencia` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id_producto`, `producto`, `descripcion`, `precio_compra`, `precio_venta`, `existencia`) VALUES
(73, 'sala', 'piel', 4000, 5000, 8),
(74, 'silla', 'madera', 150, 200, 4),
(75, 'mesa', 'chica', 400, 500, 23),
(76, 'sala ', 'Sintetico', 4000, 5000, 3),
(77, 'sala', 'piel', 4000, 5000, 3),
(78, 'sala ssssss', 'piel', 4000, 5000, 2),
(79, 'ropero', 'madera varnisada', 4000, 5500, 2),
(80, 'espejo', '80*50', 100, 180, 3),
(81, 'Mesa', 'Madera madera madera', 12000, 14450, 3),
(82, 'escritorio', 'madera ocote', 1500, 2000, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `provedores`
--

CREATE TABLE `provedores` (
  `id_provedor` int(11) NOT NULL,
  `nombre` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `ap_pat` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `ap_mat` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `RFC` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `calle` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `numero_colonia` int(5) NOT NULL,
  `colonia` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `ciudad` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `estado` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `nombre_contacto` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `telefon` int(10) NOT NULL,
  `email` varchar(45) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id_producto`);

--
-- Indices de la tabla `provedores`
--
ALTER TABLE `provedores`
  ADD PRIMARY KEY (`id_provedor`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=83;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

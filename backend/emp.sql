-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jul 12, 2024 at 03:12 AM
-- Server version: 8.0.29
-- PHP Version: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `emp`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `adminid` bigint NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(255) DEFAULT NULL,
  `admin_password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`adminid`)
);

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`adminid`, `admin_name`, `admin_password`) VALUES
(1, 'Ikatlo Hokage', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `employees_table`
--

DROP TABLE IF EXISTS `employees_table`;
CREATE TABLE IF NOT EXISTS `employees_table` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `dep` varchar(255) DEFAULT NULL,
  `des` varchar(255) DEFAULT NULL,
  `mail` varchar(255) DEFAULT NULL,
  `f_name` varchar(255) DEFAULT NULL,
  `jd` date DEFAULT NULL,
  `l_name` varchar(255) DEFAULT NULL,
  `sal` bigint DEFAULT NULL,
  PRIMARY KEY (`id`)
);

--
-- Dumping data for table `employees_table`
--

INSERT INTO `employees_table` (`id`, `dep`, `des`, `mail`, `f_name`, `jd`, `l_name`, `sal`) VALUES
(1, NULL, NULL, NULL, 'Ikatlo', NULL, 'Hokage', 0),
(2, 'IT', 'Analyst', 'sofia@gmail.com', 'Sofia', '2024-05-09', 'Baron', 250000),
(4, NULL, NULL, NULL, 'Jenna mae', NULL, 'lopez', 0),
(5, NULL, NULL, NULL, 'Vivien', NULL, 'Nombre', 250000),
(6, 'IT', 'Developer', 'Angeles@gmail.com', 'nelwyn', '2024-05-13', 'Angeles', 250000),
(7, 'IT', NULL, NULL, 'RICARLO VELASQUEZ', NULL, 'CADAVOS', 2500000),
(8, 'IT', 'Manager', 'navy@gmail.com', 'JESS REC GRAFIL', '2024-07-06', 'VARGAS', 250000),
(9, NULL, NULL, NULL, 'Mary flor', NULL, 'PRIETO', 0),
(10, NULL, NULL, NULL, 'Mark anthony', NULL, 'Gomez', 0),
(12, 'IT', 'Manager', 'Lubert@gmail.com', ' LUBERT DE CASTRO', '2024-07-11', 'JUNTILLA', 250000);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

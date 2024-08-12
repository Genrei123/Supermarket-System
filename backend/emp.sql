-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 12, 2024 at 05:30 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

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

CREATE TABLE `admin` (
  `adminid` bigint(20) NOT NULL,
  `admin_name` varchar(255) DEFAULT NULL,
  `admin_password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `cart_model`
--

CREATE TABLE `cart_model` (
  `cart_id` int(11) NOT NULL,
  `product_id` bigint(20) DEFAULT NULL,
  `user_user_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `cart_model_seq`
--

CREATE TABLE `cart_model_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `cart_model_seq`
--

INSERT INTO `cart_model_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `employees_table`
--

CREATE TABLE `employees_table` (
  `id` bigint(20) NOT NULL,
  `dep` varchar(255) DEFAULT NULL,
  `des` varchar(255) DEFAULT NULL,
  `mail` varchar(255) DEFAULT NULL,
  `f_name` varchar(255) DEFAULT NULL,
  `jd` date DEFAULT NULL,
  `l_name` varchar(255) DEFAULT NULL,
  `sal` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE `items` (
  `id` bigint(20) NOT NULL,
  `title` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `price` float NOT NULL,
  `quantity` int(11) NOT NULL,
  `image` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`id`, `title`, `description`, `price`, `quantity`, `image`) VALUES
(16, 'Screwdriver', NULL, 500, 10, 'https://images.unsplash.com/photo-1606676539940-12768ce0e762?q=80&w=1887&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D'),
(17, 'Screwdriver', NULL, 500, 100, 'https://plus.unsplash.com/premium_photo-1661632931970-6562d6ba5acf?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D');

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `role_name` varchar(255) NOT NULL,
  `role_description` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`role_name`, `role_description`) VALUES
('Admin', 'Admin role'),
('User', 'Default role for newly created record');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_name` varchar(255) NOT NULL,
  `user_first_name` varchar(255) DEFAULT NULL,
  `user_last_name` varchar(255) DEFAULT NULL,
  `user_password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_name`, `user_first_name`, `user_last_name`, `user_password`) VALUES
('123', NULL, NULL, '$2a$10$rpUBVfWjmhl4IqeHZlW/uuHkc4UVMeR.K7tCnKF6T3xAAVTznnFYK'),
('12asdasda', NULL, NULL, '$2a$10$kqy.jg97dHfR9CRACj6LK.FuS5YNuZJsh0uc4MrLikd5Un7uVLVhK'),
('admin', 'admin', 'admin', 'admin'),
('admin123', 'admin', 'admin', '$2a$10$fiWzhMKpcWwnXO2V/WVVIu8QEFnrXBh9vak1eyZlZkvsf/1fwkwsm'),
('asdasdsad', NULL, NULL, '$2a$10$iyGIFb0CxYKnUzoaqU.uk.NHfovbpEcp/FISrGZE4mtGqFqOzbrAO'),
('genrey', NULL, NULL, '$2a$10$Lwp6aROGvm37uc7HLMDpQ.DPQmXKDKG/SbO9Ypnqzvb0W2IqsaflK');

-- --------------------------------------------------------

--
-- Table structure for table `user_role`
--

CREATE TABLE `user_role` (
  `user_id` varchar(255) NOT NULL,
  `role_id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user_role`
--

INSERT INTO `user_role` (`user_id`, `role_id`) VALUES
('123', 'User'),
('12asdasda', 'User'),
('admin', 'Admin'),
('admin123', 'Admin'),
('asdasdsad', 'User'),
('genrey', 'User');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`adminid`);

--
-- Indexes for table `cart_model`
--
ALTER TABLE `cart_model`
  ADD PRIMARY KEY (`cart_id`),
  ADD UNIQUE KEY `UK_25dx9wx83webtcypptshe7cjh` (`product_id`),
  ADD UNIQUE KEY `UK_m19myx1vy0qj8ldn1csxgt5e0` (`user_user_name`);

--
-- Indexes for table `employees_table`
--
ALTER TABLE `employees_table`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `items`
--
ALTER TABLE `items`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`role_name`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_name`);

--
-- Indexes for table `user_role`
--
ALTER TABLE `user_role`
  ADD PRIMARY KEY (`user_id`,`role_id`),
  ADD KEY `FKa68196081fvovjhkek5m97n3y` (`role_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `adminid` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `employees_table`
--
ALTER TABLE `employees_table`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `items`
--
ALTER TABLE `items`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cart_model`
--
ALTER TABLE `cart_model`
  ADD CONSTRAINT `FK2wgqtw30g9kpdb1wa0509fpqj` FOREIGN KEY (`user_user_name`) REFERENCES `user` (`user_name`),
  ADD CONSTRAINT `FKrig4lsxiqu9m1msvbphl7ioac` FOREIGN KEY (`product_id`) REFERENCES `items` (`id`);

--
-- Constraints for table `user_role`
--
ALTER TABLE `user_role`
  ADD CONSTRAINT `FK859n2jvi8ivhui0rl0esws6o` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_name`),
  ADD CONSTRAINT `FKa68196081fvovjhkek5m97n3y` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_name`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

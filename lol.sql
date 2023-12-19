-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Dec 19, 2023 at 08:54 AM
-- Server version: 8.2.0
-- PHP Version: 8.2.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lol`
--

-- --------------------------------------------------------

--
-- Table structure for table `costume_line`
--

DROP TABLE IF EXISTS `costume_line`;
CREATE TABLE IF NOT EXISTS `costume_line` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `create_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `date_buy` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `costume_line`
--

INSERT INTO `costume_line` (`id`, `name`, `create_at`, `date_buy`) VALUES
(1, 'PROJECT', '2023-12-19 15:52:51', '2023-12-19'),
(2, 'Arcade', '2023-12-19 15:52:51', '2023-12-19'),
(3, 'Star Guardian', '2023-12-19 15:52:51', '2023-12-19'),
(4, 'Spirit Blossom', '2023-12-19 15:52:51', '2023-12-19'),
(5, 'High Noon', '2023-12-19 15:52:51', '2023-12-19');

-- --------------------------------------------------------

--
-- Table structure for table `figure`
--

DROP TABLE IF EXISTS `figure`;
CREATE TABLE IF NOT EXISTS `figure` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `combo_skill` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `figure`
--

INSERT INTO `figure` (`id`, `name`, `combo_skill`) VALUES
(1, 'Miss Fortune', 'Make It Rain'),
(2, 'Ahri', 'Spirit Rush'),
(3, 'Ashe', 'Enchanted Crystal Arrow'),
(4, 'Soroka', 'Wish'),
(5, 'Ezreal', 'Trueshot Barrage');

-- --------------------------------------------------------

--
-- Table structure for table `skin`
--

DROP TABLE IF EXISTS `skin`;
CREATE TABLE IF NOT EXISTS `skin` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `limited` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `skin`
--

INSERT INTO `skin` (`id`, `name`, `price`, `limited`) VALUES
(1, 'Arcade Miss Fortune', NULL, 'Limited'),
(2, 'Spirit Blossom Ahri', 1350, 'Non-Limited'),
(3, 'PROJECT: Ashe', 1820, 'Non-Limited'),
(4, 'Star Guardian Soraka', 1350, 'Non-Limited'),
(5, 'Pulsefire Ezreal', 3250, 'Non-Limited');

-- --------------------------------------------------------

--
-- Table structure for table `type`
--

DROP TABLE IF EXISTS `type`;
CREATE TABLE IF NOT EXISTS `type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `color` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `type`
--

INSERT INTO `type` (`id`, `name`, `color`) VALUES
(1, 'Uncommon', 'Green'),
(2, 'Rare', 'Blue'),
(3, 'Epic', 'Purple'),
(4, 'Legendary', 'Orange'),
(5, 'Mythic', 'Red');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

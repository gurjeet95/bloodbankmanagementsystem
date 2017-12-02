-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Dec 02, 2017 at 07:49 AM
-- Server version: 5.6.34-log
-- PHP Version: 7.1.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bloodbank`
--

-- --------------------------------------------------------

--
-- Table structure for table `bloodavailable`
--

CREATE TABLE `bloodavailable` (
  `A+` int(10) NOT NULL,
  `B+` int(10) NOT NULL,
  `O+` int(10) NOT NULL,
  `AB+` int(10) NOT NULL,
  `A-` int(10) NOT NULL,
  `B-` int(10) NOT NULL,
  `O-` int(10) NOT NULL,
  `AB-` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bloodavailable`
--

INSERT INTO `bloodavailable` (`A+`, `B+`, `O+`, `AB+`, `A-`, `B-`, `O-`, `AB-`) VALUES
(2, 0, 2, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `donationdetails`
--

CREATE TABLE `donationdetails` (
  `donor_id` varchar(20) NOT NULL,
  `quantity` int(10) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `donationdetails`
--

INSERT INTO `donationdetails` (`donor_id`, `quantity`, `date`) VALUES
('101', 2, '2017-12-01'),
('102', 2, '2017-12-01'),
('103', 2, '2017-12-01');

-- --------------------------------------------------------

--
-- Table structure for table `donorinformation`
--

CREATE TABLE `donorinformation` (
  `donor_id` int(20) NOT NULL,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `age` int(5) NOT NULL,
  `blood_group` varchar(20) NOT NULL,
  `phoneno` varchar(20) NOT NULL,
  `address` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `donorinformation`
--

INSERT INTO `donorinformation` (`donor_id`, `first_name`, `last_name`, `gender`, `age`, `blood_group`, `phoneno`, `address`) VALUES
(101, 'rajveer', 'kaur', 'Male', 23, 'A+', '7788289211', '88 ave, surrey'),
(102, 'navjot', 'singh', 'Male', 24, 'O+', '7883455653', 'knight st'),
(103, 'gurjeet', 'singh', 'Male', 24, 'A+', '7783028501', '88 ave, surrey');

-- --------------------------------------------------------

--
-- Table structure for table `employeelogin`
--

CREATE TABLE `employeelogin` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employeelogin`
--

INSERT INTO `employeelogin` (`username`, `password`) VALUES
('E1200', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `hospitalbloodavailable`
--

CREATE TABLE `hospitalbloodavailable` (
  `hospital_name` varchar(20) NOT NULL,
  `A+` int(10) NOT NULL,
  `B+` int(10) NOT NULL,
  `O+` int(10) NOT NULL,
  `AB+` int(10) NOT NULL,
  `A-` int(10) NOT NULL,
  `B-` int(10) NOT NULL,
  `O-` int(10) NOT NULL,
  `AB-` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hospitalbloodavailable`
--

INSERT INTO `hospitalbloodavailable` (`hospital_name`, `A+`, `B+`, `O+`, `AB+`, `A-`, `B-`, `O-`, `AB-`) VALUES
('surrey hospital', 2, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `hospitalinformation`
--

CREATE TABLE `hospitalinformation` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `hospital_name` varchar(30) NOT NULL,
  `address` varchar(150) NOT NULL,
  `phone_no` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hospitalinformation`
--

INSERT INTO `hospitalinformation` (`username`, `password`, `hospital_name`, `address`, `phone_no`) VALUES
('surrey', '12345', 'surrey hospital', '88 ave,surrey', '7765432106');

-- --------------------------------------------------------

--
-- Table structure for table `hospitalorder`
--

CREATE TABLE `hospitalorder` (
  `order_id` int(5) NOT NULL,
  `date` date NOT NULL,
  `hospital_name` varchar(30) NOT NULL,
  `blood_type` varchar(10) NOT NULL,
  `quantity` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hospitalorder`
--

INSERT INTO `hospitalorder` (`order_id`, `date`, `hospital_name`, `blood_type`, `quantity`) VALUES
(101, '2017-12-01', 'surrey hospital', 'A-', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `donorinformation`
--
ALTER TABLE `donorinformation`
  ADD PRIMARY KEY (`donor_id`),
  ADD UNIQUE KEY `donor_id` (`donor_id`);

--
-- Indexes for table `employeelogin`
--
ALTER TABLE `employeelogin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `hospitalinformation`
--
ALTER TABLE `hospitalinformation`
  ADD PRIMARY KEY (`username`,`hospital_name`);

--
-- Indexes for table `hospitalorder`
--
ALTER TABLE `hospitalorder`
  ADD PRIMARY KEY (`order_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

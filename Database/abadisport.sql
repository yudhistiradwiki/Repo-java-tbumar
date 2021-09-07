-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Aug 22, 2017 at 12:31 PM
-- Server version: 5.5.16
-- PHP Version: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `abadisport`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbbeli`
--

CREATE TABLE IF NOT EXISTS `tbbeli` (
  `notrans` varchar(8) NOT NULL,
  `tgl` date NOT NULL,
  `nmsupplier` varchar(20) NOT NULL,
  `kdbrng` varchar(8) NOT NULL,
  `nmbrng` varchar(40) NOT NULL,
  `hbeli` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `subtotal` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbbeli`
--

INSERT INTO `tbbeli` (`notrans`, `tgl`, `nmsupplier`, `kdbrng`, `nmbrng`, `hbeli`, `jumlah`, `subtotal`, `total`) VALUES
('P001', '2017-07-24', 'nike inc', 'B001', 'Nike Air Zoom Pegasus 33 iD', 500, 40, 20000, 24000),
('P001', '2017-07-24', 'nike inc', 'B002', 'Nike Jordan Eclipse Chukka', 100, 40, 4000, 24000),
('P002', '2017-07-24', 'nike inc', 'B003', 'Nike Jordan Formula 23', 100, 40, 4000, 11600),
('P002', '2017-07-24', 'nike inc', 'B004', 'Nike Free Run 2 iD', 110, 40, 4400, 11600),
('P002', '2017-07-24', 'nike inc', 'B005', 'Nike Mercurial Victory VI SG', 80, 40, 3200, 11600),
('P003', '2017-07-25', 'nn', 'B006', 'Adidas Lucas Puig', 800, 6, 4800, 4800),
('P004', '2017-08-19', 'Malda Karawaang', 'B006', 'Bola Voley', 150, 40, 6000, 6000);

--
-- Triggers `tbbeli`
--
DROP TRIGGER IF EXISTS `beli_barang`;
DELIMITER //
CREATE TRIGGER `beli_barang` AFTER INSERT ON `tbbeli`
 FOR EACH ROW BEGIN
UPDATE tbbrng 
SET stock = stock + NEW.jumlah
WHERE
 kdbrng = NEW.kdbrng;
 END
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `tbbrng`
--

CREATE TABLE IF NOT EXISTS `tbbrng` (
  `kdbrng` varchar(8) NOT NULL,
  `nmbrng` varchar(40) NOT NULL,
  `jenis` varchar(10) DEFAULT NULL,
  `hjual` int(11) DEFAULT NULL,
  `stock` int(11) NOT NULL,
  PRIMARY KEY (`kdbrng`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbbrng`
--

INSERT INTO `tbbrng` (`kdbrng`, `nmbrng`, `jenis`, `hjual`, `stock`) VALUES
('B001', 'Nike Air Zoom Pegasus 33 iD', 'Sepatu', 600, 37),
('B002', 'Nike Jordan Eclipse Chukka', 'Sepatu', 130, 39),
('B003', 'Nike Jordan Formula 23', 'Sepatu', 120, 38),
('B004', 'Nike Free Run 2 iD', 'Sepatu', 130, 40),
('B005', 'Nike Mercurial Victory VI SG', 'Sepatu', 100, 40),
('B006', 'Sepatu Futsal', 'Sepatu', 20, 0);

-- --------------------------------------------------------

--
-- Table structure for table `tbjual`
--

CREATE TABLE IF NOT EXISTS `tbjual` (
  `notrans` varchar(8) NOT NULL,
  `tgl` date NOT NULL,
  `pembeli` varchar(20) NOT NULL,
  `kdbrng` varchar(8) NOT NULL,
  `nmbrng` varchar(40) NOT NULL,
  `harga` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `subtotal` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `ubay` int(11) NOT NULL,
  `ukem` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbjual`
--

INSERT INTO `tbjual` (`notrans`, `tgl`, `pembeli`, `kdbrng`, `nmbrng`, `harga`, `jumlah`, `subtotal`, `total`, `ubay`, `ukem`) VALUES
('S001', '2017-07-24', 'Kuyhaa', 'B001', 'Nike Air Zoom Pegasus 33 iD', 600, 2, 1200, 1330, 2000, 670),
('S001', '2017-07-24', 'Kuyhaa', 'B002', 'Nike Jordan Eclipse Chukka', 130, 1, 130, 1330, 2000, 670),
('S002', '2017-08-19', 'sinta', 'B003', 'Nike Jordan Formula 23', 120, 2, 240, 840, 900, 60),
('S002', '2017-08-19', 'sinta', 'B001', 'Nike Air Zoom Pegasus 33 iD', 600, 1, 600, 840, 900, 60);

--
-- Triggers `tbjual`
--
DROP TRIGGER IF EXISTS `jual_barang`;
DELIMITER //
CREATE TRIGGER `jual_barang` AFTER INSERT ON `tbjual`
 FOR EACH ROW BEGIN
 UPDATE tbbrng
 SET stock = stock - NEW.jumlah
 WHERE
 kdbrng = NEW.kdbrng;
 END
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `tbjurnal`
--

CREATE TABLE IF NOT EXISTS `tbjurnal` (
  `nojur` varchar(8) NOT NULL,
  `notrans` varchar(8) NOT NULL,
  `tgl` date NOT NULL,
  `kdakun` varchar(8) NOT NULL,
  `nmakun` varchar(20) NOT NULL,
  `debet` int(11) NOT NULL,
  `kredit` int(11) NOT NULL,
  `ket` text NOT NULL,
  PRIMARY KEY (`nojur`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tbsupplier`
--

CREATE TABLE IF NOT EXISTS `tbsupplier` (
  `kdsupplier` varchar(8) NOT NULL,
  `nmsupplier` varchar(20) NOT NULL,
  `alamat` text NOT NULL,
  `telp` varchar(15) NOT NULL,
  PRIMARY KEY (`kdsupplier`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbsupplier`
--

INSERT INTO `tbsupplier` (`kdsupplier`, `nmsupplier`, `alamat`, `telp`) VALUES
('S001', 'Nike Indonesia', 'Indonesia', '085715699775'),
('S002', 'Microsoft Indonesia', 'Indonesia', '089630158851'),
('S003', 'Samsung Indonesia', 'Indonesia', '088214244402');

-- --------------------------------------------------------

--
-- Table structure for table `tbuser`
--

CREATE TABLE IF NOT EXISTS `tbuser` (
  `noid` varchar(10) NOT NULL,
  `username` varchar(30) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `password` varchar(10) NOT NULL,
  `hakakses` enum('Pemilik','Kasir','Persediaan') NOT NULL,
  PRIMARY KEY (`noid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbuser`
--

INSERT INTO `tbuser` (`noid`, `username`, `nama`, `password`, `hakakses`) VALUES
('U001', 'ep', 'Eka  Pratama', 'ep', 'Pemilik'),
('U002', 'bepe', 'bambang pamungkas', 'bepe', 'Kasir'),
('U003', 'boci', 'boaz solosa', 'boci', 'Persediaan'),
('U004', 'dd11', 'didier drogba', 'dd11', 'Kasir'),
('U005', 'jt26', 'john terry', 'jt26', 'Persediaan'),
('U006', 'root', 'root', 'root', 'Kasir');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

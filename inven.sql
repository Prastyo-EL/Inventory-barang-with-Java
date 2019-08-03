-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jul 31, 2019 at 03:56 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventory`
--

-- --------------------------------------------------------

--
-- Table structure for table `tmbarang`
--

CREATE TABLE `tmbarang` (
  `id` int(11) NOT NULL,
  `kode` varchar(10) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `id_kategori` int(11) NOT NULL,
  `satuan` varchar(20) NOT NULL,
  `stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tmbarang`
--

INSERT INTO `tmbarang` (`id`, `kode`, `nama`, `id_kategori`, `satuan`, `stok`) VALUES
(1, 'A-001', 'Laptop', 1, 'buah', 12);

-- --------------------------------------------------------

--
-- Table structure for table `tmkategori`
--

CREATE TABLE `tmkategori` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `no_rak` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tmkategori`
--

INSERT INTO `tmkategori` (`id`, `nama`, `no_rak`) VALUES
(1, 'Electronic', 1),
(2, 'buku', 2);

-- --------------------------------------------------------

--
-- Table structure for table `tmpelanggan`
--

CREATE TABLE `tmpelanggan` (
  `id` int(11) NOT NULL,
  `kode` varchar(10) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `no_telp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tmpelanggan`
--

INSERT INTO `tmpelanggan` (`id`, `kode`, `nama`, `alamat`, `no_telp`) VALUES
(1, '1001', 'Electronika', 'assas', '121121212');

-- --------------------------------------------------------

--
-- Table structure for table `tmsuperadmin`
--

CREATE TABLE `tmsuperadmin` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `status` enum('aktif','nonaktif') NOT NULL,
  `hak_akses` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tmsuperadmin`
--

INSERT INTO `tmsuperadmin` (`id`, `nama`, `username`, `password`, `status`, `hak_akses`) VALUES
(2, 'Riris', 'riris', '68cc0fec6518055696893788f92a2e2bec5a6cc9', 'aktif', 's_admin'),
(3, 'Zae', 'operator', 'c6adde9e7403a6f1ad16416b3871f5d7db84528d', 'nonaktif', ''),
(4, 'Pak Otong', 'otong', '23da437903be2625ef93ee20f15a6f11bd7880f5', 'aktif', 'user'),
(5, 'Saipul', 'ipul', 'ed8821f26122cde0801eac804e375cb8e4680f7c', 'aktif', 'user'),
(6, 'riris', 'ririse', '68cc0fec6518055696893788f92a2e2bec5a6cc9', 'aktif', 'admin'),
(7, 'a', 'a', '424ca85d95fe170ac1502d98d8a623adb807fa41', 'aktif', 'user');

-- --------------------------------------------------------

--
-- Table structure for table `tmsupplier`
--

CREATE TABLE `tmsupplier` (
  `id` int(11) NOT NULL,
  `kode` varchar(10) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `no_telp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tmsupplier`
--

INSERT INTO `tmsupplier` (`id`, `kode`, `nama`, `alamat`, `no_telp`) VALUES
(1, 'A-001', 'PAK Aye', 'jl. Godean', '08210000000'),
(2, 'A-002', 'Pak Bambang', 'jogja', '09876543'),
(3, 'A-004', 'Pak ASOLOLE', 'sleman', '098765323');

-- --------------------------------------------------------

--
-- Table structure for table `trbarang_keluar`
--

CREATE TABLE `trbarang_keluar` (
  `id` int(11) NOT NULL,
  `tgl` date NOT NULL,
  `id_petugas` int(11) NOT NULL,
  `id_pelanggan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `trbarang_keluar`
--

INSERT INTO `trbarang_keluar` (`id`, `tgl`, `id_petugas`, `id_pelanggan`) VALUES
(1, '2019-07-28', 6, 1),
(2, '2019-07-30', 6, 1),
(3, '2019-07-30', 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `trbarang_keluar_detail`
--

CREATE TABLE `trbarang_keluar_detail` (
  `id` int(11) NOT NULL,
  `id_barang_keluar` int(11) NOT NULL,
  `id_barang` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `trbarang_keluar_detail`
--

INSERT INTO `trbarang_keluar_detail` (`id`, `id_barang_keluar`, `id_barang`, `jumlah`) VALUES
(1, 1, 1, 3),
(2, 2, 1, 4),
(3, 3, 1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `trbarang_masuk`
--

CREATE TABLE `trbarang_masuk` (
  `id` int(11) NOT NULL,
  `tgl` date NOT NULL,
  `id_petugas` int(11) NOT NULL,
  `id_supplier` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `trbarang_masuk`
--

INSERT INTO `trbarang_masuk` (`id`, `tgl`, `id_petugas`, `id_supplier`) VALUES
(2, '2019-07-30', 6, 1),
(3, '2019-07-30', 6, 2),
(4, '2019-07-31', 6, 3);

-- --------------------------------------------------------

--
-- Table structure for table `trbarang_masuk_detail`
--

CREATE TABLE `trbarang_masuk_detail` (
  `id` int(11) NOT NULL,
  `id_barang_masuk` int(11) NOT NULL,
  `id_barang` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `trbarang_masuk_detail`
--

INSERT INTO `trbarang_masuk_detail` (`id`, `id_barang_masuk`, `id_barang`, `jumlah`) VALUES
(2, 2, 1, 2),
(3, 3, 1, 2),
(4, 4, 1, 4);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tmbarang`
--
ALTER TABLE `tmbarang`
  ADD PRIMARY KEY (`id`),
  ADD KEY `myKey` (`id_kategori`);

--
-- Indexes for table `tmkategori`
--
ALTER TABLE `tmkategori`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tmpelanggan`
--
ALTER TABLE `tmpelanggan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tmsuperadmin`
--
ALTER TABLE `tmsuperadmin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tmsupplier`
--
ALTER TABLE `tmsupplier`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `trbarang_keluar`
--
ALTER TABLE `trbarang_keluar`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_pelanggan` (`id_pelanggan`),
  ADD KEY `id_petugas` (`id_petugas`);

--
-- Indexes for table `trbarang_keluar_detail`
--
ALTER TABLE `trbarang_keluar_detail`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_barang` (`id_barang`),
  ADD KEY `trbarang_keluar_detail_ibfk_2` (`id_barang_keluar`);

--
-- Indexes for table `trbarang_masuk`
--
ALTER TABLE `trbarang_masuk`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_petugas` (`id_petugas`),
  ADD KEY `id_supplier` (`id_supplier`);

--
-- Indexes for table `trbarang_masuk_detail`
--
ALTER TABLE `trbarang_masuk_detail`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_barang` (`id_barang`),
  ADD KEY `id_barang_masuk` (`id_barang_masuk`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tmbarang`
--
ALTER TABLE `tmbarang`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tmkategori`
--
ALTER TABLE `tmkategori`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tmpelanggan`
--
ALTER TABLE `tmpelanggan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tmsuperadmin`
--
ALTER TABLE `tmsuperadmin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tmsupplier`
--
ALTER TABLE `tmsupplier`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `trbarang_keluar`
--
ALTER TABLE `trbarang_keluar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `trbarang_keluar_detail`
--
ALTER TABLE `trbarang_keluar_detail`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `trbarang_masuk`
--
ALTER TABLE `trbarang_masuk`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `trbarang_masuk_detail`
--
ALTER TABLE `trbarang_masuk_detail`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tmbarang`
--
ALTER TABLE `tmbarang`
  ADD CONSTRAINT `myKey` FOREIGN KEY (`id_kategori`) REFERENCES `tmkategori` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `trbarang_keluar`
--
ALTER TABLE `trbarang_keluar`
  ADD CONSTRAINT `trbarang_keluar_ibfk_1` FOREIGN KEY (`id_pelanggan`) REFERENCES `tmpelanggan` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `trbarang_keluar_ibfk_2` FOREIGN KEY (`id_petugas`) REFERENCES `tmsuperadmin` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `trbarang_keluar_detail`
--
ALTER TABLE `trbarang_keluar_detail`
  ADD CONSTRAINT `trbarang_keluar_detail_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `tmbarang` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `trbarang_keluar_detail_ibfk_2` FOREIGN KEY (`id_barang_keluar`) REFERENCES `trbarang_keluar` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `trbarang_masuk`
--
ALTER TABLE `trbarang_masuk`
  ADD CONSTRAINT `trbarang_masuk_ibfk_1` FOREIGN KEY (`id_petugas`) REFERENCES `tmsuperadmin` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `trbarang_masuk_ibfk_2` FOREIGN KEY (`id_supplier`) REFERENCES `tmsupplier` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `trbarang_masuk_detail`
--
ALTER TABLE `trbarang_masuk_detail`
  ADD CONSTRAINT `trbarang_masuk_detail_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `tmbarang` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `trbarang_masuk_detail_ibfk_2` FOREIGN KEY (`id_barang_masuk`) REFERENCES `trbarang_masuk` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

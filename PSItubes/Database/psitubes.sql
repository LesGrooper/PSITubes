-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 29 Des 2019 pada 07.14
-- Versi server: 10.4.6-MariaDB
-- Versi PHP: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `psitubes`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `detail_transaksi`
--

CREATE TABLE `detail_transaksi` (
  `id_detail_transaksi` int(11) NOT NULL,
  `id_transaksi` int(11) NOT NULL,
  `id_paket` varchar(10) NOT NULL,
  `harga` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `total_harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `detail_transaksi`
--

INSERT INTO `detail_transaksi` (`id_detail_transaksi`, `id_transaksi`, `id_paket`, `harga`, `jumlah`, `total_harga`) VALUES
(1, 1, 'P001', 35000, 2, 70000),
(2, 1, 'P001', 35000, 3, 105000),
(3, 2, 'P001', 35000, 1, 35000),
(4, 6, '2', 25000, 1, 25000),
(5, 6, '1', 35000, 1, 35000),
(6, 6, '1', 35000, 1, 35000),
(7, 7, '1', 35000, 1, 35000),
(8, 7, '3', 50000, 1, 50000),
(9, 8, '3', 50000, 1, 50000),
(10, 8, '3', 50000, 1, 50000),
(11, 8, '3', 50000, 1, 50000),
(12, 8, '3', 50000, 1, 50000),
(13, 9, '3', 50000, 1, 50000),
(14, 9, '3', 50000, 1, 50000),
(15, 10, '1', 35000, 1, 35000),
(16, 10, '1', 35000, 1, 35000),
(17, 11, '3', 50000, 1, 50000),
(18, 11, '3', 50000, 1, 50000),
(19, 11, '3', 50000, 1, 50000),
(20, 12, '2', 250000, 1, 250000),
(21, 12, '4', 75000, 1, 75000),
(23, 13, '5', 1212, 1, 1212),
(24, 13, '5', 1212, 1, 1212),
(25, 13, '5', 1212, 1, 1212),
(30, 15, '5', 1212, 1, 1212);

-- --------------------------------------------------------

--
-- Struktur dari tabel `kasir`
--

CREATE TABLE `kasir` (
  `id_kasir` int(10) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(50) NOT NULL,
  `nama_kasir` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kasir`
--

INSERT INTO `kasir` (`id_kasir`, `username`, `password`, `nama_kasir`) VALUES
(2, 'admin', '21232f297a57a5a743894a0e4a801fc3', 'Achmad');

-- --------------------------------------------------------

--
-- Struktur dari tabel `master_mahasiswa`
--

CREATE TABLE `master_mahasiswa` (
  `npm` varchar(9) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `IDprodi` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `master_mahasiswa`
--

INSERT INTO `master_mahasiswa` (`npm`, `nama`, `IDprodi`) VALUES
('173040004', 'Dede Amin', 304),
('173040004', 'Budi', 304);

-- --------------------------------------------------------

--
-- Struktur dari tabel `paket_makanan`
--

CREATE TABLE `paket_makanan` (
  `id_paket` int(11) NOT NULL,
  `nama_paket` varchar(25) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `paket_makanan`
--

INSERT INTO `paket_makanan` (`id_paket`, `nama_paket`, `harga`) VALUES
(1, 'Nasi Goreng', 15000),
(2, 'Mie Goreng Special', 15000),
(3, 'Sop Buntut', 20000),
(4, 'Combo Chicken', 75000),
(5, 'ababa', 1212),
(6, 'awawa', 1212121);

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(11) NOT NULL,
  `id_kasir` int(11) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `id_kasir`, `tanggal`) VALUES
(1, 0, '2014-01-13'),
(2, 0, '2019-12-24'),
(3, 0, '2019-12-24'),
(4, 0, '2019-12-24'),
(5, 0, '2019-12-24'),
(6, 0, '2019-12-24'),
(7, 0, '2019-12-24'),
(8, 0, '2019-12-24'),
(9, 0, '2019-12-24'),
(10, 0, '2019-12-24'),
(11, 0, '2019-12-25'),
(12, 2, '2019-12-25'),
(13, 2, '2019-12-25'),
(14, 2, '2019-12-25');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `detail_transaksi`
--
ALTER TABLE `detail_transaksi`
  ADD PRIMARY KEY (`id_detail_transaksi`);

--
-- Indeks untuk tabel `kasir`
--
ALTER TABLE `kasir`
  ADD PRIMARY KEY (`id_kasir`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indeks untuk tabel `paket_makanan`
--
ALTER TABLE `paket_makanan`
  ADD PRIMARY KEY (`id_paket`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `detail_transaksi`
--
ALTER TABLE `detail_transaksi`
  MODIFY `id_detail_transaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT untuk tabel `kasir`
--
ALTER TABLE `kasir`
  MODIFY `id_kasir` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT untuk tabel `paket_makanan`
--
ALTER TABLE `paket_makanan`
  MODIFY `id_paket` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id_transaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

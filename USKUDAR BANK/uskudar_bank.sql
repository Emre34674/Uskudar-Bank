-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 27 Eyl 2023, 20:25:47
-- Sunucu sürümü: 10.4.28-MariaDB
-- PHP Sürümü: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `uskudar_bank`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `müsteritablosu`
--

CREATE TABLE `müsteritablosu` (
  `kullanici_id` int(11) NOT NULL,
  `ad_soyadi` varchar(50) NOT NULL,
  `müşteri_no` varchar(10) NOT NULL,
  `parola` varchar(10) NOT NULL,
  `bakiye` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `müsteritablosu`
--

INSERT INTO `müsteritablosu` (`kullanici_id`, `ad_soyadi`, `müşteri_no`, `parola`, `bakiye`) VALUES
(1, 'Murat Keklikçi', '101102103', '3434', 5000),
(2, 'Elif Colakoglu', '101102104', '8888', 4180),
(3, 'Mert Keskin', '101102105', '3436', 2100),
(4, 'Aylin Camci', '101102106', '7744', 2050),
(5, 'Tolga Arkin', '101102107', '123456', 8000);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `para_kasasi`
--

CREATE TABLE `para_kasasi` (
  `id` int(11) NOT NULL,
  `para_degeri` int(11) NOT NULL,
  `miktar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `para_kasasi`
--

INSERT INTO `para_kasasi` (`id`, `para_degeri`, `miktar`) VALUES
(1, 5, 65),
(2, 10, 65),
(3, 20, 65),
(4, 50, 65),
(5, 100, 65),
(6, 200, 65);

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `müsteritablosu`
--
ALTER TABLE `müsteritablosu`
  ADD PRIMARY KEY (`kullanici_id`);

--
-- Tablo için indeksler `para_kasasi`
--
ALTER TABLE `para_kasasi`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `müsteritablosu`
--
ALTER TABLE `müsteritablosu`
  MODIFY `kullanici_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Tablo için AUTO_INCREMENT değeri `para_kasasi`
--
ALTER TABLE `para_kasasi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

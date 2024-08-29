-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Dim 23 Juin 2024 à 21:56
-- Version du serveur :  5.6.24
-- Version de PHP :  5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `gestionbar`
--

-- --------------------------------------------------------

--
-- Structure de la table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `code` int(30) NOT NULL,
  `psw` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `admin`
--

INSERT INTO `admin` (`code`, `psw`) VALUES
(1, 'admin2023');

-- --------------------------------------------------------

--
-- Structure de la table `commande`
--

CREATE TABLE IF NOT EXISTS `commande` (
  `numCommande` int(10) NOT NULL,
  `idCommande` int(11) DEFAULT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `commande`
--

INSERT INTO `commande` (`numCommande`, `idCommande`, `date`) VALUES
(1, 6, '2023-03-28 09:08:17'),
(7, 4, '2023-03-30 21:37:30'),
(8, 18, '2023-03-31 14:17:08'),
(9, 3, '2023-03-31 14:24:04'),
(10, 3, '2023-03-31 14:25:00'),
(12, 4, '2023-04-02 19:39:31'),
(13, 18, '2023-04-02 19:40:10'),
(14, 6, '2023-04-02 20:26:53'),
(15, 18, '2023-04-02 20:26:58'),
(16, 3, '2023-04-02 20:27:07'),
(18, 4, '2023-04-03 06:26:28'),
(19, 4, '2023-04-03 06:40:22'),
(20, 6, '2023-04-09 19:13:41'),
(21, 18, '2023-04-11 10:10:22'),
(22, 6, '2023-04-11 10:10:31'),
(23, 3, '2023-04-11 10:29:10'),
(24, 3, '2023-04-11 10:31:36'),
(25, 6, '2023-04-11 10:39:54'),
(26, 18, '2023-04-11 10:40:28'),
(27, 3, '2023-04-11 10:41:19'),
(28, 2, '2023-04-12 06:10:36'),
(29, 3, '2023-04-12 06:11:15'),
(30, 3, '2023-04-23 07:45:11'),
(31, 18, '2023-04-23 07:45:29'),
(32, 18, '2023-04-24 08:27:37'),
(33, 3, '2023-04-24 08:29:23'),
(34, 18, '2023-04-24 14:39:51'),
(35, 6, '2023-04-25 17:19:25'),
(36, 18, '2023-06-05 15:28:46'),
(37, 1, '2023-06-05 15:28:52'),
(38, 1, '2023-07-17 14:03:59'),
(39, 8, '2023-10-22 15:58:47'),
(40, 8, '2023-11-10 14:32:02'),
(41, 3, '2024-02-26 13:45:35'),
(42, 3, '2024-03-05 18:10:19'),
(43, 1, '2024-03-05 18:10:39');

-- --------------------------------------------------------

--
-- Structure de la table `connexion`
--

CREATE TABLE IF NOT EXISTS `connexion` (
  `utilisateur` varchar(100) NOT NULL,
  `mp` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `connexion`
--

INSERT INTO `connexion` (`utilisateur`, `mp`) VALUES
('Controla1', '1234');

-- --------------------------------------------------------

--
-- Structure de la table `detail`
--

CREATE TABLE IF NOT EXISTS `detail` (
  `numCommande` int(11) DEFAULT NULL,
  `numProduit` int(11) DEFAULT NULL,
  `quantite` int(30) DEFAULT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `detail`
--

INSERT INTO `detail` (`numCommande`, `numProduit`, `quantite`, `date`) VALUES
(1, 101, 2, '2023-03-28 09:09:27'),
(1, 102, 1, '2023-03-30 21:30:34'),
(10, 101, 7, '2023-03-31 14:46:14'),
(10, 101, 4, '2023-03-31 14:46:27'),
(9, 102, 4, '2023-03-31 14:49:25'),
(8, 101, 6, '2023-03-31 14:50:41'),
(8, 102, 10, '2023-03-31 14:55:10'),
(12, 103, 5, '2023-04-02 20:28:19'),
(12, 100, 4, '2023-04-02 20:28:34'),
(13, 100, 7, '2023-04-02 20:28:46'),
(19, 104, 3, '2023-05-06 10:27:29'),
(15, 102, 5, '2023-04-02 20:29:17'),
(14, 103, 8, '2023-04-09 16:45:35'),
(18, 100, 7, '2023-04-03 06:37:14'),
(18, 100, 7, '2023-04-03 06:38:34'),
(18, 101, 7, '2023-04-03 06:38:40'),
(16, 101, 4, '2023-04-09 16:44:33'),
(29, 102, 2, '2023-04-12 06:12:25'),
(1, 101, 7, '2023-04-12 06:19:21'),
(27, 101, 2, '2023-04-23 09:20:00'),
(25, 109, 4, '2023-05-06 10:26:59'),
(33, 102, 4, '2023-04-24 08:29:47'),
(32, 103, 8, '2023-05-06 10:26:45'),
(32, 102, 5, '2023-04-24 08:33:41'),
(30, 100, 5, '2023-04-24 08:34:29'),
(30, 101, 2, '2023-04-24 08:34:58'),
(33, 102, 5, '2023-04-24 14:38:15'),
(12, 100, 1, '2023-05-06 10:30:40'),
(1, 100, 6, '2023-05-15 21:20:37'),
(31, 100, 3, '2023-05-25 14:03:46'),
(1, 103, 2, '2023-06-18 20:49:44'),
(1, 112, 4, '2023-06-18 20:50:05'),
(38, 101, 9, '2023-07-02 10:39:00'),
(37, 109, 6, '2023-07-14 10:59:40'),
(38, 101, 10, '2023-08-10 11:34:18'),
(39, 101, 5, '2023-10-22 15:59:30'),
(39, 100, 60, '2023-10-22 16:00:58'),
(41, 102, 8, '2024-02-26 13:46:05'),
(41, 101, 5, '2024-02-26 13:47:21'),
(43, 102, 2, '2024-03-05 18:11:20'),
(43, 101, 1, '2024-03-05 18:12:07'),
(43, 112, 4, '2024-03-05 18:16:34');

-- --------------------------------------------------------

--
-- Structure de la table `employe`
--

CREATE TABLE IF NOT EXISTS `employe` (
  `id` int(10) NOT NULL,
  `numFx` int(11) DEFAULT NULL,
  `nomEmploye` varchar(50) NOT NULL,
  `age` int(5) DEFAULT NULL,
  `adresse` varchar(50) DEFAULT NULL,
  `etatCivil` set('Celibataire','Marie','Divorce') DEFAULT NULL,
  `telephone` int(20) DEFAULT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `employe`
--

INSERT INTO `employe` (`id`, `numFx`, `nomEmploye`, `age`, `adresse`, `etatCivil`, `telephone`, `date`) VALUES
(1, 9, 'ABBASI  AHMAD', 26, 'CIBITOKE', 'Celibataire', 69460410, '2023-05-02 07:37:38'),
(2, 14, 'TREY  ZO', 27, 'JABE', 'Celibataire', 69745842, '2023-03-31 08:57:35'),
(3, 13, 'NAHIMANA ROSETTE', 30, 'KAMENGE', 'Divorce', 67589372, '2023-04-25 11:30:13'),
(4, 16, 'MUGISHA EPIPODE', 27, 'KAMENGE', 'Celibataire', 6909865, '2023-05-09 11:23:10'),
(5, 10, 'HACIMANA AUDACE', 29, 'KIBENGA', 'Divorce', 63789954, '2023-05-09 11:24:10'),
(6, 19, 'BOSS HUSSEIN', 26, 'KIRIRI', 'Marie', 69494732, '2023-04-25 11:29:34'),
(7, 15, 'DUSENGIMANA AUDACE', 30, 'MUTANGA', 'Marie', 67084277, '2023-05-09 11:26:06'),
(8, 13, 'ANNETTE', 24, 'MUTAKURA', 'Celibataire', 65436842, '2023-05-09 11:28:37'),
(18, 13, 'BUCUMI BOBO', 26, 'GASENYI', 'Celibataire', 69011234, '2023-03-28 15:42:00'),
(19, 11, 'KAPOSHO SAIDI', 40, 'JABE', 'Marie', 68139993, '2023-07-02 10:18:25'),
(21, 21, 'NKURU ', 27, 'KAJAGA', 'Celibataire', 65980684, '2023-08-10 11:32:27'),
(25, 20, 'OLIVIER', 30, 'KIGOBE', 'Marie', 69097765, '2023-10-22 15:55:47');

-- --------------------------------------------------------

--
-- Structure de la table `facture`
--

CREATE TABLE IF NOT EXISTS `facture` (
  `numFacture` int(10) NOT NULL,
  `numCommande` int(11) DEFAULT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `facture`
--

INSERT INTO `facture` (`numFacture`, `numCommande`, `date`) VALUES
(13, 13, '2023-04-03 07:03:27'),
(14, 14, '2023-04-24 08:24:00'),
(15, 33, '2023-04-24 08:30:27'),
(18, 35, '2023-04-26 19:38:22'),
(23, 19, '2023-05-06 10:27:50'),
(24, 25, '2023-05-06 10:29:08'),
(28, 8, '2023-05-06 10:35:55'),
(29, 33, '2023-05-25 13:30:33'),
(30, 30, '2023-05-25 13:57:17'),
(31, 30, '2023-05-25 13:59:54'),
(33, 32, '2023-06-18 20:51:18'),
(34, 38, '2023-08-10 11:36:22'),
(35, 39, '2023-10-22 15:59:48'),
(36, 41, '2024-02-26 13:46:13'),
(37, 1, '2024-02-26 13:48:48'),
(38, 15, '2024-02-26 13:49:04'),
(39, 43, '2024-03-05 18:12:46');

-- --------------------------------------------------------

--
-- Structure de la table `fonction`
--

CREATE TABLE IF NOT EXISTS `fonction` (
  `numFx` int(10) NOT NULL,
  `nomFx` varchar(50) NOT NULL,
  `salaire` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `fonction`
--

INSERT INTO `fonction` (`numFx`, `nomFx`, `salaire`) VALUES
(9, 'Adminitrateur', 2000000),
(10, 'DG', 3000000),
(11, 'Manager', 1250000),
(13, 'Serviteur', 500000),
(14, 'Ambassadeur', 1000000),
(15, 'Marketeur', 1000000),
(16, 'Tresorier', 1200000),
(19, 'Securité', 300000),
(20, 'Avocat', 1000000),
(21, 'Electricien', 500000);

-- --------------------------------------------------------

--
-- Structure de la table `fournisseur`
--

CREATE TABLE IF NOT EXISTS `fournisseur` (
  `numFour` int(10) NOT NULL,
  `nomFour` varchar(50) DEFAULT NULL,
  `telephone` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `fournisseur`
--

INSERT INTO `fournisseur` (`numFour`, `nomFour`, `telephone`) VALUES
(1, 'Mr  Ziranoze', 68745270),
(2, 'MRS FANNY', 6834272),
(3, 'Mr Sioni', 67534621),
(4, 'Boss Rajab', 65373262),
(5, 'BOSS ', 79008362);

-- --------------------------------------------------------

--
-- Structure de la table `produit`
--

CREATE TABLE IF NOT EXISTS `produit` (
  `numProduit` int(11) DEFAULT NULL,
  `nomProduit` varchar(50) NOT NULL,
  `prixVenteUnitaire` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `produit`
--

INSERT INTO `produit` (`numProduit`, `nomProduit`, `prixVenteUnitaire`) VALUES
(101, 'Amstel', 3000),
(104, 'Apple', 1200),
(102, 'Coca-Cola', 1200),
(113, 'kinju', 1200),
(103, 'Malti', 1200),
(109, 'Orange', 1500),
(100, 'Primus', 1500),
(112, 'Royal', 5000);

-- --------------------------------------------------------

--
-- Structure de la table `produitstock`
--

CREATE TABLE IF NOT EXISTS `produitstock` (
  `numProduit` int(10) NOT NULL,
  `numFour` int(11) DEFAULT NULL,
  `nomProduit` varchar(50) NOT NULL,
  `quantiteGazier` int(50) DEFAULT NULL,
  `prixAchatGazier` int(50) DEFAULT NULL,
  `dateAchat` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `produitstock`
--

INSERT INTO `produitstock` (`numProduit`, `numFour`, `nomProduit`, `quantiteGazier`, `prixAchatGazier`, `dateAchat`) VALUES
(100, 5, 'Primus', 50, 36000, '2023-03-28 08:13:08'),
(101, 5, 'Amstel', 30, 48000, '2023-03-28 08:11:35'),
(102, 1, 'CocaCola', 40, 20000, '2023-04-25 11:34:52'),
(103, 4, 'Malti', 50, 20000, '2023-04-09 14:21:32'),
(104, 4, 'Apple', 20, 20000, '2023-04-09 14:08:34'),
(108, 5, 'Aquavie', 20, 20000, '2023-04-09 14:07:56'),
(109, 5, 'Orange', 10, 10000, '2023-04-09 18:32:02'),
(110, 1, 'Fursana', 20, 12000, '2023-04-12 05:55:39'),
(111, 3, 'VivaMalti', 2, 12000, '2023-04-12 06:02:14'),
(112, 1, 'Royal', 9, 46000, '2023-05-25 14:09:15'),
(113, 3, 'kinju', 5, 10000, '2023-07-02 10:29:05');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`code`);

--
-- Index pour la table `commande`
--
ALTER TABLE `commande`
  ADD PRIMARY KEY (`numCommande`), ADD KEY `idCommande` (`idCommande`);

--
-- Index pour la table `connexion`
--
ALTER TABLE `connexion`
  ADD PRIMARY KEY (`utilisateur`);

--
-- Index pour la table `detail`
--
ALTER TABLE `detail`
  ADD KEY `numCommande` (`numCommande`), ADD KEY `numProduit` (`numProduit`);

--
-- Index pour la table `employe`
--
ALTER TABLE `employe`
  ADD PRIMARY KEY (`id`), ADD KEY `numFx` (`numFx`);

--
-- Index pour la table `facture`
--
ALTER TABLE `facture`
  ADD PRIMARY KEY (`numFacture`), ADD KEY `numCommande` (`numCommande`);

--
-- Index pour la table `fonction`
--
ALTER TABLE `fonction`
  ADD PRIMARY KEY (`numFx`);

--
-- Index pour la table `fournisseur`
--
ALTER TABLE `fournisseur`
  ADD PRIMARY KEY (`numFour`);

--
-- Index pour la table `produit`
--
ALTER TABLE `produit`
  ADD PRIMARY KEY (`nomProduit`), ADD KEY `numProduit` (`numProduit`);

--
-- Index pour la table `produitstock`
--
ALTER TABLE `produitstock`
  ADD PRIMARY KEY (`numProduit`), ADD KEY `numFour` (`numFour`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `admin`
--
ALTER TABLE `admin`
  MODIFY `code` int(30) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `commande`
--
ALTER TABLE `commande`
  MODIFY `numCommande` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=44;
--
-- AUTO_INCREMENT pour la table `facture`
--
ALTER TABLE `facture`
  MODIFY `numFacture` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=40;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

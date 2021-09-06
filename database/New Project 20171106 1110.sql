-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.22-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema socirank
--

CREATE DATABASE IF NOT EXISTS socirank;
USE socirank;

--
-- Definition of table `political`
--

DROP TABLE IF EXISTS `political`;
CREATE TABLE `political` (
  `words` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `political`
--

/*!40000 ALTER TABLE `political` DISABLE KEYS */;
INSERT INTO `political` (`words`) VALUES 
 ('accusation'),
 ('acolyte'),
 ('allegation'),
 ('alliance'),
 ('anonymity'),
 ('aspiration'),
 ('assail'),
 ('authoritarian'),
 ('bamboozle'),
 ('beleaguer'),
 ('benefit'),
 ('blame'),
 ('bribe'),
 ('cadre'),
 ('career'),
 ('chicanery'),
 ('claim'),
 ('coercion'),
 ('collaboration'),
 ('conceal'),
 ('confidence'),
 ('control'),
 ('corruption'),
 ('coterie'),
 ('covert'),
 ('debacle'),
 ('deception'),
 ('defamation'),
 ('deficit'),
 ('deflect'),
 ('demagogue'),
 ('denigrate'),
 ('deny'),
 ('dictatorship'),
 ('embezzlement'),
 ('empire'),
 ('endorsement'),
 ('engagement'),
 ('expose'),
 ('extortion'),
 ('feud'),
 ('fiasco'),
 ('fray'),
 ('furor'),
 ('gain'),
 ('greedy'),
 ('hypocrisy'),
 ('ignorant'),
 ('illegal'),
 ('illicit'),
 ('impunity'),
 ('incident'),
 ('influence'),
 ('infringement'),
 ('integrity'),
 ('intimidation'),
 ('irresponsible'),
 ('laconic'),
 ('lobby'),
 ('malfeasance'),
 ('manipulate'),
 ('massive'),
 ('mendacity'),
 ('mercurial'),
 ('obscure');
INSERT INTO `political` (`words`) VALUES 
 ('onerous'),
 ('opportunist'),
 ('parry'),
 ('partial'),
 ('patriarchy'),
 ('patronage'),
 ('persecution'),
 ('plagiarism'),
 ('plutocracy'),
 ('prestidigitation'),
 ('privilege'),
 ('proxy'),
 ('rebut'),
 ('reckless'),
 ('recrimination'),
 ('refute'),
 ('regime'),
 ('reputation'),
 ('resignation'),
 ('retaliation'),
 ('revelation'),
 ('saga'),
 ('scandal'),
 ('scandalous'),
 ('scapegoat'),
 ('sloth'),
 ('solicit'),
 ('subterfuge'),
 ('tainted'),
 ('tarnish'),
 ('temptation'),
 ('tycoon'),
 ('unethical'),
 ('unjust'),
 ('unsavory'),
 ('Modi'),
 ('pjb modi'),
 ('pjb'),
 ('Narendra Modi'),
 ('Amit Shah'),
 ('Arvind Kejriwal'),
 ('Mamata Banerjee'),
 ('Rahul Gandhi'),
 ('Sonia Gandhi'),
 ('most'),
 ('important'),
 ('very');
/*!40000 ALTER TABLE `political` ENABLE KEYS */;


--
-- Definition of table `public_tweets`
--

DROP TABLE IF EXISTS `public_tweets`;
CREATE TABLE `public_tweets` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `uid` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `msg` longtext NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `public_tweets`
--

/*!40000 ALTER TABLE `public_tweets` DISABLE KEYS */;
/*!40000 ALTER TABLE `public_tweets` ENABLE KEYS */;


--
-- Definition of table `tweets`
--

DROP TABLE IF EXISTS `tweets`;
CREATE TABLE `tweets` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `uid` varchar(45) NOT NULL,
  `img` longtext NOT NULL,
  `uname` varchar(45) NOT NULL,
  `post` longtext NOT NULL,
  `df` varchar(45) default '0',
  `nodeweighting` varchar(45) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tweets`
--

/*!40000 ALTER TABLE `tweets` DISABLE KEYS */;
/*!40000 ALTER TABLE `tweets` ENABLE KEYS */;


--
-- Definition of table `user_details`
--

DROP TABLE IF EXISTS `user_details`;
CREATE TABLE `user_details` (
  `uname` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `app_key` longtext NOT NULL,
  `app_secret` longtext NOT NULL,
  `acc_key` longtext NOT NULL,
  `acc_token` longtext NOT NULL,
  `pass` varchar(45) NOT NULL,
  `photo` longblob NOT NULL,
  PRIMARY KEY  (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_details`
--

/*!40000 ALTER TABLE `user_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_details` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

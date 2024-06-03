CREATE DATABASE  IF NOT EXISTS `dacs` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `dacs`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: dacs
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `qlsach`
--

DROP TABLE IF EXISTS `qlsach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `qlsach` (
  `MaSach` varchar(45) NOT NULL,
  `TenSach` varchar(45) NOT NULL,
  `TenTacGia` varchar(45) NOT NULL,
  `TheLoai` varchar(45) NOT NULL,
  `SoLuong` int NOT NULL,
  `GiaTien` double NOT NULL,
  `ID` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qlsach`
--

LOCK TABLES `qlsach` WRITE;
/*!40000 ALTER TABLE `qlsach` DISABLE KEYS */;
INSERT INTO `qlsach` VALUES ('TV2','Đắc nhân tâm','Dale Carnegie','self help',200,23000,1),('DG4','Nhà giả kim','Paulo Coelho','Giả tưởng',509,58000,2),('AOV3','Phép','Garena','Giải trí',30,20000,3),('TTTQ1','Trạng Quỷnh','Kim Khánh','Truyện cười',1000,17000,4),('TTDRM','Doraemon','Fujiko Fujio','Truyện tranh',370,25000,5),('HGT4','Cửa sổ tâm hồn','Kim Thoa','tiểu thuyết',6000,60000,7),('UT6','Tiếng Việt lớp 1 ','BGD','Sách giáo khoa',31,25080,8),('BGT','Bài Tập tóa lớp 1','BGD','Sách bài tập',300,23000,9),('AOV','Thánh','Garena','Giải trí',6,30000,10);
/*!40000 ALTER TABLE `qlsach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qlthemuon`
--

DROP TABLE IF EXISTS `qlthemuon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `qlthemuon` (
  `MaThe` int NOT NULL AUTO_INCREMENT,
  `TenNguoiMuon` varchar(45) NOT NULL,
  `SoSachDaMuon` int NOT NULL,
  `SoSachDaTra` int NOT NULL,
  `GioiTinh` int NOT NULL,
  `NgaySinh` date NOT NULL,
  PRIMARY KEY (`MaThe`)
) ENGINE=InnoDB AUTO_INCREMENT=6787 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qlthemuon`
--

LOCK TABLES `qlthemuon` WRITE;
/*!40000 ALTER TABLE `qlthemuon` DISABLE KEYS */;
INSERT INTO `qlthemuon` VALUES (1002,'Phạm Như Quốc Triều',15,12,1,'2005-07-30'),(1013,'Mai Thanh Thảo',3,2,0,'2005-03-18'),(1014,'Đoàn Thị Thu Trang',2,1,0,'2007-05-23'),(2354,'Nguyễn Duy Thịnh ',9,7,1,'2003-10-07'),(3521,'Nguyễn Thị Kim Chung',5,3,0,'1981-05-03'),(4002,'Phạm Thanh Xuân',6,4,0,'2008-05-17'),(4094,'Lý Hằng Xuyên',23,20,1,'1973-01-01'),(6786,'Lý Thị Kim Thoa',5,3,0,'2005-08-25');
/*!40000 ALTER TABLE `qlthemuon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qluser`
--

DROP TABLE IF EXISTS `qluser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `qluser` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Ten` varchar(45) NOT NULL,
  `CCCD` varchar(45) NOT NULL,
  `SDT` varchar(45) NOT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `NgaySinh` date NOT NULL,
  `GioiTinh` int NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qluser`
--

LOCK TABLES `qluser` WRITE;
/*!40000 ALTER TABLE `qluser` DISABLE KEYS */;
INSERT INTO `qluser` VALUES (1,'Phạm Như Quốc Triều','673380298489','0797526054','pnqtrieu.23itb@vku.udn.vn','2005-07-30',1),(2,'Lý Thị Kim Thoa','943278692324','0796916621','ltkthoa.23itb@vku.udn.vn','2005-08-25',0),(3,'Mai Thanh Thảo','4962579868652','0919960514','maithanhthao18@gmail.com','2005-03-18',0),(4,'Đoàn Thị Thu Trang','4977266897','0934950302','doanthithutrang@gmail.com','2007-05-23',0),(5,'Nguyễn Duy Thịnh','4976213765','0795619047','ndthinh10@gmail.com','2003-10-07',1),(6,'Nguyễn Thị Kim Chung','4908264864','0788571971','nguyenthyikikmchung0305@gmail.com','1981-05-03',0),(7,'Lý Hằng Xuyên','947862678','0902344829','lyhangxuyen1973@gmail.com','1903-01-01',1),(8,'Phạm Thanh Xuân','67964388754','0796316426','phamthanhxuan1321@gmail.com','2008-05-17',0),(9,'Bin','04520500877','0797526054','123@gamil.com','2024-06-04',1),(10,'trieu','0000','000','11111','2024-06-03',1),(12,'1','1','2','1','2024-06-04',1);
/*!40000 ALTER TABLE `qluser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tai_khoan`
--

DROP TABLE IF EXISTS `tai_khoan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tai_khoan` (
  `User` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Ho Ten` varchar(45) NOT NULL,
  `Mail` varchar(45) NOT NULL,
  `Tinh_Trang` varchar(45) NOT NULL,
  PRIMARY KEY (`User`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tai_khoan`
--

LOCK TABLES `tai_khoan` WRITE;
/*!40000 ALTER TABLE `tai_khoan` DISABLE KEYS */;
INSERT INTO `tai_khoan` VALUES ('admin','123','Phạm Như Quốc Triều','phamnhuquoctrieu307@gmail.com','1'),('admin2','1234','Lý Thị Kim Thoa','thialythikim@gmal.com','1'),('Kimthoa','258','Lý Thị Kim Thoa','thoa','1'),('trieu123','123456','Phạm Như Quốc Triều','trieupnq.23itb@vku.udn.vn','1');
/*!40000 ALTER TABLE `tai_khoan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tai_khoan1`
--

DROP TABLE IF EXISTS `tai_khoan1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tai_khoan1` (
  `Ten_dang_nhap` varchar(45) NOT NULL,
  `Mat_khau` varchar(45) NOT NULL,
  `Tinh_Trang` int NOT NULL,
  PRIMARY KEY (`Ten_dang_nhap`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tai_khoan1`
--

LOCK TABLES `tai_khoan1` WRITE;
/*!40000 ALTER TABLE `tai_khoan1` DISABLE KEYS */;
INSERT INTO `tai_khoan1` VALUES ('admin','1234',1),('bin','thoa',0),('bina','1',1),('thoa','bin',1),('trieu','bin',1);
/*!40000 ALTER TABLE `tai_khoan1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'dacs'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-03 14:04:53

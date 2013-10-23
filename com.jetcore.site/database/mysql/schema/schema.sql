DROP SCHEMA IF EXISTS `jetcore` ;
CREATE SCHEMA IF NOT EXISTS `jetcore` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci ;
USE `jetcore` ;

-- -----------------------------------------------------
-- Table `jet_user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `jet_user` ;

CREATE  TABLE IF NOT EXISTS `jet_user` (
  `jet_uid` BIGINT(10) UNSIGNED NOT NULL auto_increment,
  `jet_guid` VARCHAR(64) NOT NULL ,
  `jet_email` VARCHAR(255) NULL ,
  `jet_password` VARCHAR(255) NULL ,
  `jet_screen_name` VARCHAR(255) NULL ,
  `jet_first_name` VARCHAR(255) NULL ,
  `jet_last_name` VARCHAR(255) NOT NULL ,  
  `jet_gender` VARCHAR(32) NOT NULL,
  `jet_security_question` VARCHAR(255) NULL ,
  `jet_answer` VARCHAR(255) NULL ,  
  `jet_type` VARCHAR(64) NULL ,
  `jet_created_on` DATETIME NOT NULL ,
  `jet_created_by` BIGINT(10) UNSIGNED NULL ,
  `jet_modified_on` DATETIME NOT NULL ,
  `jet_modified_by` BIGINT(10) UNSIGNED NULL ,
  `jet_active` TINYINT(1) UNSIGNED NULL DEFAULT 1 ,
  PRIMARY KEY (`jet_uid`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `jet_student_registration`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `jet_student_registration` ;

CREATE  TABLE IF NOT EXISTS `jet_student_registration` (
  `jet_uid` BIGINT(10) UNSIGNED NOT NULL auto_increment,
  `jet_guid` VARCHAR(64) NOT NULL ,
  `jet_enrollment_number` VARCHAR(255) NULL ,
  `jet_enrollment_date` VARCHAR(255) NULL ,
  `jet_enrolled_course` VARCHAR(255) NULL ,
  `jet_batch_code` VARCHAR(255) NULL ,
  `jet_student_first_name` VARCHAR(255) NOT NULL ,  
  `jet_student_last_name` VARCHAR(255) NOT NULL ,    
  `jet_student_category` VARCHAR(255) NOT NULL ,
  `jet_student_date_of_birth` DATETIME NOT NULL ,    
  `jet_created_on` DATETIME NOT NULL ,
  `jet_created_by` BIGINT(10) UNSIGNED NULL ,
  `jet_modified_on` DATETIME NOT NULL ,
  `jet_modified_by` BIGINT(10) UNSIGNED NULL ,
  `jet_active` TINYINT(1) UNSIGNED NULL DEFAULT 1 ,
  PRIMARY KEY (`jet_uid`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `jet_student_contact`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `jet_student_contact` ;

CREATE  TABLE IF NOT EXISTS `jet_student_contact` (
  `jet_uid` BIGINT(10) UNSIGNED NOT NULL auto_increment,
  `jet_guid` VARCHAR(64) NOT NULL ,
  `jet_enrollment_number` VARCHAR(255) NULL ,
  `jet_gender` VARCHAR(255) NULL ,
  `jet_email` VARCHAR(255) NULL ,
  `jet_mobile` VARCHAR(255) NULL ,
  `jet_address` VARCHAR(255) NULL ,  
  `jet_created_on` DATETIME NOT NULL ,
  `jet_created_by` BIGINT(10) UNSIGNED NULL ,
  `jet_modified_on` DATETIME NOT NULL ,
  `jet_modified_by` BIGINT(10) UNSIGNED NULL ,
  `jet_active` TINYINT(1) UNSIGNED NULL DEFAULT 1 ,
  PRIMARY KEY (`jet_uid`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `jet_student_acedamic_detail`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `jet_student_acedamic_detail` ;

CREATE  TABLE IF NOT EXISTS `jet_student_acedamic_detail` (
  `jet_uid` BIGINT(10) UNSIGNED NOT NULL auto_increment,
  `jet_guid` VARCHAR(64) NOT NULL ,
  `jet_enrollment_number` VARCHAR(255) NULL ,
  `jet_ssc_marks` VARCHAR(255) NULL ,
  `jet_ssc_year_of_passing` VARCHAR(255) NULL ,
  `jet_ssc_institution_name` VARCHAR(255) NULL ,
  `jet_intermediate_marks` VARCHAR(255) NULL ,
  `jet_intermediate_year_of_passing` VARCHAR(255) NULL ,
  `jet_intermediate_institution_name` VARCHAR(255) NULL ,
  `jet_graduation` VARCHAR(255) NULL ,
  `jet_graduation_marks` VARCHAR(255) NULL ,
  `jet_graduation_year_of_passing` VARCHAR(255) NULL ,
  `jet_graduation_institution_name` VARCHAR(255) NULL ,
  `jet_postgraduation` VARCHAR(255) NULL ,
  `jet_postgraduation_marks` VARCHAR(255) NULL ,
  `jet_postgraduation_year_of_passing` VARCHAR(255) NULL ,
  `jet_postgraduation_institution_name` VARCHAR(255) NULL ,
  `jet_created_on` DATETIME NOT NULL ,
  `jet_created_by` BIGINT(10) UNSIGNED NULL ,
  `jet_modified_on` DATETIME NOT NULL ,
  `jet_modified_by` BIGINT(10) UNSIGNED NULL ,
  `jet_active` TINYINT(1) UNSIGNED NULL DEFAULT 1 ,
  PRIMARY KEY (`jet_uid`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


/*truncate table jet_user;
truncate table jet_student_registration;
truncate table jet_student_contact;
truncate table jet_student_acedamic_detail;*/
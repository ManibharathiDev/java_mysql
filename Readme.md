Created Table
--------------------------

CREATE TABLE `db_schools`.`tbl_school_info` (
`id` INT NOT NULL,
`name` VARCHAR(45) NOT NULL,
`address` VARCHAR(45) NOT NULL,
`started_year` INT NOT NULL,
`founder` VARCHAR(45) NOT NULL,
PRIMARY KEY (`id`));



MySQL DB Connection With JAVA

-> C R UD

C : Create or Insert a records

R : Fetch or Read Records

u : Update records

D: Delete Records

R : Statment

C,U,D : PreparedStatement



MySQL -> DB Software \ Server


MySQL -> Database. Oracle,MSSQLServer, PostgreSQL

SQL -> Structured Query Language _>

Select * from table_name;


Java ->

MySQL -> MySQL Connector -> Establish connection between Java and MySQL

Oracle -> Oracle Connector -> Establish connection between java and Oracle

Interface : Have definition not a declaration


public interface student{

	void getStudents();

}

IF connection is established

	-> Read : Statement

	-> -> Prepared Statment


-> Executing query

$host="localhost";
$port=3306;
$socket="";
$user="root";
$password="manibharathi";
$dbname="db_college";

$con = new mysqli($host, $user, $password, $dbname, $port, $socket)
or die ('Could not connect to the database server' . mysqli_connect_error());

//$con->close();
b


































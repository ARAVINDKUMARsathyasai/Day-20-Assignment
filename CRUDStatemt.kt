import java.sql.*;

fun main() {
    Class.forName("com.mysql.jdbc.Driver")
    var con= DriverManager.getConnection("jdbc:mysql://localhost:3307/axisDb","root","root")
    var sql="Create table employee (id int(10),name text(20),age int(5),salary int(8))"
    sql="Insert into employee (id,name,age,salary) values(1,'aravindkumar',23,60000),(2,'Sunil',25,7000),(3,'pradeep',20,5000)"
    sql="update employee set name=? where id=?"
    sql ="Select * from employee"
    var ps=con.prepareStatement(sql)
    ps.setString(1,"Kiran");
    ps.executeUpdate()
    var rs=ps.executeQuery()
    while (rs.next())
    {
        println("${rs.getInt(1)} : ${rs.getString(2)} : ${rs.getInt(3)}, ${rs.getInt(4)}");
    }
    println("end of program")
}
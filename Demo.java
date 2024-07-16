MCQs 

Which of the following is not Constraint in SQL?
Primary Key
Not Null
Check
Union
Ans: d) Union
Explanation: Constraint specifies the rule to allow or restrict what data will be stored in a table. The PRIMARY KEY, NOT NULL, and CHECK are the constraints that specify rules for data insertion.
UNION is an operator that combines two or more results from multiple SELECT queries into a single result set.

  2. Which package contains the core JDBC classes and interfaces?
a) java.sql
b) java.jdbc
c) javax.sql
d) javax.jdbc
Ans: a) java.sql

3. To establish a database connection in JDBC, you need to load the appropriate driver using:
a) Class.forName("com.mysql.jdbc.Driver");
b) DriverManager.registerDriver("com.mysql.jdbc.Driver");
c) DriverManager.loadDriver("com.mysql.jdbc.Driver");
d) Class.loadDriver("com.mysql.jdbc.Driver");
Ans: a) Class.forName("com.mysql.jdbc.Driver");

4. What is the purpose of the "Connection" object in JDBC?
a) To execute SQL queries.
b) To represent a connection to the database.
c) To store the result of a database query.
d) To load the JDBC driver.
Ans: b) To represent a connection to the database.

5.  Which of the following is a NoSQL database?
a) MySQL
b) MongoDB
c) Oracle
d) SQL Server
Ans: b) MongoDB
Explanation: MongoDB is a NoSQL database that uses a document-oriented data model to store data. Unlike traditional relational databases like MySQL and SQL Server, MongoDB does not rely on tables and rows to organize and store data.

6. What is a MongoDB database?
a) A group of related collections
b) A group of related documents
c) A group of related tables
d) A group of related data values
Ans: a) A group of related collections
Explanation: A MongoDB database is a group of related collections. Each collection is stored in its own file, and multiple collections can be grouped together in a single database.

7. Which of the following code is used to get names of the parameters in servlet?
request.getParameterNames()
response.getParameterNames()
Header.getParameterNames()
None of the above.
Ans: a) request.getParameterNames()
Explanation: request.getParameterNames() returns an Enumeration of String objects containing the names of the parameters contained in this request

8. Which of the following code retrieves the context of the request?
new ClassContextPath()
request.getContextPath()
response.getContextPath()
None of the above.
Ans: b) request.getContextPath() 
Explanation: request.getContextPath() returns the portion of the request URI that indicates the context of the request.

9. Which Java package provides the classes and interfaces for servlets? 
a) java.net 
b) java.io 
c) javax.servlet 
d) java.lang
Ans: c) javax.servlet. 
Explanation: The javax.servlet package provides the classes and interfaces for servlets. It includes important classes such as Servlet, HttpServlet, HttpServletRequest, HttpServletResponse, and more.

10. What is the purpose of the RequestDispatcher interface in a servlet? 
a) To handle HTTP request headers 
b) To retrieve client cookies 
c) To forward or include requests to other resources 
d) To manage servlet configuration settings 
Ans: c) To forward or include requests to other resources. 
Explanation: The RequestDispatcher interface is used to forward or include requests to other resources, such as  servlets, JSP pages, or static files. 

MCQs on Java Application Development part-2 

Which of the following is not a core interface of Hibernate?
Configuration
Criteria
SessionManagement
Session
Ans: C
Explanation: SessionManagement is not a core interface of Hibernate. Configuration, Criteria, SessionFactory, Session, Query and Transaction are the core interfaces of Hibernate.

     2. SessionFactory is a thread-safe object.
True
False
Ans: A
Explanation: SessionFactory is a thread-safe object. Multiple threads can access it simultaneously.

     3. Which of the following methods returns a proxy object?
loadDatabase()
getDatabase()
load()
get()
Ans: C
Explanation: load() method returns proxy object. load() method should be used if it is sure that instance exists.

      4. Which of the following methods always hits the database?
load()
loadDatabase()
getDatabase()
get()
Ans: D
Explanation: get() method hits database always. Also, get() method does not return a proxy object.




    5. Which of the following methods is used inside the session only?
merge()
update()
end()
kill()
Ans: B
Explanation: update() method can only be used inside a session. update() should be used if the session does not contain persistent object.

   6. Which of the following is not a state of object in Hibernate?
Attached()
Detached()
Persistent()
Transient()
Ans: A
Explanation: Attached() is not a state of object in Hibernate. Detached(), Persistent() and Transient() are the only states in Hibernate.

 7. Which of the following is not an inheritance mapping strategy?
Table per hierarchy
Table per concrete class
Table per subclass
Table per class
Ans: D
Explanation: Table per class is not an inheritance mapping strategy.

 8. Which of the following is not an advantage of using Hibernate Query     Language?
Database independent
Easy to write query
No need to learn SQL
Difficult to implement
Ans: D
Explanation: HQL is easy to implement. Also, to implement HQL it is not dependent on a database platform.






 9. In which file database table configuration is stored?
.dbm
.hbm
.ora
.sql
Ans: B
Explanation: Database table configuration is stored in a .hbm file.

10. Which of the following is not an advantage of Hibernate Criteria API?
Allows to use aggregate functions
Cannot order the result set
Allows to fetch only selected columns of result
Can add conditions while fetching results
Ans: B
Explanation: addOrder() can be used for ordering the results.

11. What is the purpose of the Spring MVC module? 
To provide a web framework for building web applications 
To provide a data access framework for accessing databases 
To provide a caching framework for caching data 
To provide a security framework for securing web applications 
Ans: A

12. Different ways to inject Spring beans in Spring-based applications?
Constructor based
Setter based
Field-based
All of the above
Ans: D

 

class Student
{
    int age = 5;    // instance variable, non - static variable
    static String school;  // non - instance variable, static variable

    static 
    {
        school = "PW";
    }


    public void show()
    {
        System.out.println("in show " + age + " " + school); // static variable can be accessed in non-static method
    }
    public static void study()
    {
        System.out.println("studying ");    // non-static variable cannot be accessed here
    }
}

public class Demo
{

    static{
        System.out.println("in static block");
    }

    public static void main(String[] args) {
       
        System.out.println("in main method");

        Student obj = new Student();

        Student.study();
        obj.age = 19;
        obj.school = "PWSkills";
        
        Student obj1 = new Student();
        System.out.println(obj1.school);
       
        obj.show(); // in show 19 PWSkills
        obj1.show();    // in show 0 ?

    }    
}

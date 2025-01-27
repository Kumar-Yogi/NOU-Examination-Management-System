<%-- 
    Document   : changepassword
    Created on : Sep 19, 2023, 4:38:32 AM
    Author     : yogen
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="dbpack.DbManager"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Enquiry</title>
    <link rel="stylesheet" href="../CSS/bootstrap.css">
     <!--<link rel="stylesheet" href="CSS/style.css">--> 
    <script src="../JS/bootstrap.bundle.js"></script>
    <style>
        
  
  .page-name{
  height: 100px;
  /* border: 1px solid black; */
  color: #ffc107;
  /*background-color: #04014a;*/
    background: linear-gradient(60deg, #04014a 0% 27.5%, #ffc107 27.5% 28%, #04014a 28% 28.5%, #ffc107 28.5% 29%, #04014a 29% 100%);

  /* position: fixed; */
  /* position: fixed; */
}

.changepassword-menubar{
     height: 60px;
  /* border: 1px solid black; */
  color: #04014a;
  /*background-color: #04014a;*/
    background: linear-gradient(60deg, #ffc107 0% 29.9%, #04014a 29.9% 30.4%, #ffc107 30.4% 30.9%, #04014a 30.9% 31.4%, #ffc107 31.4% 100%);
}
 
  </style>
</head>
<body>    
    <div class="container-fluid ">
        <div class="row page-name">
            <div class="col-sm-12" style="display: flex; align-items: center; justify-content: center;">
                <h1 style="font-weight: bold;">STUDENTS INFORMATION</h1>
            </div>
        </div>
        
        <div class="row changepassword-menubar">
            <div class="col-sm-12 align-items-center pt-2">
                <span style="font-size: 25px; font-weight: 500; text-decoration: none; color: #04014a;" class="goback-btn"><a href="adminhome.jsp" style="text-decoration: none; color: #04014a;">Dashboard</a> >> <a style="color: #04014a;">Students</a></span>
            </div>
        </div>
        
        
        <div class="row mt-5">
                <div class="col-sm-12" style="min-height: 600px; overflow-x: scroll;">
                    <table class="table table-bordered" style="margin:auto; width: 90% font-size: 20px;">
                        <tr>
                            <th style="background-color: #04014a; color: #ffc107;">Roll No</th>
                            <th style="background-color: #04014a; color: #ffc107;">Name</th>
                            <th style="background-color: #04014a; color: #ffc107;">Father Name</th>
                            <th style="background-color: #04014a; color: #ffc107;">Mother Name</th>
                            <th style="background-color: #04014a; color: #ffc107;">Gender</th>
                            <th style="background-color: #04014a; color: #ffc107;">Address</th>
                            <th style="background-color: #04014a; color: #ffc107;">PROGRAM</th>
                            <th style="background-color: #04014a; color: #ffc107;">BRANCH</th>
                            <th style="background-color: #04014a; color: #ffc107;">YEAR</th>
                            <th style="background-color: #04014a; color: #ffc107;">Contact No</th>
                            <th style="background-color: #04014a; color: #ffc107;">Email Address</th>
                            <th style="background-color: #04014a; color: #ffc107;">Reg Date</th>
                        </tr>
                        
                        <%
                            DbManager dm=new DbManager();
        ResultSet rs=dm.select("select * from studentinfo");
        
        while(rs.next()){
        %>
        <tr>
            <td><%=rs.getString("rollno")%></td>
            <td><%=rs.getString("name")%></td>
            <td><%=rs.getString("fname")%></td>
            <td><%=rs.getString("mname")%></td>
            <td><%=rs.getString("gender")%></td>
            <td><%=rs.getString("address")%></td>
            <td><%=rs.getString("program")%></td>
            <td><%=rs.getString("branch")%></td>
            <td><%=rs.getString("year")%></td>
            <td><%=rs.getString("contactno")%></td>
            <td><%=rs.getString("emailaddress")%></td>
            <td><%=rs.getString("regdate")%></td>
                            
                        </tr>
                        
                        <% } %>
                    </table>
                </div>
            </div>

        
        
    </div>
</body>
</html>

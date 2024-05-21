<%--
  Created by IntelliJ IDEA.
  User: dinht
  Date: 5/21/2024
  Time: 10:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>

    <title>Danh sách khách hàng</title>
    <style>
        table{
            width: 100%;
            border-collapse: collapse;
        }

        table, th, td{
            border: 1px solid black;
        }

        th, td{
            padding: 15px;
            text-align: left;
        }

        img{
            width: 50px;
            height: 50px;
        }
    </style>
</head>
<body>

<h1>Danh sách khách hàng</h1>
<table>
    <tr>

        <th>Tên khách hàng</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>

    <c:forEach items="${customers}" var="customer" >
        <tr>

            <td>${customer.ten}</td>
            <td>${customer.ngaySinh}</td>
            <td>${customer.diaChi}</td>
            <td><img src=${customer.anh}></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>

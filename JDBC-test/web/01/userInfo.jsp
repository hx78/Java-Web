<%--
  Created by IntelliJ IDEA.
  User: linming
  Date: 2015/8/24 0024
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.lang.Math.*" %>
<%@ page import="java.io.*" %>
<html>
<head>
    <title>分页显示数据库信息</title>
</head>
<body>
<div align="center"><strong>分页显示数据库记录</strong></div>
<br>
<hr>
<table width="800" border="1" align="center">
    <tr>
        <td>ID</td>
        <td>用户名</td>
        <td>工作</td>
        <td>日期</td>
    </tr>
    <%
        try {
//驱动程序名
            String driverName = "com.mysql.jdbc.Driver";
//连接字符串
            String url = "jdbc:mysql://localhost:3306/test";
//加载驱动程序
            Class.forName(driverName).newInstance();
            Connection conn = DriverManager.getConnection(url, "root", "root");
//DriverManager.getConnection(ConnStr)
//创建执行语句
            String sql = "select * from table1";
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(sql);
            int intPageSize;      //一页显示的记录数
            int intRowCount;      //记录的总数
            int intPageCount;     //总页数
            int intPage;         //待显示的页码
            String strPage;
            int i;
//设置一页显示的记录数
            intPageSize = 2;
//取得待显示的页码
            strPage = request.getParameter("page");
//判断strPage是否等于null,如果是，显示第一页数据
            if (strPage == null) {
                intPage = 1;
            } else {
//将字符串转换为整型
                intPage = java.lang.Integer.parseInt(strPage);
            }
            if (intPage < 1) {
                intPage = 1;
            }
//获取记录总数
            rs.last();
            intRowCount = rs.getRow();
            System.out.println("intRowCount:" + intRowCount);
//计算机总页数
            intPageCount = (intRowCount + intPageSize - 1) / intPageSize;
//调整待显示的页码
            if (intPage > intPageCount) intPage = intPageCount;
            if (intPageCount > 0) {
//将记录指针定位到待显示页的第一条记录上
                rs.absolute((intPage - 1) * intPageSize + 1);
            }
//下面用于显示数据
            i = 0;
            while (i < intPageSize && !rs.isAfterLast()) {
                System.out.println(i);
    %>
    <tr>
        <td><%=rs.getInt("id")%>
        </td>
        <td><%=rs.getString("name")%>
        </td>
        <td><%=rs.getString("job")%>
        </td>
        <td><%=rs.getDate("date")%>
        </td>
    </tr>
    <%
            rs.next();
            i++;
        }
//关闭连接、释放资源
        rs.close();
        stmt.close();
        conn.close();
    %>
    <div align="center">
        共<%=intRowCount%>个记录，分<%=intPageCount%>页显示，当前页是：第<%=intPage%>页
        <%
            for (int j = 1; j <= intPageCount; j++) {
                out.print("&nbsp;&nbsp;<a href='userInfo.jsp?page=" + j + "'>" + j + "</a>");
            }
        %>
    </div>
    <%
        } catch (Exception e) {
            e.printStackTrace();
        }
    %>
</table>
</body>
</html>
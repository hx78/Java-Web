<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ page import="java.io.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.hx78.webapps._02.*" %>
<jsp:useBean id="pages" scope="page" class="com.hx78.webapps._02.strongSplitPage"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%!
    //显示每页的纪录数
    int pageSize = 10;
    String sqlStr = "";
    //当前页
    int showPage = 1;
%>
<%
    sqlStr = "select * from table1 order by id ";
    String strPage = null;
//获得跳转到的页面
    strPage = request.getParameter("showPage");
    if (strPage == null) {
        showPage = 1;
        pages.initialize(sqlStr, pageSize, showPage);
    } else {
        try {
            showPage = Integer.parseInt(strPage);
            pages.initialize(sqlStr, pageSize, showPage);
        } catch (NumberFormatException ex) {
            showPage = 1;
            pages.initialize(sqlStr, pageSize, showPage);
        }
        if (showPage < 1) {
            showPage = 1;
            pages.initialize(sqlStr, pageSize, showPage);
        }
        if (showPage > pages.getPageCount()) {
            showPage = pages.getPageCount();
            pages.initialize(sqlStr, pageSize, showPage);
        }
    }
//取得要显示的数据集合
    Vector vData = pages.getPage();
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312"/>
    <title>分页显示</title>
</head>

<body bgcolor="#ffffff" text="#000000">
<h1 align=center>个人基本信息</h1>

<div align=center>
    <table border="1" cellspacing="0" cellpadding="0" width="80%">
        <tr>
            <th width="20%">ID</th>
            <th width="20%">名字</th>
            <th width="20%">工作</th>
            <th width="40%">日期</th>
        </tr>
        <%
            for (int i = 0; i < vData.size(); i++) {
//显示数据数
                String[] sData = (String[]) vData.get(i);
        %>
        <tr>
            <td><%=sData[0]%>
            </td>
            <td><%=sData[1]%>
            </td>
            <td><%=sData[2]%>
            </td>
            <td><%=sData[3]%>
            </td>
        </tr>
        <%
            }
        %>
    </table>
    <p>

    <form action="word_list_javabean.jsp" method="get" target="_self">
        <p>共<font color=red><%=pages.getRowCount()%>
        </font>条 <%=pageSize%>条/页 第<font color=red><%=showPage%>
        </font>页/共<font color=red><%=pages.getPageCount()%>
        </font>页 [<a href="word_list_javabean.jsp?showPage=1" target="_self">首页</a>]
            <%
                //判断“上一页”链接是否要显示
                if (showPage > 1) {
            %>
            [<a href="word_list_javabean.jsp?showPage=<%=showPage-1%>" target="_self">上一页</a>]
            <%
            } else {
            %>
            [上一页]
            <%
                }
//判断“下一页”链接是否显示
                if (showPage < pages.getPageCount()) {
            %>
            [<a href="word_list_javabean.jsp?showPage=<%=showPage+1%>" target="_self">下一页</a>]
            <%
            } else {
            %>
            [下一页]
            <%
                }
            %>

            [<a href="word_list_javabean.jsp?showPage=<%=pages.getPageCount()%>" target="_self">尾页</a>] 转到
            <select name="select">
                <%
                    for (int x = 1; x <= pages.getPageCount(); x++) {
                %>
                <option value="<%=x%>"
                        <%
                            if (showPage == x) {
                                out.println("selected");
                            }
                        %> ><%=x%>
                </option>
                <%
                    }
                %>
            </select>
            页
            <input type="submit" name="go" value="提交"/>
        </p>
    </form>
    </p>
</div>
</body>
</html>     

package com.hx78.webapps._02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;

/**
 * Created by linming on 2015/8/24 0024.
 */
public class strongSplitPage {
    private Connection conn=null;
    private Statement stmt=null;
    private ResultSet rs=null;
    private ResultSetMetaData rsmd=null;
    //sql 查询语句
    private String sqlStr;
    //总纪录数目
    private int rowCount;
    //所分得逻辑页数
    private int pageCount;
    //每页显示的纪录数目
    private int pageSize;
    //定义表的列数目
    private int columnCount;
    private int irows;

    public void initialize(String sqlStr,int pageSize,int showPage)
    {
        this.sqlStr=sqlStr;
        this.irows=pageSize*(showPage-1);
        this.pageSize=pageSize;
        try
        {
            connectBean loginData=new connectBean();
            this.conn=loginData.getConn();
            this.stmt=this.conn.createStatement();
            this.rs=this.stmt.executeQuery(this.sqlStr);
            this.rsmd=this.rs.getMetaData();
            if(this.rs!=null)
            {
                this.rs.last();
                this.rowCount=this.rs.getRow();
                this.rs.first();
                this.columnCount=this.rsmd.getColumnCount();
                this.pageCount=(this.rowCount-1)/this.pageSize+1;
                this.rs.close();
                this.stmt.close();
            }
            this.sqlStr=this.sqlStr+" limit "+this.irows+","+this.pageSize;
            this.stmt=this.conn.createStatement();
            this.rs=this.stmt.executeQuery(this.sqlStr);
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public Vector getPage()
    {
        Vector vData=new Vector();
        try
        {
            if(this.rs!=null)
            {

                while(this.rs.next())
                {
                    String[] sData=new String[this.columnCount];
                    for(int j=0;j < this.columnCount;j++)
                    {
                        sData[j]=this.rs.getString(j+1);
                    }
                    vData.addElement(sData);
                }
                this.rs.close();
                this.stmt.close();
                this.conn.close();
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return vData;
    }

    //获得页面总数
    public int getPageCount()
    {
        return this.pageCount;
    }

    //获得数据表中总纪录数
    public int getRowCount()
    {
        return this.rowCount;
    }
}

package me.daiwei.handler;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.PreparedStatement;

public class MyBlobTypeHandler extends BaseTypeHandler<String> {

    private static final String DEFAULT_CHARSET = "utf-8";

    public void setNonNullParameter(PreparedStatement ps, int i,
            String parameter, JdbcType jdbcType) throws SQLException {
        ByteArrayInputStream bis;
        try {
            //把String转化成byte流
            bis = new ByteArrayInputStream(parameter.getBytes(DEFAULT_CHARSET));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Blob Encoding Error!");
        }
        ps.setBinaryStream(i, bis, parameter.length());
    }

    @Override
    public String getNullableResult(ResultSet rs, String columnName)
            throws SQLException {
        Blob blob = rs.getBlob(columnName);
        byte[] returnValue = null;
        if (null != blob) {
            returnValue = blob.getBytes(1, (int) blob.length());
        }
        try {
            //把byte转化成string
            return new String(returnValue, DEFAULT_CHARSET);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Blob Encoding Error!");
        }
    }

    public String getNullableResult(CallableStatement cs, int columnIndex)
            throws SQLException {
        Blob blob = cs.getBlob(columnIndex);
        byte[] returnValue = null;
        if (null != blob) {
            returnValue = blob.getBytes(1, (int) blob.length());
        }
        try {
            return new String(returnValue, DEFAULT_CHARSET);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Blob Encoding Error!");
        }
    }


    public String getNullableResult(ResultSet arg0, int arg1) throws SQLException {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public String getNullableResult(java.sql.CallableStatement arg0, int arg1) throws SQLException {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public void setNonNullParameter(java.sql.PreparedStatement arg0, int arg1, String arg2, JdbcType arg3) throws SQLException {
        // TODO 自動生成されたメソッド・スタブ

    }
}

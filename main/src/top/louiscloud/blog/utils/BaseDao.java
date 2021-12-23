package top.louiscloud.blog.utils;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName Java EE
 * @Description Java开发之框架基础技术
 * @Author Louis
 * @Date 2021/12/23 8:48
 * @Version IDEA 2021.1.2
 * @text 数据库连接工具类
 **/

public class BaseDao extends Statement {

      public BaseDao(Connection c, String catalog) throws SQLException {
            super(c, catalog);
      }

      @Override
      public ResultSet executeQuery(String sql) throws SQLException {
            return super.executeQuery(sql);
      }

      @Override
      public int executeUpdate(String sql) throws SQLException {
            return super.executeUpdate(sql);
      }
}

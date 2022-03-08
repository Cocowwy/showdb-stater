package cn.cocowwy.showdbcore.strategy.impl.mysql;

import cn.cocowwy.showdbcore.config.ShowDbFactory;
import cn.cocowwy.showdbcore.strategy.StructExecuteStrategy;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Cocowwy
 * @create 2022-03-03-21:57
 */
@Component
public class MySqlStructExecuteStrategy implements StructExecuteStrategy {
    /**
     * 表结构文档
     * @param tableName
     */
    public void tableDoc(String tableName) {

    }

    /**
     * 表名集合
     * @return
     */
    public List<String> tableNames() {
        List<String> showTables = ShowDbFactory.getJdbcTemplate()
                .query("show tables", (resultSet, i) -> resultSet.getObject(1, String.class));
        return showTables;
    }
}

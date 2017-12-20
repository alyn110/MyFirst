package alyn.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseDao {
    @Autowired
    protected SqlSessionTemplate sqlSessionTemplate;

    protected String namespace = "com.alyn.sql.";
}

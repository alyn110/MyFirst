package alyn.dao;

import org.springframework.stereotype.Repository;

@Repository
public class TransferDao extends BaseDao{

    public void getLimit(int limit){
        sqlSessionTemplate.selectOne(namespace + "transfer_getLimit");
    }
}

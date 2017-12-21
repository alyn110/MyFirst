package alyn.dao;

import alyn.model.Transfer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransferDao extends BaseDao{

    public List<Transfer> getAll(){
        return sqlSessionTemplate.selectList(namespace + "transfer_getAll");
    }

    public Transfer getById(Transfer transfer){
        return sqlSessionTemplate.selectOne(namespace + "transfer_getById", transfer);
    }

    public int update(Transfer transfer){
        return sqlSessionTemplate.update(namespace + "transfer_update", transfer);
    }

    public int insert(Transfer transfer){
        return sqlSessionTemplate.insert(namespace + "transfer_insert", transfer);
    }
}

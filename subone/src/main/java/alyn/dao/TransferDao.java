package alyn.dao;

import alyn.model.Transfer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransferDao extends BaseDao{

    public List<Transfer> getAll(){
        return sqlSessionTemplate.selectList(namespace + "transfer_getAll");
    }
}

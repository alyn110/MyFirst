package alyn.dao;

import alyn.model.Transfer;
import alyn.model.TransferSku;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransferSkuDao extends BaseDao{

    public List<TransferSku> getAll(){
        return sqlSessionTemplate.selectList(namespace + "transfer_sku_getAll");
    }

    public TransferSku getById(TransferSku transferSku){
        return sqlSessionTemplate.selectOne(namespace + "transfer_sku_getById", transferSku);
    }

    public int update(TransferSku transferSku){
        return sqlSessionTemplate.update(namespace + "transfer_sku_update", transferSku);
    }

    public int insert(TransferSku transferSku){
        return sqlSessionTemplate.insert(namespace + "transfer_sku_insert", transferSku);
    }
}

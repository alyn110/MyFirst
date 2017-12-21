package alyn.service;

import alyn.controller.AccessController;
import alyn.dao.TransferDao;
import alyn.dao.TransferSkuDao;
import alyn.model.Transfer;
import alyn.model.TransferSku;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestTransactionServiceImpl {

    private static Log logger = LogFactory.getLog(TestTransactionServiceImpl.class);

    @Autowired
    private TransferDao transferDao;
    @Autowired
    private TransferSkuDao transferSkuDao;

    @Transactional
    public void update(Transfer transfer, TransferSku transferSku){
        transferDao.insert(transfer);
        Transfer newTransfer = transferDao.getById(transfer);
        newTransfer.setQty(10);
        transferDao.update(newTransfer);

        update2(transferSku);
        logger.info("3333");
    }

    public void update2(TransferSku transferSku){
        transferSkuDao.update(transferSku);
        logger.info(transferSku);
    }

}

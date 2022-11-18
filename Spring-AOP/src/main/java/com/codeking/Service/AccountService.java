package com.codeking.Service;

import com.codeking.Dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : codeking
 * @date : 2022/11/17 21:45
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ,rollbackFor = Exception.class,timeout = 10)
public class AccountService {
    @Autowired
    private AccountDao accountDao;

    public void accountMoney() {
        accountDao.addMoney();
        //int amount = 10/0;
        accountDao.reduceMoney();
    }
}

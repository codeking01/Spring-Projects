package com.codeking.Service;

import com.codeking.Dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : codeking
 * @date : 2022/11/17 21:45
 */
@Service
public class AccountService {
    @Autowired
    private AccountDao accountDao;

    public void accountMoney() {
        accountDao.addMoney();
        accountDao.reduceMoney();
    }
}

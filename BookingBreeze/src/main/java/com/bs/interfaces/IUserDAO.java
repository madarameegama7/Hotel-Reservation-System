package com.bs.interfaces;

import com.bs.model.User;

public interface IUserDAO {

    public boolean insertDatauser(User user);
    public boolean updateDatauser(User user);
    public boolean deleteDatauser(int userID);
}

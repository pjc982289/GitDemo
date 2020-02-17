package com.pjc.study.proxy1227;

public interface UserDao {

    /**
     * @param user
     * @return
     */
    boolean save(User user);

    /**
     * @param user
     * @return
     */
    boolean delete(User user);

}

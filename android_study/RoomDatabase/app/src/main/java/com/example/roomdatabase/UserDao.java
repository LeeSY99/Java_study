package com.example.roomdatabase;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface UserDao {
    @Insert
    void setInsertUser(User user);

    @Update
    void setUpdateuser(User user);

    @Delete
    void setDeleteuser(User user);

    @Query("SELECT * FROM User")
}

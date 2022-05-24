package com.example.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private UserDao nUserDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserDatabase database = Room.databaseBuilder(getApplicationContext(),UserDatabase.class,"lee_db")
                .fallbackToDestructiveMigration()   //데어터 버젼 변경 가능
                .allowMainThreadQueries()           //메인쓰레드 db에 인풋 아웃풋 가능하게 함
                .build();

        nUserDao=database.userDao();

        User user=new User();
        user.setName("leesangyoun");
        user.setAge("24");
        user.setPhonenumber("10242348325412");
        nUserDao.setInsertUser(user);

        List<User> userlist = nUserDao.getUserall();
        for (int i = 0; i <userlist.size() ; i++) {
            Log.d("test",userlist.get(i).getName() +" "
            +userlist.get(i).getAge()+" "
            +userlist.get(i).getPhonenumber());

        }

//        User user2=new User();
//        user2.setId(1);
//        user2.setName("llllfix");
//        user2.setAge("21");
//        user2.setPhonenumber("987654321");
//        nUserDao.setInsertUser(user2);

    }

    User user3=new User();
    user3.setID(2);
    nUserDao.setDeleteUser(user3);
}
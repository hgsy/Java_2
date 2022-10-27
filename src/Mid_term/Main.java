package Mid_term;

import java.sql.SQLOutput;

public class Main {

    public static void main(String []args){

        UserUp1 u1 = new UserUp1();
        UserUp1 u2 = new UserUp1();
        UserUp1 u3 = new UserUp1();
        UserUp1 u4 = new UserUp1();
        UserUp1 u5 = new UserUp1();

        UserUp1[] uList = {u1,u2,u3,u4,u5};

        UserDaoImpl userD = new UserDaoImpl(uList);

        for(int i=0;i< uList.length;i++){
            String id = "a" + (i+1);
            int num = i+1;
            uList[i].setId(id);
            uList[i].setPw("p" + num);
            uList[i].setEmail(id + "@g.com");
            uList[i].setPhNum("01" + num);
        }

        for(int i = 0;i < uList.length;i++){
            String id = uList[i].getId();
            String pw = uList[i].getPw();
            String email = uList[i].getEmail();
            String phnum = uList[i].getPhNum();

            System.out.printf(
                    "=================\n" +
                            "index[%s]\n" +
                            "mId: %s\n" +
                            "mPw: %s\n" +
                            "mEmail: %s\n" +
                            "mPhNum: %s\n" +
                            "=================\n",
                    i, id, pw, email, phnum
            );

        }

    }

}

package Kw_work.work_5;

import Kw_work.work_2.NotExistIDException;

public class Check_ID {
    public void checkID(String id) throws NotUseld {

        int code = (int)(id.charAt(0));

        if( id.length() >= 8 && ( (65 <= code && code <= 90) || (97 <= code && code < 122) ) ){
            System.out.println(id + "는 사용 가능한 아이디");
        }else {
            throw new NotUseld();
        }
    }
}

class NotUseld extends Exception{
//    NotUseld(String message){
//        super(message);
//    }
}

package Kw_work.work_4;

import Kw_work.work_2.NotExistIDException;

public class SearchArray {

    public static void main(String[] args){
        int[] i = {1,2,3,4,5,6};

        try{
            searchArray(i, 7);
        }catch (NotFoundException e){
            System.out.println("배열에서 찾을 수 없습니다.");
        }
    }

    public static int searchArray(int[] array, int n) throws NotFoundException{

        int index = -1;

        for(int i=0;i<array.length;i++){
            if(array[i]==n){
                index = i;
            }
        }

        if(index == -1){
            throw new NotFoundException("배열에서 찾을 수 없습니다.");
        }

        return index;
    }
}

class NotFoundException extends Exception{
    NotFoundException(String message){
        super(message);
    }
}

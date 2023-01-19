package com.kampus;

class search{
    int[] array;

    search(int[] array){
        this.array = array;
    }

    boolean isContaints(int x){
        boolean check = false;
        for (int i = 0; i < this.array.length; i++) {
            if(this.array[i] == x){
                check = true;
                break;
            }
            else{
                check = false;
            }
        }
        return check;
    }

    int index(int x){
        int check = 0;
        for (int i = 0; i < this.array.length; i++) {
            if(this.array[i] == x){
                check = i;
                break;
            }
            else{
                check = -1;
            }
        }
        return check;
    }

    


}





public class Searching {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {0, 1, 3, 4, 5, 6, 10};

        search obj1 = new search(array1);
        search obj2 = new search(array2);
        
        
        System.out.println(obj1.isContaints(0));     
        
        System.out.println(obj2.index(6));
        
        

    }

    
}

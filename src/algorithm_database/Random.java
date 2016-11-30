/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithm_database;

/**
 *
 * @author zhengchao
 */
public class Random {
    
    public static int randTo5(){
        return (int) (Math.random() * 5) + 1;
    }
    
    public static int randTo7(){
        int num = 0;
        do{
            num = (randTo5()-1) * 5+randTo5()-1;
        }while(num>20);  //我们一直do while直到产生一个0到20之间的随机数。并且产生0-20的概率都相同
        
        return num%7+1;
    }
    
    public static void main(String[] args){
        
        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        int x4 = 0;
        int x5 = 0;
        int x6 = 0;
        int x7 = 0;
        
        for(int i=0; i<100000;i++){
            int randTo = randTo7();
            
            if(randTo==1){
                x1++;
                continue;
            }
            if(randTo==2){
                x2++;
                continue;
            }
            if(randTo==3){
                x3++;
                continue;
            }
            if(randTo==4){
                x4++;
                continue;
            }
            if(randTo==5){
                x5++;
                continue;
            }
            if(randTo==6){
                x6++;
                continue;
            }
            if(randTo==7){
                x7++;
            }
        }
        System.out.print(x1+"_"+x2+"_"+x3+"_"+x4+"_"+x5+"_"+x6+"_"+x7); 
    }
}

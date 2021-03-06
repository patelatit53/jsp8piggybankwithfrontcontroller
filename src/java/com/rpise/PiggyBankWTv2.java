package com.rpise;
/**
 * @author Rajesh Patkar
 */
public class PiggyBankWTv2 {
    private int balance;
    private int tcount;
    private int[]  lt;
    private int size;
    private int count;
    public PiggyBankWTv2(){
        lt = new int[10];
        size = 10;
    }
    public PiggyBankWTv2(int v){
        lt = new int[v];
        size = v;
    }
    public int getBalance(){
        return balance;
    }
    public int getTransactionCount(){
        return tcount;
    }
    public void setDeposit(int v){
        deposit(v);
    }
    public void setWithdraw(int v){
        withdraw(v);
    }
    public void deposit(int v){
        balance = balance + v;
       saveTransaction(v);         
    }
    public void withdraw(int v){
        if(balance >= v){
            balance = balance - v;
            saveTransaction(-v);   
        }
    }
    private void saveTransaction(int v){
        if(count == size){
            for(int i=0; i<lt.length-1; i++){
                lt[i] = lt[i+1];
            }
            lt[size-1] = v;
        }
        else
        {
            lt[count++]=v;
        }
        tcount++;
    }
    public String getStatement(){
         String statement = "";
         for(int v : lt){
             statement = statement + v + ",";
         }
         return statement;
    }
    
    public int getLastTransaction(){
         if(count == 0) return -1;
        return lt[count-1];
    }
}

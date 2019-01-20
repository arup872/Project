/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticmember;

/**
 *
 * @author Acer
 */
public class StaticMember {

    /**
     * @param args the command line arguments
     */
    int x = 9;              //instace variable
    static int y = 10;      // static variable
    void fun(int z)
    {
        int m;
        m=13;
        System.out.println(z);
        System.out.println(m);
    }
    static void fun1()          // static function
    {
        System.out.println(y);        // static function always have static variable
    }
    public static void main(String[] args) {
        StaticMember sm = new StaticMember();
        sm.fun(12);              // instance function call by class object
        StaticMember.fun1();     //static function call by class name
        
    }
    
}

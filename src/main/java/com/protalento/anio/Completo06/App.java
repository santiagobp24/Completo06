package com.protalento.anio.Completo06;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( 1+2 );// 2-master 3 master
        
        
        System.out.println( 1+2 );//1-pre-prod
        
        System.out.println( 1+2 );//2-pre-prod
        
        System.out.println( 1+2 );//1-develop
        
        System.out.println( 1+2 );//1-feature2
        System.out.println( 1+2 );//2-feature2 3-feature2
        System.out.println( 1+2 );//2-develop 3-develop
        
        System.out.println( 1+2 );//1-feature1
        System.out.println( 1+2 );//2-feature1 2-feature23
        
        System.out.println( 1+2 );// hotfix
    }
}

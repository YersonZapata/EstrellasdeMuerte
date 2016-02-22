/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubicaestrellas;

import java.util.Scanner;

public class Sky {
    
    public Sky() {
    }
    
    private int filas,columnas;
    private int [][] mapa;
    
    public void SetDimensiones(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese las filas: ");
        filas=entrada.nextInt(); 
        //System.out.print(" \t");
        System.out.println("Ingrese las columnas: ");
        columnas=entrada.nextInt();
       
    }
    //.................................
   public void SetDatos(){
       Scanner sc = new Scanner(System.in);
       int [][]matfuncion=new int[filas][columnas];
        System.out.println("Llene los datos por filas");
            for(int i=0;i<=this.filas-1;i++){
                for (int j=0;j<=this.columnas-1;j++){
                    System.out.print("Elemento[" + i + "][" + j + "]= ");
                    matfuncion[i][j]=sc.nextInt();
                }
            }
            mapa=matfuncion;
            
            System.out.print("Imprimiendo mapa ......\n\n");
            
            for(int i=0;i<=filas-1;i++){
                for (int j=0;j<=columnas-1;j++){
                    System.out.print(mapa [i] [j]+"\t");
                }
                System.out.print("\n");
            }
   }
   //.............................................
   
   public void UbicarEstrellas(){
       
       String [][]estrellas=new String[filas+2][columnas+2];
       int [][]bordes=new int[filas+2][columnas+2];
       
    for(int i=1;i<=filas;i++){
        for (int j=1;j<=columnas;j++){
            bordes[i][j]=mapa[i-1][j-1];
        }
    }
    
    System.out.print("Imprimiendo mapa con bordes ......\n\n");
    for(int i=0;i<=filas+1;i++){
                for (int j=0;j<=columnas+1;j++){
                    System.out.print(bordes [i] [j]+"\t");
                }
                System.out.print("\n");
            }
    
 
    for(int i=1;i<=filas;i++){
                for (int j=1;j<=columnas;j++){
                    if((bordes[i][j]+bordes[i+1][j]+bordes[i-1][j]+bordes[i][j+1]+bordes[i][j-1])/5>10){
                        estrellas[i][j]="*";}
                        else{
                                estrellas[i][j]="-";
                                }
                    
                }
                
            }
    
           for(int i=0;i<=filas+1;i++){
                 for (int j=0;j<=columnas+1;j++){
                        if((j==0 || j==columnas+1)&&(i>0 && i<(filas+1))){
                            String cadena = "";
                            cadena = String.valueOf(i);
                            estrellas[i][j]=cadena;}
                        else if((i==0 || i==filas+1)&&(j>0 && j<(columnas+1))){
                            String cadena = "";
                            cadena = String.valueOf(j);
                            estrellas[i][j]=cadena;}
                        
                       }
          }
           estrellas[0][0]=" ";estrellas[filas+1][0]=" ";estrellas[columnas+1][filas+1]=" ";estrellas[0][columnas+1]=" ";
           System.out.print("Imprimiendo ESTRELLAS ......\n\n");
    for(int i=0;i<=filas+1;i++){
                for (int j=0;j<=columnas+1;j++){
                    System.out.print(estrellas [i] [j]+"\t");
                }
                System.out.print("\n  VERSION 1.0");
            }
    
    


    }
   
}
          

 
            
    



    
   
    
    
  


package com.company;

public class CPU {
    public String nama;
    public int kecepatan;


    public CPU(String nama,int kecepatan){
        this.nama=nama;
        this.kecepatan=kecepatan;
    }
    public String getCPUDAta(){
        return(this.nama+" "+this.kecepatan+" GHZ");
    }
}

package com.daicent.main.coutFile;

import java.io.File;

public class Test {
    public static long fileGetSize(String name){
        File file=new File(name);
        if (!file.exists()|| !file.isFile()){
            System.out.println("file ko tồn tại");
            return -1;
        }
        return file.length();
    }

    public static void main(String[] args) {
        long size= fileGetSize("D:\\test_Flinters\\demoFile\\src\\demo.txt");
        System.out.println("so ky tu trong file = " + size);
    }
}

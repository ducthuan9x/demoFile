package com.daicent.bigFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public void writerToFile() throws IOException {
        FileWriter fw = new FileWriter("D:\\test_Flinters\\demoFile\\src\\demo.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        Random rd=new Random();
        for (int i = 0; i < 500000; i++) {
            bw.write(rd.nextInt(500000)+"Lê Đức Thuận");
            bw.newLine();
        }
        bw.close();
        fw.close();
    }
    public List<String>readFromFile() throws IOException {
        List<String> list = new ArrayList<>();
        FileReader rd=new FileReader("D:\\test_Flinters\\demoFile\\src\\demo.txt");
        BufferedReader br=new BufferedReader(rd);
        String line= "";
        while (true){
            line=br.readLine();
            if(line==null){
                break;
            }
            list.add(line);
        }
        return list;
    }
    public static long fileGetSize(String name){
        File file=new File(name);
        if (!file.exists()|| !file.isFile()){
            System.out.println("file ko tồn tại");
            return -1;
        }
        return file.length();
    }

    public static void main(String[] args) throws IOException {
        Main m=new Main();
//        m.writerToFile();
        List<String>list=m.readFromFile();
        for (String s:list) {
            System.out.println(s);
        }
        long size= fileGetSize("D:\\test_Flinters\\demoFile\\src\\demo.txt");
        System.out.println("so ky tu trong file = " + size );

    }
}

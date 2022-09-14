package com.daicent.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterFile {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw= new BufferedWriter(new FileWriter("part"));
        bw.write("Le duc thuan");
        bw.close();
        System.out.println("thành công");
    }
}

package com.example.scacchitps;

import java.io.*;

public class ConsoleInput {

    BufferedReader reader;

    public ConsoleInput() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public int readInt() throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    public double readDouble() throws IOException {
        return Double.parseDouble(reader.readLine());
    }

    public String readStr() throws IOException {
        return reader.readLine();
    }

}

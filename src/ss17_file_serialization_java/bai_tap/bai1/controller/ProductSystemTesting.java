package ss17_file_serialization_java.bai_tap.bai1.controller;

import ss17_file_serialization_java.bai_tap.bai1.models.Product;
import ss17_file_serialization_java.bai_tap.bai1.services.ProductManager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductSystemTesting {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        ProductSystem productSystem = new ProductSystem(productManager,"E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\ss17_file_serialization_java\\bai_tap\\bai1\\controller\\data.txt");
        productSystem.displaySystem();
    }
}

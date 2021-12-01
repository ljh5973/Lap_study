package edu.java.file07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import edu.java.file06.Product;

public class FileMain07 {

	public static void main(String[] args) {
		
		//1 . ArrayList<Product> 생성해서 파일에 write.
		try (FileOutputStream out = new FileOutputStream("data/product_list.dat");
				BufferedOutputStream bout= new BufferedOutputStream(out);
				ObjectOutputStream oos= new ObjectOutputStream(bout);){
			// 파일에 저장할 ArrayList<Product> 생성
			ArrayList<Product> list= new ArrayList<>();
			
			
			// ArrayList에 Prodcut객체 1000개를 저장
			for(int i=0; i<1000; i++) {
				Product p = new Product((i+1), "Product_"+(i+1), 1000);
				list.add(p);
			}
			
			long start= System.currentTimeMillis();
			oos.writeObject(list);
			long end=System.currentTimeMillis();
			
			System.out.println("쓰기 경과 시간 : "+ (end-start)+"ms");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// 2. 파일에서 ArrayList<Product> 객체를 read.
		
		try(FileInputStream in = new FileInputStream("data/product_list.dat");
				BufferedInputStream bin=new BufferedInputStream(in);
				ObjectInputStream ois= new ObjectInputStream(bin)){
			long start=System.currentTimeMillis();	//읽기 시작 시간
			Object obj=ois.readObject();

			long end=System.currentTimeMillis();	//읽기 종료 시간
					
			System.out.println("읽기 경과 시간 : "+ (end-start)+"ms");
			
			if(obj instanceof ArrayList<?>) {
				ArrayList<Product> list = (ArrayList<Product>) obj;	
				System.out.println(list.get(0));
				System.out.println(list.get(list.size()-1));
			}
			
			
			
		}catch(Exception e) {
			
		}
	}
}

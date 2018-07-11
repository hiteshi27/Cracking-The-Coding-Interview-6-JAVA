package practiceExamples;
import java.io.*;
public class FileInputOutput {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		copyByteStream();
		copyCharStream();

	}
	public static void copyByteStream()throws IOException{
		//Java Byte streams are used to perform input and output of 8-bit bytes
		FileInputStream in = null;
		FileOutputStream out = null;
		FileOutputStream out1 = null;
		try{
			in=new FileInputStream("sample.txt");
			out=new FileOutputStream("sampleout.txt");
			out1=new FileOutputStream("sampleout2.txt");
			byte[] b=new byte[11];
			in.read( b, 0, 10);
			out1.write( b, 0, 10);
			int c;
			while((c=in.read())!=-1){
				out.write(c);
			}
		}catch(IOException io){
			System.out.println("\n fail !");
		}finally{
			if(in!=null)
				in.close();
			if(out!=null)
				out.close();
			if(out1!=null)
				out1.close();
			System.out.println("\n success !");

		}
		
	}
	public static void copyCharStream()throws IOException{
		//Java Character streams are used to perform input and output for 16-bit unicode
		FileReader in=null;
		FileWriter out=null;
		try{
			in=new FileReader("sampleout.txt");
			out=new FileWriter("sampleout1.txt");

			int c;
			while((c=in.read())!=-1){
				out.write(c);
			}
		}catch(IOException io){
			System.out.println("\n fail !");
		}finally{
			if(in!=null)
				in.close();
			if(out!=null)
				out.close();
			System.out.println("\n success !");
		}
	}

}

import java.io.*;
class createFile{
	public static void main(String[] args)throws IOException{
		File f1= new File("storage\\Java_prob\\file_handling\\file1.txt");
		if(f1.createNewFile()){
			System.out.println("File created..");
		}else{
			System.out.println("File already exists..");
		}
		System.out.println(f1.length());
	}
}

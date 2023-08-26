package DB.connections;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class FileDownloader {
	public static void main(String[] args) {
		
		for(int i=4765;i<4766;i++)
		{
			FileDownloader(i+"-JLP2020-1.jpg",i,true);
		}
		
		dowloadThereDetails("3");
		
		
	}

	/*
	 * private static void down1(){ CloseableHttpClient httpclient =
	 * HttpClients.createDefault(); HttpGet httpGet = new
	 * HttpGet("http://www.fetagracollege.org"); CloseableHttpResponse response1 =
	 * httpclient.execute(httpGet); try {
	 * System.out.println(response1.getStatusLine()); HttpEntity entity1 =
	 * response1.getEntity(); String content = EntityUtils.toString(entity1);
	 * System.out.println(content); } finally { response1.close(); } }
	 */
	
	private static void dowloadThereDetails(String path) {
		
		String abspath="D:\\Personal Data Sagar_varade\\photo\\docs\\" + path+".txt";
		
		try (BufferedInputStream inputStream = new BufferedInputStream(
				new URL("https://www.levanavyuvaksangh.com/getresult-female-ser.php?page="+path).openStream());) {
			createFile(abspath);
			FileOutputStream fileOS = new FileOutputStream(abspath);
			byte data[] = new byte[1024];
			int byteContent;
			while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
				fileOS.write(data, 0, byteContent);
			}
			fileOS.close();
			
		} catch (IOException e) {
			// handles IO exceptions
			e.printStackTrace();
		}
		
	}

	private static void FileDownloader(String fileName,int id,boolean goForanother) {
		try (BufferedInputStream inputStream = new BufferedInputStream(
				new URL("https://www.levanavyuvaksangh.com/members/" + fileName).openStream());) {
			String absPath="D:\\Personal Data Sagar_varade\\photo\\images\\" + fileName;
			createFile(absPath);
			FileOutputStream fileOS = new FileOutputStream(absPath);
			byte data[] = new byte[1024];
			int byteContent;
			while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
				fileOS.write(data, 0, byteContent);
			}
			fileOS.close();
			if(goForanother) {
				FileDownloader(id+"-JLP2020-2.jpg",id,false);
				FileDownloader(id+"-JLP2020-3.jpg",id,false);
			}
		} catch (IOException e) {
			// handles IO exceptions
			e.printStackTrace();
		}

	}

	private static void createFile(String fileName) {
		File fl = new File(fileName);
		if (fl.exists()) {

		} else {
			try {
				fl.createNewFile();
				System.out.println(" File not exist created " + fileName);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}

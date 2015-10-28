/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 * 	|_ SaveImageFromUrl
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 26.
 * </pre>
 * 
 * @author : 최재혁
 * @version : 1.0
 */
public class SaveImageFromUrl {

	public static void main(String[] args) {
		String imageUrl = "http://movie.phinf.naver.net/20151014_112/1444802557577pCaPD_JPEG/movie_image.jpg";

		try {
			URL url = new URL(imageUrl);

			try (InputStream is = url.openStream();
					OutputStream os = new FileOutputStream("files/martian.jpg")) {

				byte[] buf = new byte[100];
				int result;

				while ((result = is.read(buf)) != -1) {
					os.write(buf, 0, result);
				}
				System.out.println("파일 생성 완료!");
			}
			// 파일에 write하기
			catch (Exception e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		catch (Exception e) {
			// TODO: handle exception

		}

	}

}

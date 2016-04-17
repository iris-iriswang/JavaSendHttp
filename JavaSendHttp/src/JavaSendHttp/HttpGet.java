package JavaSendHttp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**@author iris*/
public class HttpGet {

	public HttpGet() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean sendGet(String strUrl){
		
		
		try {

			URL obj = new URL(strUrl);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			// optional default is GET
			con.setRequestMethod("GET");
			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + strUrl);
			System.out.println("Response Code : " + responseCode);
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			con.disconnect();
			
			//print result
			System.out.println(response.toString());
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			return false;
		}finally{
		}
				
	}
}

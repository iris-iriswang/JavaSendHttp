package JavaSendHttp;

public class Main {

	public static void main(String[] args) {
		HttpGet httpget = new HttpGet();
		httpget.sendGet("url + get-Parameters");
		HttpPost httppost = new HttpPost();
		httppost.sendPost("url",  "post-Parameters");
	}

}

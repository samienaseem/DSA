//The process of initiating an action on a server is done through HTTP requests which are messages sent by the client. The two most commonly used HTTP requests are GET and POST. This task involves validating requests and parsing URL parameters as a comma-separated string. Authentication tokens for both GET and POST requests are sent as a URL parameter named "token". For validation of authentication, the tokens must be in a set of valid authentication tokens. In the case of a POST request, a CSRF (cross-site request forgery) token must also be provided. A POST request is considered valid if its authentication token is valid and its CSRF token is an alphanumeric value consisting only of lowercase letters and/or numbers with a minimum length of 8. Once a request is validated, the URL parameters must be parsed as a comma-separated string.
//
//URL parameters are identified by the portion of the URL that comes after a question mark (?). They consist of a key and a value, separated by an equal sign (=). Multiple parameters are separated by an ampersand (&).
//
//Implementation: Implement a request parser prototype. Given an array of strings, valid_auth_tokens, representing the valid authentication tokens, and a 2D array of strings, requests, representing the request types and URLs, for each request, return the request status ("VALID" or "INVALID"). If VALID, include a comma-separated string of parameters, i.e., "VALID,<param1_key>=<param1_value>,<param2_key>=<param2_value>".
//
//Example:
//valid_auth_tokens:
//
//["ah37j2ha483u", "sahf34ywb0p5", "ba34wyi8t902"]
//requests:
//
//["GET", "https://example.com/?token=347sdy6ky8iu2&name=alex"]
//["GET", "https://example.com/?token=sahf34ywb0p5&name=sam"]
//["POST", "https://example.com/?token=sahf34ywb0p5&name=alex"]
//["POST", "https://example.com/?token=sahf34ywb0p5&csrf=ak2sh32dy&name=chris"]
//In the first request, the auth_token = 347sdy6ky8iu2, which is not in the list of given tokens, so the request is INVALID. The string to be returned is "INVALID".
//
//In the second request, the auth_token = sahf34ywb0p5, which is in the list of valid tokens, so the request is VALID. The request parameters are - name = sam. The string to be returned is "VALID,name=sam".
//
//In the third request, the auth_token = sahf34ywb0p5, which is in the list of valid tokens, so the request is VALID. However, since it is a POST request, a CSRF token is required but not provided, making the request INVALID. The string to be returned is "INVALID".
//
//In the fourth request, both the auth_token and CSRF token are provided and valid. The request parameters are - name = chris. The string to be returned is "VALID,name=chris".

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetPostQuestion {
	
	public static void main(String[] args) {
		
		List<String> valid_auth_tokens=new ArrayList<String>();
		valid_auth_tokens.add("ah37j2ha483u");
		valid_auth_tokens.add("sahf34ywb0p5");
		valid_auth_tokens.add("ba34wyi8t902");
		
		String req1="[\"GET\", \"https://example.com/?token=347sdy6ky8iu2&name=alex\"]";
		String req2="[\"GET\", \"https://example.com/?token=sahf34ywb0p5&name=sam\"]";
		String req3="[\"POST\", \"https://example.com/?token=sahf34ywb0p5&name=alex\"]";
		String req4="[\"POST\", \"https://example.com/?token=sahf34ywb0p5&csrf=ak2sh32dy&name=chris\"]";
			
		ArrayList<String> requests=new ArrayList<>();
		requests.add(req1);
		requests.add(req2);
		requests.add(req3);
		requests.add(req4);
		
		
		
		getResponse(valid_auth_tokens,requests);
		
	}
	
	public static void getResponse(List<String> auth_tokens,List<String> request) {
		
		for(String req:request) {
			
			String[] params=req.split(",");
			getToken(params[1]);
		}
		
	}

	private static void getToken(String url) {
		
		Map<String, String> data=new HashMap<>();
		String[] params=url.split("\\?");
		
		String query=params[1];
		
		String[] pairs=query.split("&");
		
		for(String pair:pairs) {
			int idx=pair.indexOf("=");
			data.put(pair.substring(0, idx), pair.substring(idx+1));
			
		}
		System.out.println(data);
		
		
	}

}

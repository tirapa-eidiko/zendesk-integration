package com.bitbucketflow;


import org.json.JSONObject;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class GetSparkUserProfile {
	
	
	public JSONObject getSparkUserProfile(String accessToken){
		
		
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
		  .url("https://api.ciscospark.com/v1/people/me")
		  .get()
		  .addHeader("authorization", "Bearer " + accessToken.trim())
		  .addHeader("cache-control", "no-cache")
		  .build();

		Response response = null;
		JSONObject json= null;
try{
		 response = client.newCall(request).execute();
		 
		 
		 System.out.println("ResponseCode: "+response.code()+" ResponseMessage: "+response.message());
		  if(response.code() == 200){
		   String s = new String(response.body().bytes());
		   System.out.println(s);
		   json = new JSONObject(s);
		  }
		 
	
}catch(Exception e){ 
	System.out.println("Raised Exception"+e);
	
}
		
		return json;
		
	}
	
	
	
public JSONObject getBitbucketRepos(String accessToken, String user){
		
	OkHttpClient client = new OkHttpClient();
Request request = new Request.Builder()
  .url("https://api.bitbucket.org/2.0/repositories/"+user.trim())
  .get()
  .addHeader("authorization", "Bearer " + accessToken.trim())
  .addHeader("cache-control", "no-cache")
  .build();

		Response response = null;
		JSONObject json= null;
try{
		 response = client.newCall(request).execute();
		 
		 
		 System.out.println("ResponseCode: "+response.code()+" ResponseMessage: "+response.message());
		  if(response.code() == 200){
		   String s = new String(response.body().bytes());
		   System.out.println(s);
		   json = new JSONObject(s);
		  }
		 
	
}catch(Exception e){ 
	System.out.println("Raised Exception"+e);
	
}
		
		return json;
		
	}
	
	


public JSONObject getAccessToken(String code,String clientId, String sectet){

    
    OkHttpClient client = new OkHttpClient();
   
    MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
    RequestBody body = RequestBody.create(mediaType, "client_id="+clientId.trim()+"&client_secret="+sectet.trim()+"&code="+code.trim()+"&grant_type=authorization_code&=");
    Request request = new Request.Builder()
      .url("https://bitbucket.org/site/oauth2/access_token")  
      .post(body)
      .addHeader("cache-control", "no-cache")
      .addHeader("content-type", "application/x-www-form-urlencoded")
      .build();
    Response response = null;
    JSONObject json= null;
try{
     response = client.newCall(request).execute();
     
     
     System.out.println("ResponseCode: "+response.code()+" ResponseMessage: "+response.message());
      if(response.code() == 200){
       String s = new String(response.body().bytes());
       System.out.println(s);
       json = new JSONObject(s);
       System.out.println("Access Token : "+json.get("access_token"));
       System.out.println("Refresh Token : "+json.get("refresh_token"));
      }
     

}catch(Exception e){ 
System.out.println("Raised Exception"+e);

}
    
    return json;
    
}

	
	
	

}

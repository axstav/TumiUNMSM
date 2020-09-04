package com.tumi.service;

import java.io.File;
import java.io.IOException;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tumi.client.Quote;
import com.tumi.dao.IVisionPersonaQuecDAO;
import com.tumi.dto.VisionPersonaQuec;

import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


@Service
public class VisionPersonaQuecServiceImpl implements IVisionPersonaQuecService {

	private static final Logger log = LoggerFactory.getLogger(VisionPersonaQuecServiceImpl.class);
	
	@Autowired
	IVisionPersonaQuecDAO iVisionPersonaQuecDAO;

	@Autowired
	RestTemplate restTemplate;
	
	@Bean
	public RestTemplate rest() {
		return new RestTemplate();
	}
	/*
	public String getTranscriptor() {
		
		String resultado = "";
		OkHttpClient client = new OkHttpClient().newBuilder().build();
		//OkHttpClient client = new OkHttpClient();	
		//application/octet-stream
		//audio/x-wav
		RequestBody requestBody = new MultipartBody.Builder()
				  .setType(MultipartBody.FORM)
				  .addFormDataPart("files","/C:/Users/ALEXIS/Downloads/punoondaazul2017Nov23A_16-117.wav",
					RequestBody.create(MediaType.parse("application/octet-stream"),new File("/C:/Users/ALEXIS/Downloads/punoondaazul2017Nov23A_16-117.wav")))
				  .build();		

		Request request = new Request.Builder()
			  .url("http://18.218.29.107:5000/upload")
			  .method("POST",requestBody)
			  .build();

		Call call = client.newCall(request);
			  
		Response responses = null;
		try {
			responses = call.execute();
		} catch (Exception e) {
			log.error(e.toString());
			e.printStackTrace();
		}
		

	    String jsonData = null;
		try {
			jsonData = responses.body().string();
		} catch (Exception e) {

		}
	    JSONObject jsonObject = new JSONObject(jsonData);
	    resultado = jsonObject.getString("text_source");			    
	    
		return resultado;
	}
	*/
	
	@Override
	public void registrarParticipacionPerQuec(VisionPersonaQuec visionPersonaQuec) {
		
		Quote quote = restTemplate.getForObject(
				"https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		
		Quote quote1 = restTemplate.getForObject(
				"https://gturnquist-quoters.cfapps.io/api/random", Quote.class);

		String resultado1 = quote.getValue().getQuote();
		String resultado2 = quote1.getValue().getQuote();
		
		iVisionPersonaQuecDAO.registrarParticipacionPerQuec(
				visionPersonaQuec.getGrupoEdad(),
				visionPersonaQuec.getSexo(),
				visionPersonaQuec.getIdioma(),
				visionPersonaQuec.getDepartamento(),
				visionPersonaQuec.getProvincia(),
				visionPersonaQuec.getDistrito(),
				visionPersonaQuec.getLatitud(),
				visionPersonaQuec.getLongitud(),
				resultado1,
				resultado2,
				visionPersonaQuec.getFile_categoria()
				);
	}

}

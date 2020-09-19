package com.tumi.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

import com.tumi.dto.VisionGrupo;
import com.tumi.service.VisionGrupoServiceImpl;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/vgrupo")
public class VisionGrupoController {

    @Autowired
    VisionGrupoServiceImpl visionGrupoServiceImpl;	
	
    @PostMapping("/registrar")
    public String registrarParticipacionGrupo(@RequestBody VisionGrupo visionGrupo){
    	return visionGrupoServiceImpl.registrarParticipacionGrupo(visionGrupo);
    }
	
	
    @PostMapping("/descargar")
    public String registrarParticipacionGrupo(@RequestParam("file") MultipartFile file,
								    		HttpServletResponse response){
    	visionGrupoServiceImpl.almacenarDescarga(file);
        response.setStatus(HttpServletResponse.SC_OK);
        return "OK";
    }
    
    @PostMapping("/adjuntar")
    public String registrarAdjunto(@RequestParam("file") MultipartFile file,
    										@RequestParam("code") String code,
								    		HttpServletResponse response){
    	visionGrupoServiceImpl.registrarAdjunto(file, code);
        response.setStatus(HttpServletResponse.SC_OK);
        return "OK";
    }
		  
	
	
}

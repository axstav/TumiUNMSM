package com.tumi.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.tumi.dao.IVisionGrupoDAO;
import com.tumi.dto.VisionGrupo;

@Service
public class VisionGrupoServiceImpl implements IVisionGrupoService {

	@Autowired
	IVisionGrupoDAO ivisionGrupoDAO;
	
    public int registrarParticipacionGrupo(VisionGrupo visionGrupo) {
    	return ivisionGrupoDAO.registrarParticipacionGrupo(
					visionGrupo.getNombInstitucion(), 
					visionGrupo.getTipoInstitucion(),
					visionGrupo.getSectorEconomico(), 
					visionGrupo.getCategoria(), 
					visionGrupo.getLatitud(), 
					visionGrupo.getLongitud(), 
					visionGrupo.getVision(), 
					visionGrupo.getConcepto(),
					visionGrupo.getAdjunto());
    }	
	
	
}

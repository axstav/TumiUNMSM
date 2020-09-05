package com.tumi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tumi.dao.IVisionPersonaQuecDAO;
import com.tumi.dto.VisionPersonaQuec;


@Service
public class VisionPersonaQuecServiceImpl implements IVisionPersonaQuecService {
	
	@Autowired
	IVisionPersonaQuecDAO iVisionPersonaQuecDAO;

	@Override
	public void registrarParticipacionPerQuec(VisionPersonaQuec visionPersonaQuec) {
				
		iVisionPersonaQuecDAO.registrarParticipacionPerQuec(
				visionPersonaQuec.getGrupoEdad(),
				visionPersonaQuec.getSexo(),
				visionPersonaQuec.getIdioma(),
				visionPersonaQuec.getDepartamento(),
				visionPersonaQuec.getProvincia(),
				visionPersonaQuec.getDistrito(),
				visionPersonaQuec.getLatitud(),
				visionPersonaQuec.getLongitud(),
				visionPersonaQuec.getVision(),
				visionPersonaQuec.getConcepto(),
				visionPersonaQuec.getCategoria()
				);
	}

}

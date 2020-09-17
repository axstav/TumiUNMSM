package com.tumi.service;

import org.springframework.web.multipart.MultipartFile;

import com.tumi.dto.VisionGrupo;

public interface IVisionGrupoService {
	public String registrarParticipacionGrupo(VisionGrupo visionGrupo);
	public void almacenarDescarga(MultipartFile file);
	public void registrarAdjunto(MultipartFile file,String code);
}

package com.tumi.service;

import java.util.List;
import com.tumi.dto.ResultadoList;

public interface IUtilService {

	public List<ResultadoList> getListaDepartamentos();
	public List<ResultadoList> getListaProvincias(String pdepartamento);
	public List<ResultadoList> getListaDistritos(String pprovincia,String pdepartamento);
	public List<ResultadoList> getListaGrupoEdad();
}

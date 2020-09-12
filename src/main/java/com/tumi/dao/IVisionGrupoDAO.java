package com.tumi.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.tumi.dto.VisionGrupo;

public interface IVisionGrupoDAO extends JpaRepository<VisionGrupo,String> {

	@Transactional
	@Modifying
	@Query(value = "{call sp_registrar_grupo(:pnombInstitucion,:ptipoInstitucion,:psectorEconomico,:pcategoria,:platitud,:plongitud,:pvision,:pconcepto,:padjunto)}", nativeQuery = true)
	public int registrarParticipacionGrupo(
			@Param("pnombInstitucion") String pnombInstitucion,
			@Param("ptipoInstitucion") String ptipoInstitucion,
			@Param("psectorEconomico") String psectorEconomico,
			@Param("pcategoria") String pcategoria,
			@Param("platitud") BigDecimal platitud,
			@Param("plongitud") BigDecimal plongitud,
			@Param("pvision") String pvision,
			@Param("pconcepto") String pconcepto,
			@Param("padjunto") byte[] padjunto
	);	
	
}

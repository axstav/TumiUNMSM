package com.tumi.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.tumi.dto.VisionPersonaQuec;

public interface IVisionPersonaQuecDAO extends JpaRepository<VisionPersonaQuec, String> {

	@Transactional
	@Modifying
	@Query(value = "{call sp_registrar_personaQuec(:pgrupoEdad,:psexo,:pidioma,:pdepartamento,:pprovincia,:pdistrito,:platitud,:plongitud,:pfile_vision,:pfile_concepto,:pcategoria)}", nativeQuery = true)
	public void registrarParticipacionPerQuec(
			@Param("pgrupoEdad") String pgrupoEdad,
			@Param("psexo") String psexo,
			@Param("pidioma") String pidioma,
			@Param("pdepartamento") String pdepartamento,
			@Param("pprovincia") String pprovincia,
			@Param("pdistrito") String pdistrito,
			@Param("platitud") BigDecimal platitud,
			@Param("plongitud") BigDecimal plongitud,
			@Param("pfile_vision") String pfile_vision,
			@Param("pfile_concepto") String pfile_concepto,
			@Param("pcategoria") String pcategoria
	);
		
}

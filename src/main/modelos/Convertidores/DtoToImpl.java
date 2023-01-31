package main.modelos.Convertidores;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import main.modelos.DAL.Alumno.Alumno;
import main.modelos.DAL.Portatil.Portatil;
import main.modelos.DTOs.AlumnoDTO;
import main.modelos.DTOs.PortatilDTO;

public class DtoToImpl implements DtoToService {

	Calendar fecha = Calendar.getInstance();
	UUID mdUuid = UUID.randomUUID();

	@Override
	public Portatil portatilDtoToDao(PortatilDTO dto) {
		Portatil p = new Portatil();

		p.setAlumnoAsignado(alumnoDtoToDao(dto.getAlumnoAsignado()));
		p.setCodPortatil(dto.getCodPortatil());
		p.setMarca(dto.getMarcaPortatil());
		p.setMdDate(fecha);
		p.setMdUuid(mdUuid.toString());
		p.setModelo(dto.getModeloPortatil());

		return p;
	}

	@Override
	public ArrayList<Portatil> listPortatilDtoToDao(ArrayList<PortatilDTO> listDto) {

		ArrayList<Portatil> listDaos = new ArrayList<Portatil>();

		for (PortatilDTO dto : listDto) {
			listDaos.add(portatilDtoToDao(dto));
		}

		return listDaos;
	}

	@Override
	public Alumno alumnoDtoToDao(AlumnoDTO dto) {

		Alumno a = new Alumno();

		a.setMdDate(fecha);
		a.setMdUuid(mdUuid.toString());
		a.setNombreCompleto(dto.getNombreCompleto());
		a.setNumTlf(dto.getNumTlf());
		a.setPortatilAsignado(portatilDtoToDao(dto.getPortatilAsignado()));

		return a;
	}

	@Override
	public ArrayList<Alumno> listAlumnoDtoToDao(ArrayList<AlumnoDTO> listDto) {

		ArrayList<Alumno> listDaos = new ArrayList<Alumno>();

		for (AlumnoDTO dto : listDto) {
			listDaos.add(alumnoDtoToDao(dto));
		}

		return listDaos;
	}

}

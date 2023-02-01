package main.modelos.Convertidores;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import main.modelos.DAL.Alumno.Alumno;
import main.modelos.DAL.Portatil.Portatil;
import main.modelos.DTOs.AlumnoDTO;
import main.modelos.DTOs.PortatilDTO;

@Component
public class ToDtoImpl implements ToDtoService {

	@Override
	public AlumnoDTO alumnoToDto(Alumno dao) {
		AlumnoDTO dto = new AlumnoDTO();

		dto.setCodAlumno(dao.getCodAlumno());
		dto.setNombreCompleto(dao.getNombreCompleto());
		dto.setNumTlf(dao.getNumTlf());
		dto.setPortatilAsignado(portatilToDto(dao.getPortatilAsignado()));

		return dto;
	}

	@Override
	public ArrayList<AlumnoDTO> listAlumnoToDto(ArrayList<Alumno> listDao) {

		ArrayList<AlumnoDTO> listDto = new ArrayList<AlumnoDTO>();

		for (Alumno alumno : listDao) {
			listDto.add(alumnoToDto(alumno));
		}

		return listDto;
	}

	@Override
	public PortatilDTO portatilToDto(Portatil dao) {

		PortatilDTO dto = new PortatilDTO();

		dto.setAlumnoAsignado(alumnoToDto(dao.getAlumnoAsignado()));
		dto.setCodPortatil(dao.getCodPortatil());
		dto.setMarcaPortatil(dao.getMarca());
		dto.setModeloPortatil(dao.getModelo());

		return dto;
	}

	@Override
	public ArrayList<PortatilDTO> listPortatilToDto(ArrayList<Portatil> listDao) {

		ArrayList<PortatilDTO> listDto = new ArrayList<PortatilDTO>();

		for (Portatil portatil : listDao) {
			listDto.add(portatilToDto(portatil));
		}

		return listDto;
	}

}

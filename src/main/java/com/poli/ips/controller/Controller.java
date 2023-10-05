package com.poli.ips.controller;

import com.poli.ips.model.dto.CitasDTO;
import com.poli.ips.model.dto.DoctorDTO;
import com.poli.ips.model.dto.PersonaDTO;
import com.poli.ips.model.entity.Cita;
import com.poli.ips.model.entity.Doctor;
import com.poli.ips.model.entity.Persona;
import com.poli.ips.service.IIpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "http://localhost:3000/")
public class Controller {

    @Autowired
    private IIpsService service;

    @PostMapping("save/cita")
    public CitasDTO createCita(@RequestBody Cita cita) {
        return service.createCitas(cita);
    }
    @PostMapping("save/doctor")
    public DoctorDTO createDoctor(@RequestBody Doctor doctor) {
        return service.createDoctor(doctor);
    }
    @PostMapping("save/persona")
    public PersonaDTO createPersona(@RequestBody Persona persona) {
        return service.createPersona(persona);
    }

    @PutMapping("update/cita")
    public CitasDTO updateCita(@RequestBody Cita cita) {
        return service.updateCitas(cita);
    }

    @DeleteMapping("delete/persona/{id}")
    public void deletePersona(@PathVariable int id) {
        service.deletePersona(id);
    }

    @DeleteMapping("delete/cita/{id}")
    public void deleteCita(@PathVariable int id) {
        service.deleteCita(id);
    }

    @GetMapping("get/citas")
    public List<CitasDTO> getAllCitas() {
        return service.findAllCitas();
    }

    @GetMapping("get/personas")
    public List<PersonaDTO> getAllPersonas() {
        return service.findAllPersonas();
    }

    @GetMapping("get/doctores")
    public List<DoctorDTO> getAllDoctores() {
        return service.findAllDoctores();
    }

    @GetMapping("get/citas/{id}")
    public CitasDTO getCita(@PathVariable int id) {
        return service.findCita(id);
    }

    @GetMapping("get/personas/{id}")
    public PersonaDTO getPersona(@PathVariable int id) {
        return service.findPersona(id);
    }


}

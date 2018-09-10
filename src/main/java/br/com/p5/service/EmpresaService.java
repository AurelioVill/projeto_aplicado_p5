/**
 * 
 */
package br.com.p5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.p5.model.Empresa;
import br.com.p5.repository.EmpresaRepository;

/**
 * @author carlosbarbosagomesfilho
 *
 */

@Service
public class EmpresaService {

	@Autowired
	private EmpresaRepository respository;
	
	
	@Transactional
	public void save(Empresa empresa) {
		this.respository.save(empresa);
	}
	
	@Transactional(readOnly=true)
	public Iterable<Empresa> list(){
		return this.respository.findAll();
	}
	
	@Transactional(readOnly=true)
	public Optional<Empresa> getById(Empresa empresa) {
		return this.respository.findById(empresa.getId());
	}
	
	@Transactional
	public void delete(Empresa empresa) {
		this.respository.delete(empresa);
	}
}

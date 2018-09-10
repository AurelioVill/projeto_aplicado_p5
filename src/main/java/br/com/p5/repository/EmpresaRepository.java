/**
 * 
 */
package br.com.p5.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.p5.model.Empresa;

/**
 * @author carlosbarbosagomesfilho
 *
 */

@Repository
public interface EmpresaRepository extends CrudRepository<Empresa, Long> {

}

/**
 * 
 */
package br.com.p5.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author carlosbarbosagomesfilho
 *
 */

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode(of= {"id"})
@Entity
@Table(name="tb_empresa")
public class Empresa implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String cnpj;
	
	@Column
	private String nome;
	
	@Column(name="razao_social")
	private String razaoSocial;
	
}

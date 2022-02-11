package br.com.pcdevs.projeto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_clientes")
	public class Cliente {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int codigoInterno;
	
		@Column(name="nome",length=100)
		private String nome;

		@Column(name="cpf", length=14)
		private String cpf;

		@Column(name="telefone", length=15)
		private String telefone;

		@Column(name="email", length=100)
		private String email;

		public int getCodigoInterno() {
			return codigoInterno;
		}

		public void setCodigoInterno(int codigoInterno) {
			this.codigoInterno = codigoInterno;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
}

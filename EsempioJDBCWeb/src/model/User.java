package model;

public class User {

		private int id;
		private String nome;
		private String email;
		private String citta;

		public User (String nome, String email, String citta) {
			super();
			this.nome = nome;
			this.email = email;
			this.citta = citta;
		}

		public User(int id, String nome, String email, String citta) {
			super();
			this.id = id;
			this.nome = nome;
			this.email = email;
			this.citta = citta;
		}

		public int getId() {
			return id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getCitta() {
			return citta;
		}

		public void setCitta(String citta) {
			this.citta = citta;
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", nome=" + nome + ", email=" + email + ", citta=" + citta + "]";
		}

		
		
		
		
		
	}


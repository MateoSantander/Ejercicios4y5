//Modelo de la clase identidad, pero al final no lo he utilizado. Aún así lo dejo incluido como parte de la práctica



package modelo.entidad;

public class identidad {
		private String username;
		private String password;
		
		public identidad() {
			super();
		}
		
		public identidad(String user, String password) {
			this.username = user;
			this.password = password;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
}
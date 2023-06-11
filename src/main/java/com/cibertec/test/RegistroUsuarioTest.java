package com.cibertec.test;

import com.cibertec.dao.UsuarioDao;
import com.cibertec.dao.impl.UsuarioDaoImpl;
import com.cibertec.model.Usuario;

public class RegistroUsuarioTest {

	public static void main(String[] args) {
		
		UsuarioDao dao = new UsuarioDaoImpl();
		Usuario usuario = new Usuario("Pedro", "123456", 1);
		String mensaje = dao.registrarUsuario(usuario);
		System.out.println(mensaje);
	}

}

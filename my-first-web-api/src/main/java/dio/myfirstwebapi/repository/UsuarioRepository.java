package dio.myfirstwebapi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.myfirstwebapi.handler.BusinessException;
import dio.myfirstwebapi.handler.CampoObrigatorioException;
import dio.myfirstwebapi.model.Usuario;

@Repository
public class UsuarioRepository {
	
	public void save(Usuario usuario) {
		if(usuario.getLogin()== null)
			throw new CampoObrigatorioException("Login");
		
		if(usuario.getPassword()== null)
			throw new CampoObrigatorioException("Password");
		
		if(usuario.getId()== null)
		System.out.println("SAVE - Recebendo um usuário na camada do repositório");
		else
			System.out.println("UPDATE - Recebendo um usuário na camada do repositório");
		System.out.println(usuario);
	}
	public void update(Usuario usuario) {
		System.out.println("UPDATE - Recebendo um usuário na camada do repositório");
		System.out.println(usuario);
	}
	public void remove(Integer id) {
		System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário",id));
		System.out.println(id);
	}
	
	public List<Usuario> listAll(){
		List<Usuario> usuarios = new ArrayList<>();
		  usuarios.add(new Usuario(null, "gleyson","password"));
	        usuarios.add(new Usuario(null, "frank","masterpass"));
	        return usuarios;
		};
		
		public Usuario findById(Integer id) {
			
			System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
	        return new Usuario(id, "gleyson","password");
		}
	public Usuario findByUsername(String username) {
			
			System.out.println(String.format("FIND/username - Recebendo o id: %d para localizar um usuário", username));
	        return new Usuario( null, "gleyson","password");
		}
		
	}



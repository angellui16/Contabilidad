package Bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.mysql.jdbc.Connection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@ManagedBean
@SessionScoped
public class cliente {
/*private	List<modelos.cliente> listaClients = new ArrayList<modelos.cliente>();
private modelos.cliente selection = null;
private modelos.cliente modificar = new modelos.cliente();
private modelos.cliente insertar = new modelos.cliente();
	
	public modelos.cliente getInsertar() {
	return insertar;
}


public void setInsertar(modelos.cliente insertar) {
	this.insertar = insertar;
}


	public void llenaClientes()
	{
		 Connection conexion;
		 String bd="biblioteca";
		 String user="root";
		 String password="admin";
		 String server="jdbc:mysql://localhost/"+bd;
		List<modelos.cliente> listaClientes = new ArrayList<modelos.cliente>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conexion = (Connection) DriverManager.getConnection(server,user,password);
			System.out.println("conecto correctamente");
			
			
			 String query = "SELECT * FROM cliente";
			 
		      // create the java statement
		      Statement st = conexion.createStatement();
		       
		      // execute the query, and get a java resultset
		      ResultSet rs = st.executeQuery(query);
		      
		    
		      // iterate through the java resultset
		     List<modelos.cliente> contenedor = new ArrayList<modelos.cliente>();
		     listaClients = new ArrayList<modelos.cliente>();
		      while (rs.next())
		      {
		    	  modelos.cliente  client = new modelos.cliente();
		        client.setCodigo(rs.getInt("codigo_cliente")) ;
		        client.setPrimerNombre(rs.getString("primerNombre"));  
		        client.setSegundoNombre(rs.getString("segundoNombre"));
		        client.setPrimerApellido(rs.getString("primerApellido"));
		        client.setSegundoApellido(rs.getString("segundoApellido"));
		        client.setDireccion(rs.getString("direccion"));
		        client.setStatus(rs.getString("Activo"));
		        // print the results
		        contenedor.add(client);
		      }
		      st.close();
			 listaClients = contenedor;
			
			}
			catch(Exception e){
			System.out.println("Imposible realizar conexion con la BD");
			e.printStackTrace();
			}
	}
	
	
	public void actualizar()
	{
		 Connection conexion;
		 String bd="biblioteca";
		 String user="root";
		 String password="admin";
		 String server="jdbc:mysql://localhost/"+bd;
		 Statement stmt = null;
		List<modelos.cliente> listaClientes = new ArrayList<modelos.cliente>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conexion = (Connection) DriverManager.getConnection(server,user,password);
			System.out.println("conecto correctamente");
			
			
			 stmt = conexion.createStatement();
			 if(selection!=null)
			 {
			 if(modificar.getPrimerApellido().equals(""))
			 {
				 String sql = "UPDATE cliente " +
		                   "SET primerNombre='"+modificar.getPrimerNombre()+"' where codigo_cliente="+selection.getCodigo();
		      stmt.executeUpdate(sql);
		      stmt.close();
		      llenaClientes();
			 }
			 }
			 else
			 {
				 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error", "Debe de seleccionar una fila"));
			 }
			
			
			}
			catch(Exception e){
			System.out.println("Imposible realizar conexion con la BD");
			e.printStackTrace();
			}
	}
	
	
	
	public void insertarCliente()
	{
		 Connection conexion;
		 String bd="biblioteca";
		 String user="root";
		 String password="admin";
		 String server="jdbc:mysql://localhost/"+bd;
		 Statement stmt = null;
		List<modelos.cliente> listaClientes = new ArrayList<modelos.cliente>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conexion = (Connection) DriverManager.getConnection(server,user,password);
			System.out.println("conecto correctamente");
			
			
			 stmt = conexion.createStatement();
			
			
				 String sql = "insert into cliente values(null,'"+insertar.getPrimerNombre()+"','"+insertar.getSegundoNombre()+"','"+insertar.getPrimerApellido()+"','"+insertar.getSegundoApellido()+"','"+insertar.getDireccion()+"','0')";
		                   
		      stmt.executeUpdate(sql);
		      stmt.close();
		      llenaClientes();
			 
			 else
			 {
				 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error", "Debe de seleccionar una fila"));
			 }
			
			
			}
			catch(Exception e){
			System.out.println("Imposible realizar conexion con la BD");
			e.printStackTrace();
			}
	}
	
	public void prueba()
	{
		System.out.println("llego");
	}

	public List<modelos.cliente> getListaClients() {
		return listaClients;
	}

	public void setListaClients(List<modelos.cliente> listaClients) {
		this.listaClients = listaClients;
	}

	public modelos.cliente getSelection() {
		return selection;
	}

	public void setSelection(modelos.cliente selection) {
		this.selection = selection;
	}


	public modelos.cliente getModificar() {
		return modificar;
	}


	public void setModificar(modelos.cliente modificar) {
		this.modificar = modificar;
	}
*/	
}

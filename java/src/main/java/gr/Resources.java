package gr;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class Resources {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String get(){
        DockerConnectMySQL dockerConnectMySQL = new DockerConnectMySQL();
        return dockerConnectMySQL.getValuesFromDatabase().toString();
    }
}

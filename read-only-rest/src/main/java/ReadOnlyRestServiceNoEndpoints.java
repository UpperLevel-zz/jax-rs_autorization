import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/noendpoints")
public class ReadOnlyRestServiceNoEndpoints {

    @GET
    public Response browse() {
        return Response.ok().build();
    }

    @GET
    public Response read() {
        return Response.ok().build();
    }

}

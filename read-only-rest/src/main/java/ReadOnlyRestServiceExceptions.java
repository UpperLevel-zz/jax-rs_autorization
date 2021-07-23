import javax.annotation.security.RolesAllowed;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/exception")
public class ReadOnlyRestServiceExceptions {

    @GET
    @RolesAllowed("USER")
    public Response browse() {
        return Response.ok().build();
    }

    @GET
    @RolesAllowed("USER")
    public Response read() {
        return Response.ok().build();
    }

    @POST
    public Response add() {
        throw new UnsupportedOperationException("This service has read only access");
    }

    @POST
    public Response edit() {
        throw new UnsupportedOperationException("This service has read only access");
    }

    @DELETE
    public Response delete() {
        throw new UnsupportedOperationException("This service has read only access");
    }

}
